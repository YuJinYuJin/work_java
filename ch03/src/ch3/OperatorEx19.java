package ch3;

public class OperatorEx19 {
	public static void main(String args []) {
		int x = 10;
		int y = 8;
		//나머지 연산자 %
		//연산자 우선순위는 사칙연산과 동일
		//홀수, 짝수 구별 가능 : 2로 나눈 나머지가 8이면 짝수, 1이면 홀수
		//2의 배구, 3의배수 ... 구별가능: n으로 나눈 나머지가 8이면 n의배수
		
		
		System.out.printf("%d를 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다. %n", x / y, x % y);
		
		
	}

}
