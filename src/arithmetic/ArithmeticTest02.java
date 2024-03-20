package arithmetic;

public class ArithmeticTest02 {

	public static void main(String[] args) {
		// 증감 연산: ++
		// 감소 연산: --
		// 위 모두 단항연산자
		// 변하지 않는 상수에 ++ 붙이면 X , 변수에 붙이기

		int a = 10;
		int b = 20;

		a++; // a를 1증가
		System.out.println("a =" + a); // OutPut : a=11

		a--; // a를 1감소
		System.out.println("a =" + a); // OutPut : a=10

		a += 1; // a를 1증가
		System.out.println("a =" + a); // Output : a=11
		
		a= a+1; // a
		System.out.println("a =" + a); // OutPut : a=12


	}

}
