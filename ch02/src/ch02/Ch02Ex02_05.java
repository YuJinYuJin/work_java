package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		// 1. 숫자 2개 입력받기
		String input1 = scanner.nextLine();
		String input2 = scanner.nextLine();
		
		// 2. 입력받은 값 2개를 각각 num1, num2에 저장
		int num1 = Integer.parseInt(input1);
		float num2 = Float.parseFloat(input2);
		
		System.out.println(num1);
		System.out.println(num2);
		
		// 3. num1 * num2 = 계산한 값이 출력되도록 작성
		System.out.printf("%d * %f = %f" ,num1,num2,num1*num2);
		
		
	}

}
