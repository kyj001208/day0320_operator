package logical;

public class LogicalTest02 {

	public static void main(String[] args) {
		// 논리연산자 : && (그리고), || 또는, !(부정)

		int a=10;
		int b=20;	
		
		// logical or || : 둘중에 하나라도 만족하면 true
		
		System.out.println(a>0 || b>0); // true || true , OutPut: true
		// true || true : true
		// true || false: true
		// false || false : false
		
		System.out.println(a==10 || b==20); // true || true , OutPut: true
		
		System.out.println(a<0 || b>0); // false || true , OutPut: true 

		
		
		
	}

}
