package denver.begin.start_0228;

import java.util.Scanner;

public class YUN {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int year;
		
		System.out.println("���� ��� Ȯ��");
		System.out.println("2020�� ���� ������ �����մϴ�.");
		
		
		System.out.println("�⵵ �Է� : ");
		year = scanner.nextInt();
		for (int i = year; i < 2021; i++) {
			if (i%4 == 0 && i%100 != 0 || i%400 ==0  ) {
				System.out.println(i + "���� �����Դϴ�.");
			} else {
				System.out.println(i +"���� ����Դϴ�.");
				

			}
		}
		
	}

}
