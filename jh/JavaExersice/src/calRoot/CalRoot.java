package calRoot;

public class CalRoot {
	
	public static void main(String args[]) {
		//근의 공식을 이용한 2차방정식의 해 2개를 구함
		long b = (long) -3.0;
		long c = (long) 2.0;

		long middleCal = b * b - 4 * c; 
		
		long root1 = (-b + middleCal) /2;
		long root2 = (-b - middleCal) /2;
		
		System.out.println(root1 + " " + root2);
	}
}
