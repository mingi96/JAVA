package quiz;

public class Q5_8 {

	public static void main(String[] args) {
		int max = 0;
		int[] arrays = {1, 5, 3, 8, 2};
		
		for(int array : arrays) {
			if(max < array) { //max: 0, array: 1
				max = array;				
			}
		}
		
		System.out.println(max);
	}

}
