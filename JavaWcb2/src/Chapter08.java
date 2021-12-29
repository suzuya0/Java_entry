
public class Chapter08 {
	public static void main(String[] args) {
//		1.while
		int num = 1;
		int num2;
		while(num < 5) {
			num2 = num*num;
			System.out.println(num + "の2乗は" + num2 );
			num++;
		}
		
//		1.while解答
		int num1 = 1;
		while(num1 < 5) {
			System.out.println(num1*num1);
			num1++;
		}
		
//		2.for
		int[] array1 = {1, 4, 14, 25};
		for(int int1 = 0; int1 < array1.length ; int1++) {
			System.out.println(array1[int1]);
		}
		
//		3.拡張for
		int[] array2 = {1, 4, 14, 25};
		for(int int2 : array2) {
			if(int2 % 2 == 0) {
				continue;
			}
			System.out.println(int2);
		}
	}

}
