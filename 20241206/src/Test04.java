import java.util.Arrays;

public class Test04 {
	public static void main(String args[]) {
		/* 배열 array */
		// 선언		// 생성
		int[] arr1 = new int[5];	// new로 선언하면 배열 크기 지정
		// new로 생성시 한번에 초기화 불가능, 일일이 수작업으로 넣어야 함
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		for (int i=0; i<arr1.length; i++) {
			System.out.println(i + "번째 요소: " + arr1[i]);
		}
		System.out.println();
		
		// 선언			// 초기화
		String[] arr2 = {"Hi", "Hello", "Bye"};	// 배열 크기 자동 측정
		
		// .length : 배열의 길이(요소 개수) 반환하는 속성
		for (int i=0; i<arr2.length; i++) {
			System.out.println(i + "번째 요소: " + arr2[i]);
		}
		
		/* 2차원 배열 */
		int[][] test1 = new int[2][2];
		int[][] test2 = {
				{1, 1, 3},
				{2, 2, 4}, 
				{3, 5}
		};
		
		// 2차원 배열에서 그냥 배열명.length는 [1][2] 중 1의 길이 반환
		// 배열명[n].length는 [1][2] 중 2의 길이 반환
		System.out.println(test2.length);
		System.out.println(test2[0].length);
		System.out.println(test2[2].length);
		
		// 2차원 배열은 인덱싱으로 직접 값 출력 불가
		// 방법 1. 이중 for문 활용, 1차원 배열로 변환
		for (int i=0; i<test2.length; i++) {
			int[] temp = test2[i];
			for (int j=0; j<temp.length; j++) {
				System.out.print(temp[j] + " ");
			}
			System.out.println();
		}
		
		// 방법 2. Arrays.deepToString(arr) 활용 (import java.util.Arrays)
		System.out.println(Arrays.deepToString(test2));
	}
}