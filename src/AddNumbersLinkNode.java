
public class AddNumbersLinkNode {
	  


	public static void main(String[] args) {
		ListNode l1 = new ListNode(3,new ListNode(4,new ListNode(2)));
		ListNode l2 = new ListNode(4,new ListNode(6,new ListNode(5)));
		
		addTwoNumbers(l1,l2);

	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	      int multiplyFactor = 1;
	       ListNode nodeProcessed = l1;
	       int cumulativeSum = 0;
	       while(nodeProcessed!=null){
	        cumulativeSum = cumulativeSum+ nodeProcessed.val*multiplyFactor;
	        multiplyFactor = multiplyFactor*10;
	        nodeProcessed = nodeProcessed.next;
	       }
	       int number1 = cumulativeSum;
	           System.out.println("number1="+number1); 
	        multiplyFactor = 1;
	        nodeProcessed = l2;
	        cumulativeSum = 0;
	        while(nodeProcessed!=null){
	        cumulativeSum = cumulativeSum+ nodeProcessed.val*multiplyFactor;
	        multiplyFactor = multiplyFactor*10;
	        nodeProcessed = nodeProcessed.next;
	       }
	       int number2 = cumulativeSum;
	       System.out.println("number2="+number2); 
	       int number3 = number1+number2;
	       System.out.println("number3="+number3); 
	       
	    int divVal = -1;
	    int modVal = -1;
	    ListNode n = null;
	    while(divVal!=0){
	    
	 //   System.out.println("modVal"+modVal);
	    if(n==null){
	    	divVal = number3/10;
	    	modVal = number3%10;
	        n = new ListNode(modVal);
	    }else{
	    	modVal = divVal%10;
	    	divVal = divVal/10;
	    	
	        n.next = new ListNode(modVal);
	    }
	    System.out.println("modVal"+modVal);
	        
	    System.out.println("divVal"+divVal);
	    }
	    return n;
	       

	        }
}
