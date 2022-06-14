package practice;

public class StringMethos {

	public static void main(String[] args) {
		// Internal way or string literals stored in string pool
		 String str1 = "Hello";
		 String str2= "Hello";
		 
		 // we are not comparing content, we comparing hash code, which is same for both
		 if(str1==str2) {
			 System.out.println("str1==str2");
		 }
		 else {
			 System.out.println("str1!=str2");
		 }
		 
		 String str3 = new String("Hello");
		 String str4 = new String("Hello");
		 if(str3==str4) {
			 System.out.println("str3==str4");
		 }
		 else {
			 System.out.println("str3!=str4");
		 }
		 
		 // == will compare reference variable that is hash code, not the real content
         // we use equals() for compare content of the string
		 if(str3.equals(str4)) {
			 System.out.println("str3 is equal to str4");
		 }
		 else {
			 System.out.println("str3 is not equal to str4");
		 }
		 
		 // String Methods
		 String str = "Netra Aryan Eshan Amit";
		 System.out.println("The string is : "+str);
		 int len= str.length();
		 System.out.println("Length of the string is : " +len);
		 System.out.println("First letter of string is : " +str.charAt(0));
		 System.out.println("Last letter of string is : " +str.charAt(len-1));
		 
		 String s1 = str.toUpperCase();
		 System.out.println("Str after upper case : "+str);// no change, strings are IMMUTABLE
		 System.out.println("s1 is after uppercase : "+s1);
		 
		 if(str.contains("Eshan")) {
			 System.out.println("Eshan is in the string");
		 }
		 else {
			 System.out.println("Eshan is not in the string");
		 }
		 
		 String s2 = str.substring(5);
		 System.out.println("After substring(5) str is : "+s2);
		 String s3 = str.substring(6,10);
		 System.out.println("s3 : "+s3);
		 
		 String s4=str.replace('N', 'E');
		 System.out.println("Letter N is replaced by E : "+s4);
		 
		 char[] chArr = str.toCharArray(); // ton create character array
		 for(char ch: chArr) {
			 System.out.print(ch + " ");
		 }
		 
		 String[] strArr = str.split(",");
		 for(String s:strArr) {
			 System.out.println(s);
		 }
		 
		 // immutable
		 String name="Netra";
		 name.concat(" Baligar");
		 System.out.println("immutable string : "+name);
		
		 // mutable
		 StringBuffer name1 = new StringBuffer("Netra");
		 name1.append(" Baligar");
		 System.out.println("mutable string : "+name1);
		 
		 StringBuilder name2 = new StringBuilder("Eshan");
		 name2.append(" Aryan");
		 System.out.println("mutable string : "+name2);
		 
	}

}
