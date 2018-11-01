//When uncommenting, add slashes at the end of ** comments

/**

import java.util.Vector;
public class BinaryTree<E> implements CS211CountingDictionaryInterface{
    
    private Vector<E> theTree;

    public void init() {
	theTree = new Vector<E>();
	theTree.add(-10000);
    }

    public void insert(String key){
    /* insert the given key storing 1 as the value if the key does not already exist                                                                                                                                                      
     *  if the key already                                                                                                                                                                                                                 
     *  exists, increment the associated value                                                                                                                                                                                             
     *
	int find = find(key);
	if(find != -1){
	    
	    
	}else{
	    theTree.add(key);
	}
    }
    public boolean delete(String key){
    /* delete the given key, if the key was in the dictionary, return true                                                                                                                                                                
     * otherwise, return false  Implementing this is optional unless you use                                                                                                                                                              
     * an array as your D/S, in which case it is required                                                                                                                                                                                 
     *
	int f = find(key);
	if(f != -1){
	    theTree[f].delete();
	    for(int j = f; j <= theTree.size(); j++){
		if(j != theTree.size()){
		    theTree[j] = theTree[j+1];
		}else{
		    theTree[j] = -1;
		}
	    }
	    return true;
	}else{
	    return false;
	}
    }
    public int find(String key){
    /* return the value associated with the given key,  If the key is NOT in the dictionary,                                                                                                                                              
     * return -1                                                                                                                                                                                                                          
     *

	if(theTree.contains(key)){
	    return indexOf(key);
	}else{
	    return -1;
	}

    }
    public Vector<Word> allKeyValue(){
    /* return a list of all the key-value Words in the dictionary.  If your D/S is                                                                                                                                                        
     * a BST or an ordered array, they should be in order.                                                                                                                                                                                
     *
    }

}

*/