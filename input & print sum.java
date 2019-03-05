package denver.begin.start_0227;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class REPEAT_0227 {
	public static void main(String[] args) throws IOException {
		
		char st = '이연주';
		st = (char) st;
		System.out.println(st);
				
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		int num1, num2;
		int total = 0;
		System.out.println("첫번째 숫자 입력 : ");
		num1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("두번째 숫자 입력 : ");
		num2 = Integer.parseInt(bufferedReader.readLine());
		
		if (num1>num2); {
			int big = num1;
			num1 = num2;
			num2 = big;
			
		}
		
		for (int i = num1; i <= num2; i++) {
			total += i;
			
		}
		
		System.out.println( );
		System.out.println(num1 + "~" + num2 + "의 합은" + total + "입니다");
		
		
	}

}
