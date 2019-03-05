package denver.begin.start_0228;

import java.util.Scanner;

public class NumGame {
	@SuppressWarnings("unused")
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		//Math import 안했음 : java.lang에있는거임
		//random 반환타입 double(소숫점 4자리까지)
		int num =  (int) (Math.random()*100+1); 
		
		int input_num = 0;
		
		do {
			System.out.print("숫자 입력 : ");
			input_num = scanner.nextInt();
			
			if (input_num == num) {
				System.out.println("맞혔습니다.");
				//do while문을 벗어 나기
				//break; 
				//0 : 완전한 종료. 1 : 불완전해도 종료 -1 : 완벽하던 안한던 무조건 종료
				System.exit(0); 
				
				
			} else {
				if (num < input_num) {
					System.out.println("미만");
					
				} else {
					System.out.println("초과");

				}
			}
			
		} while (true);
		
		
	}

}
