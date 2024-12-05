public class Test03 {
	public static void main(String[] args) {
		/* 조건문 */
		// 학점 계산
		int score = 100;
		
		// if-else
		if (score >= 90) {
			System.out.println("A");
		}
		else if (score >= 80) {
			System.out.println("B");
		}
		else if (score >= 70) {
			System.out.println("C");
		}
		else if (score >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		// switch
		// break문이 없으면 다음 case 명령문 순서대로 실행
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		System.out.println();
		
		/* 반복문 */
		// 1부터 10까지 짝수 출력
		// for
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// while
		int i = 1;
		while (i<=10) {
			if (i%2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		// do while
		// while (조건) 뒤에 세미콜론!!
		i = 1;
		do {
			if (i%2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		} while (i<=10);
	}
}
