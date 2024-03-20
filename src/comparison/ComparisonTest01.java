package comparison;

public class ComparisonTest01 {

	public static void main(String[] args) {
		// 관계연산 = 비교연산 : > , <, >=, <= 
		
		int a=10;
		int b=20;
		
		System.out.println(a > b); // Output : false
		System.out.println(a < b); // Output : true
		//1. a가 b보다 크니? false o
		//2. a가 b보다 작니? true (왼쪽부터 해석)
		
		boolean result= a>b;    
		System.out.println(result); // Output : false
		
		result=a<b;
		System.out.println(result); // Output : true
		System.out.println(a >= b); // =>로 표현 불가능 Output : false
		System.out.println(a <= b); // =<로 표현 불가능 Output : true
		System.out.println(a == b); // 동일한지 묻는것은 == 표현 Output : false
		System.out.println(a != b); // 다른지 묻는것은 != 표현   Output : true
		
		
	}

}
