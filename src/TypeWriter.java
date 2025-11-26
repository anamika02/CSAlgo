
public class TypeWriter {

	public static void main(String[] args) {
		TypeWriter tw = new TypeWriter();
		tw.minTimeToType("pdy");

	}

	    public int minTimeToType(String word) {
	        char [] wordChars = word.toCharArray();
	        int ptr =97;
	        int secAdd = 0;
	        for(int i=0;i<wordChars.length;i++){
	        	int wordInt = (int) wordChars[i];
	            System.out.println("wordInt="+wordInt);
	            int nextDiff = Math.abs(wordInt-ptr);
	            System.out.println("nextDiff="+nextDiff);
	            if(nextDiff<=13) {//go clockwise
	            	ptr = ptr+nextDiff;
	            	secAdd = secAdd+nextDiff+1;  
	            	
	            }else {//anti-clockwise
	            	secAdd = secAdd+26-nextDiff+1;
	            	ptr=wordInt;
	            }
	            System.out.println("ptr="+ptr+",char="+(char)ptr+",secAdd="+secAdd);
	        }
	       System.out.println("seconds="+secAdd);
	       return secAdd; 
	}



}
