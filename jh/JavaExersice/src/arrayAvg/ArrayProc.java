package arrayAvg;

public class ArrayProc {
	float result = 0;
	float inc(int[] array) {
		for(int i=0; i<array.length ; i++) {
			result += array[i]; 
		}
		
		result = result / array.length;
		return result;
	}
	
}
