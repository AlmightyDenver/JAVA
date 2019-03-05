package denver.begin.start_0304;

public class BreakTest {

	
	public static void main(String[] args) {
		
		
		int i = 0;
		//int i stack 에 저장됨
		
		while (i<=10) {
			System.out.println(i + "파이팅!!");
			i++;
			
		}
		
		for (int j = 0; j <= 10 ; j++) {
			if (j == 14)
				continue;
			//4만 빼고(pass) 	
			
			System.out.println(j);
		

		}
		
		TE : for (int k = 2; k < 10; k++) {
			for (int j = 1; j < 9; j++) {
				
				if (j == 5) {
					break TE;
					//TE를 레이블이라함.TE 끝내라
					
				}
				System.err.println(j+ " x " + k + "=" + j*k);
			}
		
			
		}
		
		
			for (int a = 0; a < 11; a++) {
				if (a%2 == 0)
					continue;
						
					System.out.println(a);
				
			}
			
		
		
	}
	
	 

}
