package denver.begin.start_0227;

import java.util.Scanner;

public class repeat_0227_2 {
	private static Scanner scanner;

	public static void main(String[] args) {
		String str1;
		String str2;
		String inp = "�ܾ���� �Է��ϼ��� : "; 
		scanner = new Scanner(System.in);
		System.out.print(inp);
		str1 = scanner.next();
		str2 = scanner.next();
		
		if (str1.equals(str2)) {
			System.out.println("���� �ܾ��Դϴ�.");
			
		} else {
			System.out.println("�ٸ� �ܾ� �Դϴ�.");

		}
		
		scanner.close();
		
	}

}
