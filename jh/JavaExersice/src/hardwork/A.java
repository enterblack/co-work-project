package hardwork;

import java.util.Arrays;

public class A {
	public static void main(String[] args) {
		solution("{{4,2,3},{3},{2,3,4,1},{2,3}}");
	}

	private static int[] solution(String s) {
		
		int bracketCount = 0;
		int bracket = 0;
		int[] arrayLength;
		//s = s.substring(1,s.length()-1);
		//System.out.print(s);
		//대괄호를 세서 몇개의 배열이 있는지 확인
		s = s.substring(1,s.length()-1);
		System.out.println(s);
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i)=='{') {
				bracket++;
			}
		}
		//배열을 선언  을 하지 말고 배열의 길이를 정렬하자
		String[] answerStr = new String[bracket];
		arrayLength = new int[bracket];
		int tempLength = 0;
		String tempStr = "";
		for(int i=0 ; i<s.length() ; i++) {
			if(s.charAt(i)=='{' || s.charAt(i) ==',') {
				continue;	
			}
			//괄호가 닫혔을때 그동안 모았던 String문장을 자름
			//배열의 길이도 구하고 저장
			else if(s.charAt(i)=='}') {
				answerStr[bracketCount] = tempStr;
				tempStr = "";
				//bracketCount++;
				
				
				arrayLength[bracketCount] = tempLength;
				bracketCount++;
				tempLength = 0;
			}else{
				tempStr += s.charAt(i);
				tempLength++;
			}
		}
		

		//버블정렬!로 오름차순으로 정렬
		for(int i=0 ; i<arrayLength.length ; i++) {
			for(int j=i+1 ; j<arrayLength.length ; j++) {
				if(arrayLength[i] > arrayLength[j]) {
				
					
					String changeStr = answerStr[i];
					answerStr[i] = answerStr[j];
					answerStr[j] = changeStr;
					
					int changeInt = arrayLength[i];
					arrayLength[i] = arrayLength[j];
					arrayLength[j] = changeInt;
				}
			}
			
		}
		//아놔 배열을 2개를 동시에 바꾸어야 되는데 왜 계속 하나만 바꿀려고 노오력을 했을까? ㅋㅋㅋㅋ 
		//어이가 없네 ㅋㅋㅋㅋㅋ
		//2021-05-06 21:29
		System.out.println(arrayLength[0] + " " + arrayLength[1] + " " + arrayLength[2] + " " + arrayLength[3] );
		System.out.println(answerStr[0] + " " + answerStr[1] + " " + answerStr[2] + " " + answerStr[3]);
		//이제 진짜로 순서대로 들어온 숫자를 받아서 배열로 바꾸면 끝!
		
		int[] array = new int[arrayLength.length];
		
		
		for(int i=0 ; i<arrayLength.length ; i++) {
		
			array[i] = Integer.parseInt(answerStr[i]);
		}
		
		for(int i=0 ; i<array.length ; i++) {
			System.out.print(array[i] + " ");
		}
		return array;
	}
}
