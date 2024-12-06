package 과제;

public class 제어문5 {

	public static void main(String[] args) {
		/* 구구단 한 줄에 3단씩 출력하기 */
		
		// 1`3단, 4`6단, 7`9단 3덩어리 -> 3번 반복
		for (int i=1; i<=3; i++) {
			// 각 단은 1에서 9까지 곱함 -> 9번 반복
			for (int j=1; j<=9; j++) {
				// 단수 카운트
				int num = 3*i - 2;
				
				// 각 줄은 3단씩 -> 3번 반복
				for (int k=0; k<3; k++) {
					System.out.printf("%d*%d=%d\t", num, j, num*j);
					num++;
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
