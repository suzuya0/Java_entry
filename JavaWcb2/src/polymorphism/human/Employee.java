package polymorphism.human;

public class Employee  extends Human {
	private String department;
	
	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	public String getProfiel() {
		String profiel = "年齢は" + this.age + "です";
		profiel += "サラリーマンで、部署は" + this.department + "です";
		return profiel;
	}
}
