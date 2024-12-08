package 과제;

import java.util.Scanner;

public class 배열7 {

	public static void main(String[] args) {
		/* 주민등록번호 체크 알고리즘 */
		
		// 주민등록번호 13자리 입력받기
		String[] ju = new String[13];
		
		Scanner sc = new Scanner(System.in);
		String full_ju = sc.next();	// 0이 무시되지 않기 위해 문자열로 저장
		
		if (full_ju.length() != 13) {
			System.out.println("주민등록번호 13자리를 입력해주세요");
			full_ju = sc.next();
		}
		
		for (int i=0; i<13; i++) {
			ju[i] = full_ju.substring(i, i+1);
		}
		
		// 가중치 적용한 총합 구하기
		int[] weight = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
		int sum = 0;
		
		for (int i=0; i<weight.length; i++) {
			sum += Integer.parseInt(ju[i]) *weight[i];
		}
		
		// check digit 구하기
		// 11을 총합을 11로 나눈 나머지를 뺀 후, 10으로 나눈 나머지
		int check_digit = (11 - sum % 11) % 10;
		
		// 주민등록번호 마지막 13번째 수와 check digit이 같은지 비교
		if (check_digit == Integer.parseInt(ju[12])) System.out.println("OK");
		else System.out.println("ERROR");
	}

}
