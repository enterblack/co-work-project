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
			int strike = countCorrectNumber(answer, sumitArray);
			// 정답일경우 즉 3스트라이크일경우 정답알림과 프로그램종료
			if(strike == 3){
				System.out.println("정답입니다. 축하드립니다!");
				System.exit(0);
			}
			System.out.println(strike+"스트라이크입니다. 좀만더 해보세요!");
			
		}
	}

	private static int countCorrectNumber(char[] answer, char[] sumitArray) {
		int strike = 0;
		int ball = 0;
		for(int i=0 ; i<answer.length ; i++) {
			if(answer[i] == sumitArray[i]) {
				strike++;
			}
		}
		return strike;
	}


	
	
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
