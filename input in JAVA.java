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

		
		
		System.out.println("���� �Է� : ");

		if (num%2 ==0) {
			System.out.println( num + "�� ¦��");
			
		} else {
			System.out.println(num + "�� Ȧ��");

		}
		scanner.close();

	}

}



////Ű���忡 �Է��ϴ� �����͸� ���������� �ްڴ�
//// 3 5 
//InputStreamReader inputStreamReader = new InputStreamReader(System.in);
////Ű����� �Է��ؼ� ����Ǿ��ִ� ���ۿ��� �о���ڴ�
//BufferedReader bufferedReader = new BufferedReader(inputStreamReader);