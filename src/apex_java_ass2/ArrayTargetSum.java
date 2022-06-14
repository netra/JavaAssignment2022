package apex_java_ass2;

import java.util.Scanner;

public class ArrayTargetSum {

	  
	    public static void main(String[] args) {
	         Scanner input = new Scanner(System.in);
	         System.out.println("Enter limit of array list"+"\n");
	         int n = input.nextInt();
	         int [] nums = new int[n];
	         for(int x=0; x<n; x++) {
	        	 System.out.println("Enter the array list number"+"\n");
	        	 nums[x]=input.nextInt();
	         }
	         System.out.println("Enter the targeted number"+"\n");
	         int target =input.nextInt();
	         input.close();
	         for(int i=0;i<nums.length;i++) {
	         	for(int j=i+1;j<nums.length;j++) {
	         		if(nums[i]+nums[j]==target) {
	         			System.out.println("Index number "+ i + " & "+j+" makes "+ target+"\n");
	         		}
	         		else {
	         			System.out.println("no numbers found");
	         		}
	         	}      	
	         }
	         
	    }}     
	         
	         
	         
	         
	         
	         
	        

