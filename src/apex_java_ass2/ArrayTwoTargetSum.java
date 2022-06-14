package apex_java_ass2;
import java.util.HashMap;
import java.util.Map;

public class ArrayTwoTargetSum {

	public static void main(String[] args) {
		
		int [] nums = {2, 4, 7, 9, 10,1};
		int target = 11;
		int[] result =twoTargetSum(nums, target);
		System.out.println(result[1]+" "+result[0]);
		
		 
	}
	
	public static int[] twoTargetSum(int[] nums, int target) {
		 Map<Integer, Integer> numMap = new HashMap<>();
		 for(int i=0; i<nums.length; i++) {
			 int delta = target - nums[i];
			 if(numMap.containsKey(delta)) {
				return new int[] {i, numMap.get(delta)}; 
			 }
			 numMap.put(nums[i], i);
		 }
		 return new int[] {-1, -1};
		 
	}

}
