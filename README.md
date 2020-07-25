# autocomplete-fall19

Implemented classes within an Autocompleter interface and designed efficient methods which sorted and displayed autocomplete search recommendations


TL;DR Overview of Programming
Given a main program, AutocompleteMain that launches a GUI supporting queries. 
Given one implementation of the Autocompletor interface, BruteAutocomplete, that examines every term to respond to a search query.


This Program will: 
Implement the Term class used in all Autocompletor implementations. 
Test this by running TestTerm and verify results by running the main program.
Implement BinarySearchAutocomplete that extends Autocompletor. This requires implementing two methods in BinarySearchLibrary.
There are two Test programs, one for each of these files, run them both and verify results by running the main program with this new class.
Implement HashListAutocomplete that extends Autocompletor.
Test by verifying output compared to other implementations by running the main program.




ANALYSIS OF OUTPUTS:

Run the program BenchmarkForAutocomplete and copy/paste the results into the analysis.txt file in the appropriate location. You'll need to run three times, once for each of the files in the Benchmark program: threeletterwords.txt, fourletterwords.txt, and alexa.txt. On ola's computer the first few lines are what's shown below for "data/threeletterwords.txt". The unlabeled "search" is for an empty string "" which matches every string stored. These numbers are for a file of every three letter word "aaa, "aab", … "zzy", "zzz", not actual words, but 3-character strings.
Threeletterwords.txt: 
init time: 0.009115	for BruteAutocomplete
init time: 0.009379	for BinarySearchAutocomplete
init time: 0.1769	for HashListAutocomplete
search	size	#match	BruteAutoc	BinarySear	HashListAu
	17576	50	0.01236158	0.01774894	0.00052282
	17576	50	0.00116100	0.00667610	0.00001126
a	676	50	0.00067498	0.04881057	0.00000801
a	676	50	0.00070779	0.00185366	0.00000914
b	676	50	0.00061920	0.00072426	0.00000938
c	676	50	0.00064104	0.00072219	0.00000961
g	676	50	0.00178331	0.00079629	0.00001053
ga	26	50	0.00079676	0.00079977	0.00002219
go	26	50	0.00052244	0.00045864	0.00002710
gu	26	50	0.00034363	0.00027242	0.00001051
x	676	50	0.00063399	0.00054106	0.00000841
y	676	50	0.00038045	0.00043727	0.00001154
z	676	50	0.00081076	0.00046150	0.00000856
aa	26	50	0.00033900	0.00011586	0.00000664
az	26	50	0.00037669	0.00019435	0.00001155
za	26	50	0.00053502	0.00008720	0.00000886
zz	26	50	0.00031633	0.00005393	0.00000697
zqzqwwx	0	50	0.00050428	0.00007858	0.00000359
size in bytes=246064	 for BruteAutocomplete
size in bytes=246064	 for BinarySearchAutocomplete
size in bytes=1092468	 for HashListAutocomplete

Fourletterwords.txt:
init time: 0.1569	for BruteAutocomplete
init time: 0.1005	for BinarySearchAutocomplete
init time: 1.550	for HashListAutocomplete
search	size	#match	BruteAutoc	BinarySear	HashListAu
	456976	50	0.01902843	0.03879310	0.00050125
	456976	50	0.00578812	0.00569349	0.00000918
a	17576	50	0.01214393	0.03858492	0.00000667
a	17576	50	0.00833100	0.00077098	0.00000838
b	17576	50	0.00774722	0.00100717	0.00000882
c	17576	50	0.00799814	0.00088840	0.00001111
g	17576	50	0.00731327	0.00098451	0.00000966
ga	676	50	0.00391044	0.00049329	0.00000714
go	676	50	0.00643503	0.00058334	0.00000947
gu	676	50	0.00680750	0.00034977	0.00000957
x	17576	50	0.00432484	0.00071345	0.00000780
y	17576	50	0.00489017	0.00052350	0.00000769
z	17576	50	0.00395040	0.00032894	0.00000810
aa	676	50	0.01392340	0.00038137	0.00001846
az	676	50	0.01260976	0.00042980	0.00001769
za	676	50	0.01147392	0.00039446	0.00002082
zz	676	50	0.01326715	0.00037003	0.00001851
zqzqwwx	0	50	0.02884828	0.00056416	0.00000851
size in bytes=7311616	 for BruteAutocomplete
size in bytes=7311616	 for BinarySearchAutocomplete
size in bytes=40322100	 for HashListAutocomplete

alexa.txt:
init time: 0.4658for BruteAutocomplete
init time: 1.945	for BinarySearchAutocomplete
init time: 17.92	for HashListAutocomplete
search	size	#match	BruteAutoc	BinarySear	HashListAu
	1000000	50	0.03307191	0.11920687	0.00057712
	1000000	50	0.01754581	0.09255797	0.00001289
a	69464	50	0.02698550	0.04442825	0.00001402
a	69464	50	0.01496270	0.00574352	0.00001254
b	56037	50	0.01514029	0.00451210	0.00001202
c	65842	50	0.01565621	0.00528521	0.00001237
g	37792	50	0.01392687	0.00350202	0.00001313
ga	6664	50	0.01377899	0.00152320	0.00000844
go	6953	50	0.01274848	0.00170037	0.00001246
gu	2782	50	0.01824977	0.00064335	0.00000880
x	6717	50	0.01645286	0.00071588	0.00000793
y	16765	50	0.01502756	0.00139563	0.00000890
z	8780	50	0.01289681	0.00079079	0.00000900
aa	718	50	0.01433658	0.00024094	0.00000901
az	889	50	0.01352496	0.00021659	0.00000845
za	1718	50	0.01449978	0.00031945	0.00000809
zz	162	50	0.01271928	0.00013670	0.00000765
zqzqwwx	0	50	0.01401947	0.00023993	0.00000364
size in bytes=38204230	 for BruteAutocomplete
size in bytes=38204230	 for BinarySearchAutocomplete
size in bytes=475893648	 for HashListAutocomplete

Process finished with exit code 0

Run the program again for alexa.txt with  #matches = 10000, paste the results, and then explain to what extent the # matches affects the runtime. The # matches, matchSize, is specified in the method runAM (for run all matches)

init time: 0.6303	for BruteAutocomplete
init time: 1.887	for BinarySearchAutocomplete
init time: 15.94	for HashListAutocomplete
search	size	#match	BruteAutoc	BinarySear	HashListAu
	1000000	1000	0.04291115	0.13225303	0.00043657
	1000000	1000	0.02725680	0.10529428	0.00001299
a	69464	1000	0.02307856	0.04747523	0.00001295
a	69464	1000	0.02251380	0.00850797	0.00001199
b	56037	1000	0.02356908	0.00832604	0.00001285
c	65842	1000	0.02364511	0.00898467	0.00001459
g	37792	1000	0.02453871	0.00555392	0.00001104
ga	6664	1000	0.02354845	0.00421326	0.00001038
go	6953	1000	0.02284391	0.00260535	0.00000899
gu	2782	1000	0.02594132	0.00157182	0.00000878
x	6717	1000	0.02225286	0.00251685	0.00000930
y	16765	1000	0.02433274	0.00441088	0.00001174
z	8780	1000	0.02269759	0.00270831	0.00000999
aa	718	1000	0.02619036	0.00061788	0.00000980
az	889	1000	0.02287247	0.00075311	0.00000828
za	1718	1000	0.02562684	0.00118212	0.00000941
zz	162	1000	0.02261990	0.00022137	0.00001019
zqzqwwx	0	1000	0.02342742	0.00028432	0.00000397
size in bytes=38204230	 for BruteAutocomplete
size in bytes=38204230	 for BinarySearchAutocomplete
size in bytes=475893648	 for HashListAutocomplete

The run times increased with 1000 matches. The run times approximately doubled with doubling the # of matches (a little less than doubled).


Explain why the last for loop in BruteAutocomplete.topMatches uses a LinkedList (and not an ArrayList) AND why the PriorityQueue uses Comparator.comparing(Term::getWeight) to get the top k heaviest matches.
In BruteAutocomplete.topMatches, in order to have a more efficient code, a linkedlist is used. By utilizing a linkedlist, terms are added to the beginning of the list (instead of shifting the entire list as would be needed if an Arraylist was used).

In order to sort the queue by weights and remove the smallest element, the PriorityQueue must use weight order. This PriorityQueue is now sorting terms in reverse order (to allow the smallest to come out first). The use of a comparator allows for the PriorityQueue to be sorted as desired.

Explain why HashListAutocomplete uses more memory than the other Autocomplete implementations. Be brief.

HashListAutocomplete uses more memory then Autocomplete implementations since HashListAutocomplete creates new storage for each new prefix added into the map in the initializes method. 
