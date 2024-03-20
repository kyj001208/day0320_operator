package logical;

public class LogicalTest01 {

	public static void main(String[] args) {
		// 논리연산자 : &&(그리고), || 또는, !(부정)

		int a=10;
		int b=20;	
		
		System.out.println(a>0 && b>0); // true && true , OutPut: true
		// &&: 둘다 만족하면 true , 둘중 하나라도 false가 나오면 false
		
		System.out.println(a==10 && b==20); // true && true , OutPut: true
		
		System.out.println(a<0 && b>0); // false && true , OutPut: false

		
		
		
	}

}
