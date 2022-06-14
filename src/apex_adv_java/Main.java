package apex_adv_java;

public class Main {

	public static void main(String[] args) {
		 
		SingletonClass obj1 = SingletonClass.getObject();
		SingletonClass obj2 = SingletonClass.getObject();
		
		System.out.println("Obj1 data :: " + obj1.getData());
		System.out.println("Obj1 data :: " + obj2.getData());
		
		obj1.setData("How are you? ");
		System.out.println("Obj1 data :: " + obj1.getData());
		System.out.println("Obj1 data :: " + obj2.getData());
		
	}

}
