package caldistance;

public class CalPlanetDistance {

	public static void main(String[] args) {
		double proxima = (double) (40 * Math.pow(10, 12));
		double lightSpeed = (double) (3 * Math.pow(10, 5));
		double year = 60 * 60 * 24 * 365 ;
		System.out.println( proxima/lightSpeed*year );
	}

}
