package 과제;

public class 배열5 {

	public static void main(String[] args) {
		/* 동전 교환기 */
		int[] coinUnit = {500, 100, 50, 10};
		int money = 3790;
		
		System.out.println("money=" + money);
		for (int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + money/coinUnit[i]);
			money %= coinUnit[i];
		}
	}

}
