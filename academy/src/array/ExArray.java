package array;

public class ExArray {

	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<array.length; i++) {
			int[] array2 = array[i];
			for(int j=0; j<array2.length; j++) {
				System.out.printf("array[%d][%d]\n",i,array2[j]);
			}
		}
		
		
	}
}
