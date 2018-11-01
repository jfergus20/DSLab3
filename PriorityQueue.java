import java.util.Vector;

public class PriorityQueue<V extends Comparable> implements CS211PriorityQueueInterface<V>{
    
    private boolean min = true;
    
    public PriorityQueue(){
    }
    
    private Vector<V> theQueue;
    
    public void initMin(){
	theQueue = new Vector<V>();
	theQueue.insertElementAt(null, 0);
    }
    
    public void initMax(){
	min = false;
	theQueue = new Vector<V>();
	theQueue.insertElementAt(null, 0);
    }
    
    public void insert(V w){
	
	theQueue.add(w);
	
    }
    
    public V peek(){
	return theQueue.elementAt(1);
    }
    
    public V remove(){
	
	V toReturn = theQueue.elementAt(1);
	theQueue.removeElementAt(1);
	if(min){
	    sortMin();
	}else{
	    sortMax();
	}
	return toReturn;
	
    }

    public void build(Vector<V> words){

	for(int h = 0; h < words.size()-1; h++){
	    theQueue.insertElementAt(words.elementAt(h), h+1);
	}
	
	if(min){
            sortMin();
	    //	    for(int g = 1; g < theQueue.size()-1; g++){
	    //	System.out.println(theQueue.elementAt(g).toString());
	    // }
        }else{
            sortMax();
	    // for(int f = 1; f < theQueue.size()-1; f++){
	    //  System.out.println(theQueue.elementAt(f).toString());
	    // }   
	}	
	System.out.println("BUILD COMPLETE");
	
    }
    
    public boolean isEmpty(){
	return theQueue.isEmpty();
    }
    
    public void sortMin(){
	int minSize = theQueue.size();
	for(int i = (minSize-1)/2; i > 0; i--){
	    V duff;
	    if((2*i+1) < minSize){
		if(theQueue.elementAt(2*i).compareTo(theQueue.elementAt(2*i+1)) <= 0){
		    if((theQueue.elementAt(2*i).compareTo(theQueue.elementAt(i)) < 0)){
			// swap 2i and i
			duff = theQueue.elementAt(2*i);
			theQueue.setElementAt(theQueue.elementAt(i), 2*i);
			theQueue.setElementAt(duff, i); 
			sortMin();      
		    }
		}else{
		    if(theQueue.elementAt(2*i+1).compareTo(theQueue.elementAt(i)) < 0){
			// swap 2i and i                                                                                                                                       
                        duff = theQueue.elementAt(2*i+1);
                        theQueue.setElementAt(theQueue.elementAt(i), 2*i+1);
                        theQueue.setElementAt(duff, i);
			sortMin();
		    }
		}
	    }else{
		if((theQueue.elementAt(2*i).compareTo(theQueue.elementAt(i)) < 0)){
		    // swap 2i and i                                                                                                                                                                                                      
		    duff = theQueue.elementAt(2*i);
		    theQueue.setElementAt(theQueue.elementAt(i), 2*i);
		    theQueue.setElementAt(duff, i);
		    sortMin();
		}
	    }
	}
    }
    
    public void sortMax(){
	int maxSize = theQueue.size();
	for(int i = (maxSize-1)/2; i > 0; i--){
	    V duff;
	    if((2*i+1) < maxSize){
                if(theQueue.elementAt(2*i).compareTo(theQueue.elementAt(2*i+1)) >= 0){
                    if((theQueue.elementAt(2*i).compareTo(theQueue.elementAt(i)) > 0)){
                        // swap 2i and i                                                                                                                                                                                         
                        duff = theQueue.elementAt(2*i);
                        theQueue.setElementAt(theQueue.elementAt(i), 2*i);
                        theQueue.setElementAt(duff, i);
                        sortMax();
                    }
                }else{
                    if(theQueue.elementAt(2*i+1).compareTo(theQueue.elementAt(i)) > 0){
                        // swap 2i and i                                                                                                                                                                                               
                        duff = theQueue.elementAt(2*i+1);
                        theQueue.setElementAt(theQueue.elementAt(i), 2*i+1);
                        theQueue.setElementAt(duff, i);
                        sortMax();
                    }
                }
            }else{
                if((theQueue.elementAt(2*i).compareTo(theQueue.elementAt(i)) > 0)){
                    // swap 2i and i                                                                                                                                                                                                
                    duff = theQueue.elementAt(2*i);
                    theQueue.setElementAt(theQueue.elementAt(i), 2*i);
                    theQueue.setElementAt(duff, i);
                    sortMax();
                }
            }
	}
	
    }
    
}

