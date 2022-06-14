
public class GenerateNum {

	public static void main(String[] args) {
		System.out.println("Genarating number :");
		for(int i=1; i<=10;i++) {
			System.out.println(i);
			
		}
		System.out.println("Genarating multiple of 5 number :");
		for(int i1=1; i1<=10;i1++) {
			int multi = i1*5;
			System.out.println("5 * "+i1+" = "+ multi);
			
		}
		System.out.println("Odd number are :"  );
		for(int j=1; j<=10;j++) {
			if(j%2!=0) {
				System.out.println(j);
			
			}	
		}
		
	}

}
