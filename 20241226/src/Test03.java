import java.util.Vector;

public class Test03 {

	public static void main(String[] args) {
		try {
			// Vector
			// ArrayList와 유사 & 크기 설정 가능(optional)
			// 						초기 용량 3, 용량 초과 시 용량 3씩 증가
			// 메모리 미리 확보 -> ArrayList보다 처리 속도 빠름
			Vector<Integer> v = new Vector<>(3, 3);
			
			// capacity() : 용량 반환
			System.out.println(v.capacity());
			v.add(10);
			v.add(20);
			v.add(30);
			
			v.add(100);
			System.out.println(v.capacity());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
