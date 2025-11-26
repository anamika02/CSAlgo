
public class LongestPalindrome {
	

	public static void main(String[] args) {
		System.out.println("Largest String="+solution("qdgflevelshrje"));
	}
	
	public static String solution(String s) {
		if(s.length()==1)
	        return s;
		char[] str = s.toCharArray();
        String palindrome=new String();
        String finalString=new String();
        int countMatched=0;
 
//        int i=0;
//        int j=str.length;
 for(int k=0;k<str.length-1;k++) {
	 for(int i=0,j=str.length-1-i-k;i<str.length-k;i++,j--)
     {
		System.out.println("i,j,k="+i+","+j+","+k);
     	System.out.println("i,j="+str[i]+","+str[j]);
             if(str[i]==str[j])
             {
             System.out.println("Matched i,j="+str[i]+","+str[j]);
             countMatched += 1;
             palindrome += str[i];
             }

     }
	 System.out.println("countMatched="+countMatched);
	 System.out.println("palindrome="+palindrome);
	 if(palindrome.length()>finalString.length())
		 finalString = palindrome;
	 countMatched = 0;
	 palindrome = "";
   //  return palindrome;
	 
 }
//            for(int i=0,j=str.length-1-i;i<str.length;i++,j--)
//            {
//            	System.out.println("i,j="+str[i]+","+str[j]);
//                    if(str[i]==str[j])
//                    {
//                    System.out.println("Matched i,j="+str[i]+","+str[j]);
//                    countMatched += 1;
//                    palindrome += str[i];
//                    }
//    
//            }
//        System.out.println("countMatched="+countMatched);
//        System.out.println("palindrome="+palindrome);
//            return palindrome;
 if(finalString.length()==0 && s.length()==2)
     return s.substring(0,1);
return finalString;
    }
}
