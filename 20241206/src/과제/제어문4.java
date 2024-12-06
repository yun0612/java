package 과제;

import java.util.Iterator;

public class 제어문4 {

	public static void main(String[] args) {
		/*
		 * *******
		 * ******
		 * *****
		 * ****
		 * ***
		 * **
		 * **
		 */
		
		// 7줄 -> 7번 반복
		for (int i=0; i<7; i++) {
			for (int j=7; j>i; j--) {
				System.out.print("*");
				// 맞지막 루프일 경우 '*' 출력 추가
				if (i == 6) System.out.print("*");
			}
			System.out.println();
		}
	}

}
