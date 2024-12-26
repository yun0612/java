import java.util.ArrayList;

public class Test02 {
	
	public static void addList(ArrayList arr, int size) {
		for (int i=0; i<size; i++) {
			// add(value) : 요소 추가
			arr.add(i*10);
		}
	}

	public static void main(String[] args) {
		try {
			// ArrayList
			ArrayList<Integer> arr = new ArrayList<>();
			addList(arr, 8);
			System.out.println(arr.toString());
			
			// remove(n) : n번째 요소 삭제
			arr.remove(1);
			arr.remove(3);
			System.out.println(arr.toString());
			
			// set(n, value) : n번째 요소를 value로 교체
			arr.set(0, 90);
			System.out.println(arr.toString());
			
			// size() : 요소의 개수 반환
			System.out.println(arr.size());
			
			// clear() : 초기화
			arr.clear();
			System.out.println(arr.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
