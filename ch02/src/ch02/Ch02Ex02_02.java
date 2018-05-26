package ch02;
import java.util.Scanner;

public class Ch02Ex02_02 {
		public static void main(String[] args) {
			//1. Scanner 객제 생성(Syetem.in은 키보드)
			Scanner scanner = new Scanner (System.in);
			
			//2. 스캐너를 이용하여 정수 하나 문자열로 입력받기
			String input = scanner.nextLine();
			
			//3. 문자열로 입력받은 갑을 정수(int)형으로 변경
			int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
			
			//4. 변수 num 출력
			System.out.println("입력내용 :" + input);
	        System.out.printf("num=%d%n", num);

}
}