package arithmetic;

public class ArithmeticTest04 {

	public static void main(String[] args) {
		// 증감 연산: ++
		// 감소 연산: --
		// 위 모두 단항연산자
		// 변하지 않는 상수에 ++ 붙이면 X , 변수에 붙이기

		int a = 10;
		int b = 20;
		
		//단항연산자 > 이항연산보다 우선처리
		System.out.println("a="+ a++);// OutPut : 10 (출력하는 값으로는 10나오지만 그후 메모리값은 11로 변했다)
		//후위연산 연산시점이 ; 이후 연산
		
		System.out.println("a="+ ++a);// OutPut : 12 
		//전위연산 연산시점이 바로 연산
		
		System.out.println("a=" + a); // OutPut : 12
		
		System.out.println("b="+ b--);// OutPut : 20 (출력하는 값으로 20나오지만 그후 메모리값은 19로 변했다)
		System.out.println("b="+ --b);// OutPut : 18
		System.out.println("b=" +  b);// OutPut : 18
		
		//위 표현식은 헷갈릴 수 있으므로 Test03으로 쓰도록
		//
		
		
	}

}
