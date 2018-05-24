package ch02;

public class StringEx {

	public static void main (String[] args) {
		/*
		 *  문자열 + any type > 문자열 + 문자열 > 문자열
		 *  any type + 문자열 > 믄자열 + 문자열 > 문자열
		 */
		String name = "Ja" + "va" ;   // 문자열 + 문자열 = 문자열
		String str = name + 8.0;       // 문자열 + double = 문자열
		
		//Sysout 입력 후 Ctrl + Space bar
		System.out.println(name);        // 문자열 "Java" 출력
		System.out.println(str);         // "Java" + "8.0" (double헝이 문자열로 형변환)
		System.out.println(7 + " ");     // int 7이 문자열로 형변환
		System.out.println(" " + 7);     // int 7이 문자열로 형변환
		System.out.println(7 + "");      // int 7이 문자열로 형변환
		System.out.println("" + 7);      // int 7이 문자열로 형변환
		System.out.println("" + "");     // "" 문자열
		System.out.println(7 + 7 + "");  // 7 + 7한 결과에 문저열을 더해서 문자열 "14"
		System.out.println("" + 7 + 7);  // "" + 7 한 결과에 (문자열 7)에 7을 더해서 문자열 "77"
	}
}
