import java.awt.print.PrinterAbortException;

public class Test01 {

	public static void main(String[] args) {
		// 예외처리
		// 오류가 발생하면, catch문을 수행 후 종료됨
		// 즉, 뒤에 발생하는 오류에 대해서는 코드 실행도 하지 않고 예외 처리도 되지 않느낟
		try {
			System.out.println(10 / 0);
			String str = null;
			System.out.println(str.toString());
		} catch (ArithmeticException e){
			e.printStackTrace();	// 예외 종류 + 예외 발생 위치
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (NullPointerException e) {
			System.out.println("Null인 값에는 접근할 수 없습니다.");
		} finally {
			System.out.println("try-catch문 종료");
		}
		
		// 예외 발생시키기
		try {
			System.out.println("throw : 예외 발생 구문");
			throw new Exception("고의로 발생시킨 에러");
		} catch (Exception e) {
			// getMessage() : new Exception("msg")에서 작성한 msg 출력
			System.out.println("에러 메시지 : " + e.getMessage());
		}
		
		try {
			Exception e = new Exception();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
