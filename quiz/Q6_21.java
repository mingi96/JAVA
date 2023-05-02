package quiz;

public class Q6_21 {
	public static int max(int[] arr) {
		//주어진 배열이 null이거나 크기가 0이면 -999999
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		
		int max = arr[0]; //배열의 첫번째 값
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) { //arr[i]: 
				max = arr[i];
			}
		}
	}
	
	public static void main(String[] args) {
		int[] data = { 3, 2, 9, 4, 7 };
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[] {})); // 크기가 0인 배열

	}

}
