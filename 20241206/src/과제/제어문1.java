package 과제;

public class 제어문1 {

	public static void main(String[] args) {
		/* 최대공약수, 최소공배수 */
		
		// main 함수 매개변수로 들어온 문자열 4와 6을 int로 변환
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int i;
		
		// 최대공약수
		for (i=n; i>0; i--) {
			// 1부터 n까지의 수 중 n과 m의 공약수이면 루프 탈출 (공약수)
			// n부터 작아지면서 비교하므로 i는 최대공약수가 됨
			if (n%i==0 && m%i==0) break;
		}
		
		if (i == 1) System.out.println("최대공약수가 없습니다");
		else System.out.println("최대공약수 = " + i);
		
		// 최소공배수
		for (i=1; i<=n*m; i++) {
			// 1부터 n*m까지의 수 중 n의 배수이면서 m의 배수면 루프 탈출 (공배수)
			// 1부터 커지면서 비교하므로 i는 최소공배수가 됨
			if (i%n==0 && i%m==0) break;
		}
		System.out.println("최소공배수 = " + i);
	}

}
