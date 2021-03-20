package baseball;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		//답 제작
		char[] answer = makeAnswer();
		String answerTemp;
		char[] sumitArray = {};
		System.out.println(answer);
		//초기화면 구성
		System.out.println("야구게임입니다.세자리의 숫자를 눌러서 정답을 맟추세요!");
		while(true){
			System.out.print("정답 : ");
			int sumit = scanner.nextInt();
			if(sumit < 100 || sumit > 999) {
				System.out.println("잘못입력하셨습니다. 3자리의 숫자를 입력하세요!");
				continue;
			}

			
			answerTemp = Integer.toString(sumit);
			//이부분을 좀더 함수로 뺴서 깔끔하게 만들 예정
			sumitArray = new char[answerTemp.length()];
			for(int i=0 ; i<answerTemp.length() ; i++) {
				sumitArray[i] = answerTemp.charAt(i);
			}
			int strike = countStrikeNumber(answer, sumitArray);
			int ball = countBalllNumber(answer, sumitArray);
			// 정답일경우 즉 3스트라이크일경우 정답알림과 프로그램종료
			if(strike == 3){
				System.out.println("정답입니다. 축하드립니다!");
				System.exit(0);
			}
			System.out.println(strike+"스트라이크 " + ball  + "볼입니다. 좀만더 해보세요!");
			
		}
	}
	private static int countBalllNumber(char[] answer, char[] sumitArray) {
		int ball = 0;
		for(int i=0 ; i<answer.length ; i++) {
			for(int k=0 ; k<sumitArray.length ; k++) {
				if(i==k) {
					continue;
				}
				if(answer[i] == sumitArray[k]) {
					ball++;
				}
			}
		}
		return ball;
	}
	//같은데이터에 같은 자리면 strike
	private static int countStrikeNumber(char[] answer, char[] sumitArray) {
		int strike = 0;
		for(int i=0 ; i<answer.length ; i++) {
			if(answer[i] == sumitArray[i]) {
				strike++;
			}
		}
		return strike;
	}
	//같은 데이터이지만 자리수가 다르면 ball

	
	
	private static char[] makeAnswer() {
		int number = (int) (Math.random() * 899 + 100);
		String temp = Integer.toString(number);
		char[] array = new char[temp.length()];
		for(int i=0 ; i<temp.length() ; i++) {
			array[i] = temp.charAt(i);
		}
		return array;
	}
}
