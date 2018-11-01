public class LLCoolJ{
    private Word theWord;
    private LLCoolJ next;
    private boolean deleted = false;
    
    public LLCoolJ(Word word){
	System.out.println("LLCoolJ constructor");
	setWord(word);
    }
    void init(){
    }
    public String getWordKey(){
	return theWord.getKey();
    }
    
    public Word getWord(){
	if(theWord != null){
	    return theWord;
	}else{
	    return null;
	}
    }

    public void bye(){
	theWord.bye();
    }

    public boolean goner(){
	return theWord.goner();
    }

    public void setWord(Word setMe){
	System.out.println("LLCoolJ setWord: " + setMe);

	theWord = setMe;	

	System.out.println("Word set");
    }
    public void setNext(Word setYou){
	System.out.println("setNext 1");
	if(next.getWord() != null){
	    System.out.println("zoe has big boobs");
	    next.setNext(setYou);
	    System.out.println("setNext3");
	}else{
	    System.out.println("setNext4");
	    next.setWord(setYou);
	    System.out.println("setNext5");
	}
	System.out.println("setNext6");
    }
    public LLCoolJ getNext(){
	return next;
    }
       
}

