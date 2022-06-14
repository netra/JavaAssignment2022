package assignment1;

public class Employee {
	String empName;
	int empNo;
	String address;
	String state;
	int zipcode;
	int phone;
	String[] designation = { "Manager", "Lead", "Analyst" };
	int experienceinYears;
	String emailAddress;
	private int basicSalary;
	int bonus;
	int hra;
	int totalSal;

	public void setSalary(int basicSalary) {
		this.basicSalary = basicSalary;

	}

	public int getSalary() {
		return basicSalary;
	}

	public Employee(String empName, int empNo, String address, String state, int zipcode, int phone,
			int experienceinYears, String emailAddress, int bonus, int hra) {
		this.empName = empName;
		this.empNo = empNo;
		this.address = address;
		this.state = state;
		this.zipcode = zipcode;
		this.phone = phone;
		this.experienceinYears = experienceinYears;
		this.emailAddress = emailAddress;
		this.bonus = bonus;
		this.hra = hra;
	}
	public double bonusSalary() {
		double bonusSal = (basicSalary * 12) * (bonus * 0.1);
		return bonusSal;
	}

	public double totalSalary() {
        double totalSal = (basicSalary  * 12) + hra +this.bonusSalary()  ;
		return totalSal;

	}
	

	public static void main(String[] args) {

		Employee emp = new Employee("Sam", 11, "main stress", "California", 95051, 12345, 5, "apex@gmail.com", 2,
				1000);
		System.out.println("Employee name  : " + emp.empName);
		System.out.println("Employee number  : " + emp.empNo);
		System.out.println("Employee address  : " + emp.address);
		System.out.println("Employee state  : " + emp.state);
		System.out.println("Employee zipcode  : " + emp.zipcode);
		System.out.println("Employee phone  : " + emp.phone);
		System.out.println("Employee designation  : " + emp.designation[0]);
		System.out.println("Employee experienceinYears  : " + emp.experienceinYears);
		System.out.println("Employee emailAddress  : " + emp.emailAddress);
		emp.setSalary(15000);
		System.out.println("Employee basicSalary  : " + emp.getSalary());
		System.out.println("Employee bonus  : " + emp.bonus + "%");
		System.out.println("Employee hra  : " + emp.hra);
		System.out.println("Total bonus  : " + emp.bonusSalary());
		System.out.println("Total salary : "+emp.totalSalary());
		 
	}

}
