package apex_java_ass2;

public class ArrayAdd {
	
	
	

	public static void main(String[] args) {
		int [] number = {1,2,8,9,10,12,0,23,32};
		int target = 10;
        for(int i=0;i<number.length;i++) {
        	for(int j=i+1;j<number.length;j++) {
        		if(number[i]+number[j]==target) {
        			System.out.println("Index number "+ i + " & "+j+" makes "+ target+"\n");
        		}	
        	}      	
        }
	}

}
