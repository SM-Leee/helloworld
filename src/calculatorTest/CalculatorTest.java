package calculatorTest;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int[] scores = null;
		int sum =0;
		double avg = 0;
		
		while(true) {
		System.out.println("------------------------------------");
		System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
		System.out.println("------------------------------------");
		System.out.print("선택>");
		int selectNum = scanner.nextInt();
		
		switch(selectNum) {
		case 1:
			System.out.print("학생수>");
			int arrayNum = scanner.nextInt();
			scores = new int[arrayNum];
			break;
		case 2:
			for(int i=0;i<scores.length;i++) {
				System.out.print("scores["+i+"]>");
				int scoresNum = scanner.nextInt();
				scores[i] = scoresNum;
			}
			break;
		case 3:
			for(int i=0;i<scores.length;i++) {
				System.out.println("scores["+i+"]: "+scores[i]);
			}
			break;
		case 4:
			for(int i=0;i<scores.length;i++) {
				sum += scores[i];
			}
			System.out.println("최고점수: "+sum);
			avg = sum/scores.length;
			System.out.println("평균점수: "+avg);
			break;
		case 5:
			System.out.println("프로그램종료");
			System.exit(0);
			break;
		}
		
		
		}

	}

}
