package denver.begin.start_0228;

import java.util.Scanner;

public class NumGame {
	@SuppressWarnings("unused")
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		//Math import ������ : java.lang���ִ°���
		//random ��ȯŸ�� double(�Ҽ��� 4�ڸ�����)
		int num =  (int) (Math.random()*100+1); 
		
		int input_num = 0;
		
		do {
			System.out.print("���� �Է� : ");
			input_num = scanner.nextInt();
			
			if (input_num == num) {
				System.out.println("�������ϴ�.");
				//do while���� ���� ����
				//break; 
				//0 : ������ ����. 1 : �ҿ����ص� ���� -1 : �Ϻ��ϴ� ���Ѵ� ������ ����
				System.exit(0); 
				
				
			} else {
				if (num < input_num) {
					System.out.println("�̸�");
					
				} else {
					System.out.println("�ʰ�");

				}
			}
			
		} while (true);
		
		
	}

}
