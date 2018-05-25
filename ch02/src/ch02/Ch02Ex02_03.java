package ch02;
import java.util.Scanner;

public class Ch02Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		String a = scanner.nextLine();
		int b = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 :" + input);
        System.out.printf("num=%d%n", num);
        System.out.println("입력내용 :" + a);
        System.out.printf("num= 100", b);
	}

}
