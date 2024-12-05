/*
 * .java 파일을 컴파일하면 javac.exe가 .class로 번역
 * .cass 파일을 실행시키면 java.exe가 실행시키고 결과 보여줌
 * 
 * 실행 : ctrl + f11
 * 폰트 크리 변경 : ctrl + +/-
 * 블록 주석 생성 : ctrl + shift + /
 * 블록 주석 해제 : ctrl + shift + \
 * 줄 주석 : ctrl + /
 * 자동 완성 : ctrl + spacebar
 * 한 줄 삭제 : ctrl + D
 */

public class Test01 {
	public static void main(String[] args) {
		// 'sysout' + ctrl + spacebar 로 자동 완성 가능
		System.out.println("hello java!");
		System.out.print("no \\n");
		System.out.printf("직업: %s", "학생");
	}
}
