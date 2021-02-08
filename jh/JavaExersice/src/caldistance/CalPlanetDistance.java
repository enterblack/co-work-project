package caldistance;

public class CalPlanetDistance {

	public static void main(String[] args) {
//		double proxima = (double) (40 * Math.pow(10, 12));
//		double lightSpeed = (double) (3 * Math.pow(10, 5));
//		double year = 60 * 60 * 24 * 365 ;
//		System.out.println( proxima/lightSpeed*year );
		
		double proxima2 = 40e12;
		final double lightSpeed = 30e4;
		
		double secs = proxima2/lightSpeed;
		
		double lightYear = secs/(60.0 * 60.0 * 24.0 * 365.0);
		System.out.println(lightYear);
		
	}

}
