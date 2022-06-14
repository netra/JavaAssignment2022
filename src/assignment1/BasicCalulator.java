package assignment1;
import java.util.Scanner;

public class BasicCalulator {

	public static void main(String[] args) {
		int sum; 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the first number");
		 int num1= input.nextInt();
		 System.out.println("Enter the second number");
		 int num2=input.nextInt();
		 System.out.println("Enter the one mathematical operation ");
		 char i=input.next().charAt(0);
		 
		 switch(i){
		 case '+':
			 sum = num1+num2;
			 System.out.println(num1+ " + " +num2 +" = "+ sum);
	         break;
		 case '-':
			 sum = num1-num2;
			 System.out.println(num1+ " - " + num2 +" = " +sum);
		     break;
		 case '*':
			 sum = num1*num2;
			 System.out.println(num1+ " * " + num2+ " = "+ sum);
		     break;
		 case '/':
			 sum = num1/num2;
			 System.out.println(num1+ " / " + num2 +" = " +sum);
		     break;
		default:
			System.out.println("Can't recognize the input");
		 
		 }
}

}
