package main;

import java.util.Scanner;

class Calculate
{
	int add(int n1,int n2)
	{
		return n1 + n2;
	}
	//마이너스 추가 부탁 
}

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 ;
		int num2 ;
		Calculate cal = new Calculate();
		
		
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		
		System.out.println(num1+ "," + num2);
		
		System.out.println("더하기 = " + cal.add(num1, num2));
				
	}

}
