package apex_java_ass2;

public class RmoveDuplicatesArray {
	
	public static int removeDuplicatesArray(int [] nums) {
		int index =1;
		for(int i=0; i<nums.length-1;i++) {
			if(nums[i]!= nums[i+1]) {
				nums[index++]=nums[i+1];
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int [] nums = {0,1,1,2,3,3,3,4,5,5,6};
		int newLength =removeDuplicatesArray(nums);
		System.out.println("Length of array after removing duplicates = "+ newLength);
		
		System.out.print("New Array :  ");
	    for (int i = 0; i < newLength; i++) {
	      System.out.print(nums[i] + " ");
	    }
	    System.out.println();
		
	}

}
