package denver.begin.start_0228;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int score = 0; 
		int sc = 0;
		float avg = 0.2f;
		char grade;
		String[] sub = {"국어", "영어" , "수학"};
		
		System.out.println("--- 점수를 입력하세요 ---");
		for (String string : sub) {
			do {
				System.out.print(string + "점수를 입력하세요 : ");
				sc = scanner.nextInt();
			
			} while (sc < 0 | sc > 100);
			score = score + sc;
			
		}
		avg = (float) score / sub.length;
		if (avg >= 90) 
			grade = 'A';
		else if (avg >= 75)
			grade = 'B';
		else if(avg >= 60)
			grade = 'C';
		else if(avg >= 50)
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("평균은 " + String.format("%.2f", avg) + "입니다");
		//System.out.format("%.2f", avg);
		//System.out.printf("%.2f", avg);
		System.out.println("학점은 " + grade + "입니다.");
	}

}
