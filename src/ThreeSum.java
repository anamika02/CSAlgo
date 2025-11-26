import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
//	Input: nums = [-1,0,1,2,-1,-4]
//	Output: [[-1,-1,2],[-1,0,1]]

	public static void main(String[] args) {
		threeSum(new int[] {-1,0,1,2,-1,-4,-2,-3,3,0,4});

	}
	
	 public static List<List<Integer>> threeSum(int[] nums) {
		//Arrays.sort(nums);
		 Set<List<Integer>> ans=new HashSet<>();
		 for(int i=0;i<nums.length;i++) {
			for(int j=i+2;j<nums.length;j++)
			 {
				int sum = nums[i]+nums[i+1]+nums[j];
			//	System.out.println("sum="+sum);
				if(sum==0) {
					
					ArrayList<Integer> sp = new ArrayList<>();
					sp.add(nums[i]);
					sp.add(nums[i+1]);
					sp.add(nums[j]);
					Collections.sort(sp);
					System.out.println("nums[i]="+nums[i]+",nums[i+1]="+nums[i+1]+",nums[j]="+nums[j]);
					ans.add(sp);
				}
			 }
			for(int k=0;k<i-1;k++)
			 {
			//	System.out.println("i="+i+",i+1="+(i+1)+",k="+k);
			//	int nextNo = i+1;
				if(i==nums.length-1)
					break;
				
				int sum = nums[i]+nums[i+1]+nums[k];
			//	System.out.println("sum="+sum);
				if(sum==0) {
					
					ArrayList<Integer> sp = new ArrayList<>();
					sp.add(nums[i]);
					sp.add(nums[i+1]);
					sp.add(nums[k]);
					Collections.sort(sp);
					System.out.println("nums[i]="+nums[i]+",nums[i+1]="+nums[i+1]+",nums[k]="+nums[k]);
					ans.add(sp);
					
				}
			 }
			 
		 }
		 System.out.println(ans);
		 return new ArrayList<>(ans);
	        
	    }

}
