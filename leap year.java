package denver.begin.start_0228;

import java.util.Scanner;

public class YUN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year;
		
		System.out.println("윤년 평년 확인");
		System.out.println("2020년 이전 까지만 지원합니다.");
		
		
		System.out.println("년도 입력 : ");
		year = scanner.nextInt();
		for (int i = year; i < 2021; i++) {
			if (i%4 == 0 && i%100 != 0 || i%400 ==0  ) {
				System.out.println(i + "년은 윤년입니다.");
			} else {
				System.out.println(i +"년은 평년입니다.");
				

			}
		}
		
	}

}
