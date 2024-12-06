/*
 * 자동 줄 바꿈 : alt + shift + Y
 */

public class Test01 {
	public static void main(String[] args) {
		// 1. 두 수 a,b를 교체하시오
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("before");
		System.out.println("a = " + a + " b = " + b);
		
		temp = 10;
		a = b;
		b = temp;
		System.out.println("after");
		System.out.println("a = " + a + " b = " + b);
		System.out.println();
		
		
		// 2. 네 개의 수 a,b,c,d 중 최대값을 출력하시오
		a = 10;
		b = 20;
		int c = 30;
		int d = 40;
		
		int max = a;
		if (max > b) max = b;
		if (max > c) max = c;
		if (max > d) max = d;
		System.out.println("max = " + max);
		System.out.println();
		
		
		// 3. 세 개의 점수 a,b,c 중 하나라도 40점 미만이거나 평균이 60점 미만이면 "불합격", 그 외에는 "합격" 출력
		a = 100;
		b = 50;
		c = 90;
		
		double average = (a+b+c) / 3.0;
		if (a<40 | b<40 | c<40 | average<60) System.out.println("불합격");
		else System.out.println("합격");
	}
}
