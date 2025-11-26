
public class TwoSum {

	public static void main(String[] args) {
		twoSum(new int[] {2,7,11,15},9) ;

	}
	 public static int[] twoSum(int[] nums, int target) {
	        int sum = -1;
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=0;j<nums.length;j++)
	        {
	            if(i!=j){
	           sum = nums[i]+nums[j];
	           if(sum==target){
	               System.out.println(i+","+j);
	               return new int[]{i,j};
	           }
	           
	            }
	        }
	        }
			return nums;
	    
	    }
}
