public class Test02 {
	public static void main(String[] args) {
		// switch문 활용 사칙연산 계산기
		int a = 10;
		int b = 20;
		char operator = '/';
		
		switch (operator) {
		case '+' :
			System.out.printf("%d + %d = %d", a, b, a+b);
			break;
		case '-' :
			System.out.printf("%d - %d = %d", a, b, a-b);
			break;
		case '*' :
			System.out.printf("%d * %d = %d", a, b, a*b);
			break;
		case '/' :
			System.out.printf("%d / %d = %.2f", a, b, a/(double)b);
			break;
		default:
			System.out.println("올바른 연산자가 아닙니다");	
		}
	}
}
