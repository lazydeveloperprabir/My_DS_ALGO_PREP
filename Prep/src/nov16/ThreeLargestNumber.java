package nov16;

import java.util.Arrays;

public class ThreeLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {141,1,17,-7,-17,-27,18,541,8,7,7};
		System.out.println(findThreeLargestNumbers(input));
		}
	
	 public static int[] findThreeLargestNumbers(int[] array) {
		    Arrays.sort(array);
				int startId = array.length -2;
				int[] largestNArr = new int[3];
				largestNArr[0] = array[startId];
				largestNArr[1] = array[startId++];
				largestNArr[2] = array[startId++];
				return largestNArr;
		  }

}
