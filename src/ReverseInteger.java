
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-123));

	}
	public static int reverse(int x) {
		if(x>Integer.MAX_VALUE || x<Integer.MIN_VALUE)
			return 0;
		
		int nextDigit = Math.abs(x);
		int newNumber =0;
		int numLength = String.valueOf(nextDigit).length();
		int count = 1;
		
		while(nextDigit!=0) {
			int digit = nextDigit%10;
			nextDigit = nextDigit/10;
			newNumber += Math.pow(10, numLength-count)*digit;
			count +=1;
			System.out.println("newNumber="+newNumber);
			
		}
		if(newNumber>Integer.MAX_VALUE || newNumber<Integer.MIN_VALUE)
			return 0;
		if(x<0)
			return -1*newNumber;
		
		return newNumber;
	        
	    }

}
