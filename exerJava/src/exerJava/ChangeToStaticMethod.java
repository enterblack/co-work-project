package exerJava;

class simpleMath
{
	public static final double PI = 3.1415;
	public static double add(double n1,double n2) { return n1 + n2; }
	public static double min(double n1,double n2) { return n1 - n2; }
	public static double mul(double n1,double n2) { return n1 * n2; }
}

class AreaMath
{
	public static double calCircleArea(double rad)
	{
		double result =simpleMath.mul(rad, rad);
		result = simpleMath.mul(rad, simpleMath.PI);
		return result;
	}
	public static double calRectangleArea(double width,double height)
	{
		return simpleMath.mul(width, height);
	}
}

class PerimeterMath
{
	public static double calCirclePeri(double rad)
	{
		double result = simpleMath.mul(rad, 2);
		result = simpleMath.mul(result, simpleMath.PI);
		
		return result;
	}
	
	public static double calRectanglePeri(double width,double height)
	{
		return simpleMath.add(simpleMath.mul(width, 2), simpleMath.mul(height, 2));
	}
	
}

public class ChangeToStaticMethod {
	public static void main(String args[])
	{
		System.out.println("원의 넓이 :" + AreaMath.calCircleArea(2.4));
		System.out.println("직사각형 둘레 :" + PerimeterMath.calRectanglePeri(2.0, 4.0));
	}
}
