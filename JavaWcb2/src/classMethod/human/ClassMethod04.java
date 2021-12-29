package classMethod.human;

public class ClassMethod04 {
	public static void main(String[] args) {
		Human04 yamada = new Human04("山田");
		
		Human04.staticMethodPrint();
		System.out.println(Human04.GREETING);
		
		yamada.instanceMethodPrint();
		
		Human04 suzuki = new Human04("鈴木");
		
		Human04.staticMethodPrint();
		System.out.println(Human04.GREETING);
		
		suzuki.instanceMethodPrint();
	}

}