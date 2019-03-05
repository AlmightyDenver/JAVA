package denver.begin.start_0227;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class mrn {
	private static Scanner scanner;

	public static void main(String[] args) throws IOException {
		
//		int num = System.in.read()-48;		
		
//		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//		int num = Integer.parseInt(bufferedReader.readLine());
		
		scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		
		
		System.out.println("숫자 입력 : ");

		if (num%2 ==0) {
			System.out.println( num + "은 짝수");
			
		} else {
			System.out.println(num + "은 홀수");

		}
		scanner.close();

	}

}



////키보드에 입력하는 데이터를 연속적으로 받겠다
//// 3 5 
//InputStreamReader inputStreamReader = new InputStreamReader(System.in);
////키보드로 입력해서 저장되어있는 버퍼에서 읽어오겠다
//BufferedReader bufferedReader = new BufferedReader(inputStreamReader);