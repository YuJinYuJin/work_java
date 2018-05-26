package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
	public static void main(String[] args) {
		
			Scanner scanner = new Scanner (System.in);

			// 2. 숫자 2개 입력받기
			String strNum1 = scanner.nextLine();
			String strNum2 = scanner.nextLine();
			
			// 3. 입력받은 실수 2개를 실수(double)형으로 변경하기
			double num1 = Double.parseDouble(strNum1);
			double num2 = Double.parseDouble(strNum2);
			
			//4. num1,nim2 변수를 이용하여 계산하기
			double result = num1 + num2;
			
			// 5. num1 * num2 = 계산한 값이 출력되도록 작성
			System.out.printf("%10.21%10.21%10.2f" ,num1,num2, result);
			
	}
}
