package inner_class_sample;
//#1
//public class Outer {
//	public class Inner{
//	}
//
//}
//
//
//public class Example{
//	public static void main(String[] args) {
//		Outer outer = new Outer();
//		Outer.Inner inner = outer.new Inner();
//	}
//}

//#2
//public class Outer{
//	public static class Inner{
//	}
//}
//
//public class Example {
//	public static void main(String[] args) {
//		Outer outer = new Outer();
//		Outer.Inner inner = new Outer.Inner();
//	}
//}

//#3
//public class Outer{
//	private String greeting = "こんにちは";
//	
//	public class Inner{
//		public String hello() {
//			return greeting;
//		}
//	}
//}

//#4コンパイルエラー
//public class Outer {
//	private String greeting = "こんにちは";
//	
//	public static class Inner{
//		public String hello() {
//			return greeting;
//		}
//	}
//}

//5
//public class Outer{
//	private static String greeting = "こんにちは";
//	
//	public static class Inner {
//		public String hello() {
//			return greeting;
//		}
//	}
//}

//6
//public class Constants{
//	public static final String CAT_NAME = "猫";
//	public static final String CAT_LEG_COUNT = 4;
//	public static final String OCTOPUS_NAME = "タコ";
//	public static final String OCTOPUS_LEG_COUNT = 8;
//}
//
//System.out.println(Constants.CAT_NAME);
//System.out.println(Constants.CAT_LEG_COUNT);
//System.out.println(Constants.OCTOPUS_NAME);
//System.out.println(Constants.OCTOPUS_LEG_COUNT);

//7
//public class Constants{
//	public static class Cat{
//		public static final String NAME = "猫";
//		public static final int LEG_COUNT = 4;
//	}
//	
//	public static class Octopus{
//		public static final String NAME = "タコ";
//		public static final int LEG_COUNT = 8;
//	}
//}
//
//System.out.println(Constants.Cat.NAME);
//System.out.println(Constants.Cat.LEG_COUNT);
//System.out.println(Constants.Octopus.NAME);
//System.out.println(Constants.Octopus.LEG_COUNT);

//8
//public class Cat{
//}
//
//public class CatNail{
//}
//
//public class Tako{
//}
//
//public class TakoSucker{
//}
//
//public  class Cat{
//	public class CatNail{
//	}
//}
//
//public class Tako {
//	public class TakoSucker{
//	}
//}

//9
//public class Human {
//	public class HumanLeg {
//		public void kick() {
//			System.out.println("蹴る");
//		}
//	}
//}
//
//Human human = new Human();
//Human.HumanLeg leg = human.new Humanleg();
//leg.kick();
//
//new Human().new Humanleg().kick();

















