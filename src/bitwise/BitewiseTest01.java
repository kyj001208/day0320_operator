package bitwise;

public class BitewiseTest01 {

	public static void main(String[] args) {
		// 비트연산자 (참고용)
		// 시프트: << (왼쪽으로 이동), >>(오른쪽으로 이동), >>>
		// & , | , ~(부정) , ^(XOR)
		
		int a=10; // 2진수: 0000 1010
		int b=25; // 2진수: 0001 1001

		System.out.println(a & b); // 비트단위로 하여 위아래가 동일한것만 true , OutPut: 8
		System.out.println(a | b); // OutPut : 27
		System.out.println(~a); // 비트단위 부정 1-> 0으로 0->1로 부정, OutPut: -11
		System.out.println(a^b);// 비트단위 같으면 0 , 다르면 1 , OutPut: 19
		
		
		System.out.println(a << 2); // 왼쪽 2칸 비트이동(10*2^2)오른쪽 빈칸은 0채우기 OutPut : 40
		
		System.out.println(a >> 2); // 오른쪽 2칸 비트이동, 왼쪽빈칸은 부호에 따라 0,1로 채움 OutPut: 2
		//시프트 제한 : int형 32비트, long형 64비트
		
		System.out.println( (~a) >>> 2); //오른쪽 2칸 비트 이동, 왼쪽 빈칸은 무조건 0으로 채움

	}

}
