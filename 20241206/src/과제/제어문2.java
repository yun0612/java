package 과제;

public class 제어문2 {

	public static void main(String[] args) {
		/* 1~50 소수 구하기 */
		
		// 소수는 1과 자기자신을 제외한 수로 나누어 떨어지지 않으므로 1 제외
		for (int i=2; i<=50; i++) {
			int cnt = 0;
			for (int j=2; j<i; j++) {
				// 나누어 떨어지는 수가 있으면 cnt 1씩 증가 (1과 자기자신 제외)
				if (i%j == 0) cnt++;
			}
			
			if (cnt == 0) System.out.println(i + " ");
		}
	}

}
