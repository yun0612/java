package 과제;

public class 제어문3 {
	public static void main(String[] args) {
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * ******
		 * ******
		 * ******
		 */
		
		// 총 8줄 -> 8번 반복
		for (int i=0; i<8; i++) {
			for (int j=0; j<=i; j++) {
				// 6번 초과시 중단
				if (j >= 6) break;
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
