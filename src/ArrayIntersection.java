import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] nums1 = new int[] {4,9,5} ;
		int[] nums2 = new int[] {9,4,9,8,4};
		ArrayIntersection ai = new ArrayIntersection();
		ai.intersection(nums1, nums2);

	}
	public int[] intersection(int[] nums1, int[] nums2) {
		
        Set<Integer> numSet1 = new HashSet<Integer>();
        for(int val1:nums1)
        	numSet1.add(new Integer(val1));  
        Set<Integer> numSet2 = new HashSet<Integer>();
        for(int val2:nums2)
        	numSet2.add(new Integer(val2));
        numSet1.retainAll(numSet2);
        int[] returnArray =numSet1.stream().mapToInt(Integer::intValue).toArray();
        for(int x:returnArray)
        System.out.println(x);
        return returnArray;
        
    }

}
