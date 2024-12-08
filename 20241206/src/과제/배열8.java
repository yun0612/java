package 과제;

import java.util.Scanner;

public class 배열8 {

	public static void main(String[] args) {
		/*
		 * 국가별 메달 집계
		 * 국가 코드 : 10=한국, 20=미국, 30=일본, 40=독일
		 * 메달 코드 : 1=금메달, 2=은메달, 3=동메달
		 * 국가 코드와 메달 코드를 입력받고 해당 국가에 메달 개수를 증가시킴
		 * 단, 국가 코드가 0일 경우 입력을 중지시키고 결과 출력
		 */
		
		int kcode;
		int mcode;
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[4][3];
		
		while (true) {
			// 국가코드, 메달코드 입력 받기
			kcode = sc.nextInt();
			if (kcode == 0) break;
			mcode = sc.nextInt();
			
			// 해당 국가의 메달 증가
			score[kcode / 10 - 1][mcode - 1]++;
		}
		
		System.out.println("\t금메달\t은메알\t동메달\t합계");
		
		String[] nation = {"한국", "미국", "일본", "독일"};
		int gold = 0;
		int silver = 0;
		int bronze = 0;
		for (int i=0; i<score.length; i++) {
			System.out.print(nation[i] + "\t");
			
			int sum = 0;
			for (int j=0; j<score[0].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			
			System.out.println(sum);
			gold += score[i][0];
			silver += score[i][1];
			bronze += score[i][2];
		}
		
		System.out.printf("합계\t%d\t%d\t%d\t%d", gold, silver, bronze, gold+silver+bronze);
	}

}
