public class Test02 {
	public static void main(String[] args) {
		// 정수형 : byte, short, int, long
		int a = 10;		
		// 실수형 : float, double
		double d = 1.3;
		
		// 예제
		double pi = 3.141592;
		int r = 5;
		double area;
		
		area = r*r*pi;
		// python과 달리 + 연산자로 변수와 문자열 연결 가능
		System.out.println("원의 면적= " + area);
		
		// 문자형
		// ASCII : 'A'=65, 'a'=97, '1'=49
		char c = 'A';
		String str = "Hi";
		System.out.println(c);
		System.out.println(str);
		
		// 논리형
		boolean bool = true;
		// ! = not
		System.out.println(!bool);
	}
}
