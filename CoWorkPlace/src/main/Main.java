package main;

import java.util.Scanner;

class Calculate
{
	int add(int n1,int n2)
	{
		return n1 + n2;
	}

	int minus(int n1,int n2)
	{
		return n1 - n2;
	}
	int divide(int n1,int n2)
	{
		return n1 / n2;
	}
}


public class Main {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num1 ;
		int num2 ;
		char operation;
		Calculate cal = new Calculate();

		System.out.println("숫자 2개 그리고 연산자를 입력하세요");

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		operation = scanner.next().charAt(0);
		if(operation == '+') {
			System.out.println(num1+ "," + num2);
			System.out.println("더하기 = " + cal.add(num1, num2));
		}else if(operation == '-') {
			System.out.println(num1+ "," + num2);
			System.out.println("빼기 = " + cal.minus(num1, num2));
		}else if(operation == '/') {
			if(num2 == 0) {
				System.out.println("0으로 나눌수 없습니다. 프로그램을 종료합니다.");
				System.exit(0);
			}
			System.out.println(num1+ "," + num2);
			System.out.println("나누기 = " + cal.divide(num1, num2));

		}
	}
}
