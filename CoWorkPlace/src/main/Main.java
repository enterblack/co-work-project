package main;

import java.util.Scanner;

class Calculate
{
	int add(int n1,int n2)
	{
		return n1 + n2;
	}
	//���̳ʽ� �߰� ��Ź 
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
		
		System.out.println("���ϱ� = " + cal.add(num1, num2));
				
	}

}
