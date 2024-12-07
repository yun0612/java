package 과제;

public class 배열4 {

	public static void main(String[] args) {
		/* 2차원 배열로 저장된 국어,영어,수학 점수의 총점과 평균 */
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
				};
		int total_korean = 0;
		int total_english = 0;
		int total_math = 0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==================================================");
		
		for (int i=0; i<score.length; i++) {
			int[] row = score[i];
			int sum = 0;
			double average;
			
			total_korean += score[i][0];
			total_english += score[i][1];
			total_math += score[i][2];
			
			System.out.printf("%d\t", i+1);
			for (int j=0; j<3; j++) {
				System.out.printf("%d\t", score[i][j]);
				sum += score[i][j];
			}
			average = sum / 3.0;
			System.out.println(sum + "\t" + average);
		}
		
		System.out.println("==================================================");
		System.out.printf("총점\t%d\t%d\t%d", total_korean, total_english, total_math);;
	}

}