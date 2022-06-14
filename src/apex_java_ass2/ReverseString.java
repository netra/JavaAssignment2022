package apex_java_ass2;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello world";
		System.out.println(reverseStringBuilder(str));
		System.out.println(reverseManually(str));
	}
	public static String reverseStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	public static String reverseManually(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}
