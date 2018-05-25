package ch02;

import java.util.Scanner;

public class ScannerEx {
	   
	public static void main(String[] args) {
		// 1. Scanner를 이용해서 2자리 정수를 입력받으세요.
		Scanner scanner = new Scanner(System.in);
				
				System.out.print("두자리 정수를 하나 입력해주세요.>");
				//String Input = scanner.nextLine();
				//int num = Integer.parseint(input)   // 입력받은 문자열을 숫자로 변환
		        String input = scanner.nextLine();
		        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		        
		        System.out.println("입력내용 :" + input);
		        System.out.printf("num=%d%n", num);
	}

}
