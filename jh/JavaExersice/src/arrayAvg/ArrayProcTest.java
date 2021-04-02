package arrayAvg;

import java.util.Scanner;

public class ArrayProcTest {
	public static void main(String[] args) {
		ArrayProc arrayProc = new ArrayProc();
		Scanner scanner = new Scanner(System.in);
		int[] array;
		float result = 0;
		array= new int[5];
		
		System.out.println("시험점수 5과목을 입력하세요 ");
		for(int i=0 ; i<5 ; i++) {
			System.out.print("입력 점수 : ");
			int input = scanner.nextInt();
			array[i] = input;
		}
		
		
		result = arrayProc.inc(array);
		System.out.println("평균 점수 : " + result );
	}
}
