package interview.algorithms;

public class TwoNumberSumWithoutSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	//Brute force
	
	public static int[] twoSum(int[]a ,int target) {
		int ptr = 0;
		//String an ;
		while(ptr < a.length) {
			int nextNum = target - a[ptr];
			for(int i =ptr+1;i<a.length;i++){
	            if(a[i] == nextNum) {
	            	return new int[] {ptr,i};
	            }
	            
	        }
			ptr++;
			
		}
        return new int[0];
	}
	
	

}
