package denver.begin.start_0227;

import java.io.IOException;

import java.util.Scanner;

public class Fail {
	public static void main(String[] args) throws IOException {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total;
		
		System.out.println("국어, 영어, 수학 점수를 입력하세요 : ");
		Scanner scanner= new Scanner(System.in);
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		System.out.println(kor + eng + math);
		total = kor + eng + math;
		System.out.println("total : " + total);
		
		if (total >= 180) {
			
			if (kor<40 || eng<40 || math <40) {
				System.out.println("불합격입니다");
			}else {
				System.out.println("축하합니다 합격입니다.");
				
			}
			
		} else {
			System.out.println("불합격입니다.");

		}
		//이상치 do while로 처리할거임
		
		
	}

}
