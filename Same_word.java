package denver.begin.start_0227;

import java.util.Scanner;

public class repeat_0227_2 {
	private static Scanner scanner;

	public static void main(String[] args) {
		String str1;
		String str2;
		String inp = "단어들을 입력하세요 : "; 
		scanner = new Scanner(System.in);
		System.out.print(inp);
		str1 = scanner.next();
		str2 = scanner.next();
		
		if (str1.equals(str2)) {
			System.out.println("같은 단어입니다.");
			
		} else {
			System.out.println("다른 단어 입니다.");

		}
		
		scanner.close();
		
	}

}
