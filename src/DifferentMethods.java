import java.util.Scanner;

public class DifferentMethods {
	 
	
	public Boolean isEvenNumber(String str) {
		Boolean status = false;
		if(str.length()<0) {
			return false;
		}
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				int n = Integer.parseInt(str);

				if(n % 2==0)
				{
					status=true;
				}
				else
				{
					status=false;
				}
				
		    }else
		    {
		    	//System.out.println("not a number");
			 status = false;
		    }
		}
		return status;
	}
	
	
	public static void main(String[] args) {
		DifferentMethods dm = new DifferentMethods();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter to check");
		String str=input.next();
		 System.out.println(dm.isEvenNumber(str));
		
	}

}
