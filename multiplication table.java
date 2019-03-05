package denver.begin.start_0228;
import java.util.Scanner;

public class MulNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dan;
		
		System.out.println("-----구구단-----");
		System.out.print("단 입력 : ");
		dan = Integer.parseInt(scanner.next());
	
		System.out.println(dan + "단");
		for (int i = 1; i < 10; i++) {
			System.out.print(dan + " X " + i + " = " + dan*i + "\t" );
		
		}		
		
		for (int i = 2; i < 10; i++) {
			System.out.println("\n" + i +"단 \n");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " X " + j + " = " + i*j + "\t");
				if (j%3 ==0)
					System.out.println("");
			}
			
		}
	}

}
