package apex_java_ass2;

import java.util.Stack;

public class ReverseWordsString {
	
	public static void reverseWordsString(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length();i++) {
			Character c = str.charAt(i);
			if(c == ' ') {
				while(!stack.isEmpty()) {
					System.out.print(stack.pop());	
				}
				System.out.print(" ");	
			}	
			else {
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}

	public static void main(String[] args) {
		String str = "Hello world";
		reverseWordsString(str);

	}

}
