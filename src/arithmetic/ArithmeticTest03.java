package arithmetic;

public class ArithmeticTest03 {

	public static void main(String[] args) {
		// 증감 연산: ++
		// 감소 연산: --
		// 위 모두 단항연산자
		// 변하지 않는 상수에 ++ 붙이면 X , 변수에 붙이기

		int a = 10;
		int b = 20;

		a++; //1씩 증가 ( ++를 앞, 뒤 붙이는거 가능) , 후위연산
		++b; //전위연산

		System.out.println("a=" + a); //OutPut : a=11
		System.out.println("b=" + b); //OutPut : b=21
		
		
	}

}
