import java.util.Vector;
public class TestLab3<V extends Comparable>{
    
    public static void main(String[] args){
	
	CountingDictionary dict = new CountingDictionary();
	ReadFile hm = new ReadFile("TextFile1.txt");
	hm.addFileToDict(dict);	
	Vector<Word> v = new Vector<Word>();
	v = dict.allKeyValue();

	
	PriorityQueue min = new PriorityQueue();
	min.initMin();
	System.out.println("MinQueue INITIALIZED");
	min.build(v);
	System.out.println("MinQueue BUILT");
	Word[] leastCommon = new Word[10];
	for(int j = 0; j < 10; j++){
	    leastCommon[j] = (Word)min.remove();
	}

	System.out.println("LeastCommon FILLED");
	
	PriorityQueue max = new PriorityQueue();
	max.initMax();
	System.out.println("MaxQueue INITIALIZED");
	max.build(v);
	System.out.println("MaxQueue BUILT");
	Word[] mostCommon = new Word[10];
	for(int k = 0; k < 10; k++){
	    mostCommon[k] = (Word)max.remove();
	}

	System.out.println("MostCommon FILLED");
	System.out.println();
	System.out.println("Least Common Words: ");
	for(int m = 0; m < 10; m++){
	    System.out.println(leastCommon[m].toString());
	}
	System.out.println();
	System.out.println("Most Common Words: ");
        for(int n = 0; n < 10; n++){
            System.out.println(mostCommon[n].toString());
	}
	System.out.println();
	
	//
	Vector<Word> ve = new Vector<Word>();
	CountingDictionary commonWords = new CountingDictionary();
	ReadFile CommonWords = new ReadFile("CommonWords.txt");
	CommonWords.addFileToDict(commonWords);
	CountingDictionary text2 = new CountingDictionary();
	ReadFile Text2  = new ReadFile("TextFile1.txt");
	Text2.addFileToDict(text2, commonWords);
	
	ve = commonWords.allKeyValue();
	for(int i = 0; i < v.size(); i++){
	    System.out.println(v.elementAt(i));
        }
	//
	
	
    }// main

}// TestLab3