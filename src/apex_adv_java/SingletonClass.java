package apex_adv_java;

public class SingletonClass {
	private String data ="Hello";
	
	// 1st step
	private static SingletonClass sobj = null;
	
	//2nd step
	private SingletonClass() {
		
	}
	
	//3rd step
	public static SingletonClass getObject() {
		
		if (null == sobj) {
			sobj = new SingletonClass();
		}
		return sobj;
	}
	public String getData() {
		return data;
	}
	public void setData(String newData) {
		data = newData;
	}

	
	
	

}
