package ch3;

public class OperatorEx8 {
	public static void main(String args []) {
		int a = 1_000_000; // 1, 000, 000, 000 1백만
		int b = 2_000_000; //2, 000, 000 2백만
		
		// 대입연산자 (-)는 오른쪽부터 계산한 다음 왼쪽은로 대입한다.
		// int a, int b 곱한 결과는 int 타입이다.
		//곱한 결과가 int 범위를 초과하므로 오버플로우가 일어나
		// -1454759936 값으로 계산 된 것이다.
		long c = a * b;  // a * b = 2,000,000,000,000 ? No
		
		System.out.println(c);
		
	}

}
