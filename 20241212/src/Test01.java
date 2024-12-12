
public class Test01 {
	
	/*
	 * 메서드 생성
	 * : [접근제한자] [static] 반환형 함수명 (매개변수_리스트) { do something... }
	 * 
	 * 접근 제한자
	 * 	1. public : 외부 클래스에서 사용 가능
	 * 	2. protected : 패키지 내 or 자식 클래스에서만 사용 가능
	 * 	3. (default) : 패키지 내에서만 사용 가능
	 * 	4. private : 클래스 내에서만 사용 가능
	 * 
	 * static : 객체 생성 없이 호출 가능
	 */
	public static void max(int a, int b) {
		int max;
		
		if (a >= b) max = a;
		else max = b;
		
		System.out.println("max = " + max);
	}
	
	// 메서드 오버로딩 : 매개변수가 다른 동명의 메서드 작성
	public static void max(int[] arr) {
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (max < arr[i]) max = arr[i];
		}
		
		System.out.println("max = " + max);
	}

	public static void main(String[] args) { 
		max(10, 20);
		
		int[] arr = {10, 5, 20, 15};
		max(arr);
	}

}
