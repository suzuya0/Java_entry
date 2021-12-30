package polymorphism.human;

public class Student extends Human {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	@Override
	public String getProfiel() {
		String profiel = "年齢は" + super.age + "です";
		profiel += "学生で、テストの点数は" + this.score + "点です";
		return profiel;
	}

}
