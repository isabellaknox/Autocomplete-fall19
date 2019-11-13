import java.util.*;

/**
 *
 * Using a sorted array of Term objects, this implementation uses binary search
 * to find the top term(s).
 *
 * @author Austin Lu, adapted from Kevin Wayne
 * @author Jeff Forbes
 * @author Owen Astrachan in Fall 2018, revised API
 */
public class HashListAutocomplete implements Autocompletor {

    private static final int MAX_PREFIX = 10;
    private Map<String, List<Term>> myMap;
    private Term[] myTerms;
    private int mySize;


    /**
     * Create immutable instance with terms constructed from parameter
     *
     * @param terms   words such that terms[k] is part of a word pair 0 <= k < terms.length
     * @param weights weights such that weights[k] corresponds to terms[k]
     * @throws NullPointerException     if either parameter is null
     * @throws IllegalArgumentException if terms.length != weights.length
     * @throws IllegalArgumentException if any elements of weights is negative
     * @throws IllegalArgumentException if any elements of terms is duplicate
     */
    public HashListAutocomplete(String[] terms, double[] weights) {

        if (terms == null || weights == null) {
            throw new NullPointerException("One or more arguments null");
        }

        if (terms.length != weights.length) {
            throw new IllegalArgumentException("terms and weights are not the same length");
        }
        initialize(terms, weights);
    }


    @Override
    public List<Term> topMatches(String prefix, int k) {
        if (myMap.containsKey(prefix)) { //check for key in map
            List<Term> all = myMap.get(prefix);
            List<Term> list = all.subList(0, Math.min(k, all.size()));
            return list;
        }

        return new ArrayList<Term>(); //if key not in map
    }

    @Override
    public void initialize(String[] terms, double[] weights) {
        myMap = new HashMap<String, List<Term>>();
        for (int i = 0; i < terms.length; i++) { // terms
            for (int j = 0; j < Math.min(terms[i].length(), MAX_PREFIX) + 1; j++) { // characters in each term
                String prefixx = terms[i].substring(0, j);
                Term curr = new Term(terms[i], weights[i]);
                myMap.putIfAbsent(prefixx, new ArrayList<>()); //add to map
                myMap.get(prefixx).add(curr); // assign values to curr
            }
        }
        for (String n : myMap.keySet()) {
            Collections.sort(myMap.get(n), Comparator.comparing(Term::getWeight).reversed()); // sort every value in map
        }
    }



    @Override
    public int sizeInBytes() {
        if (mySize == 0) {
            for (String m : myMap.keySet()) {
                mySize += BYTES_PER_CHAR * m.length();
                List<Term> term = myMap.get(m);
                for (Term t : myTerms) {
                    mySize += BYTES_PER_DOUBLE +
                            BYTES_PER_CHAR * t.getWord().length();
                }
            }
        }

        return mySize;
        }
    }
