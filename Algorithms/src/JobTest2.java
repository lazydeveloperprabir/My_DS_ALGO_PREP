import java.util.LinkedList;

public class JobTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {1,4,-1,3,2}));

	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
       if(A.length == 1){
           return 1;
       }
       
       LinkedList<Integer> formmatedList = new LinkedList<Integer>();
       formmatedList.add(A[0]);
       boolean tailElemFound = false;
       for(int i =0;i<A.length;i++) {
    	   int nodeVal = A[i];
    	   if(nodeVal != -1 && checkIfIndexExists(nodeVal,A) && !tailElemFound) {
    		   formmatedList.add(A[nodeVal]);
    	   } else if (nodeVal == -1){
    		   formmatedList.add(nodeVal);
    		   tailElemFound = true;
    	   }   
       }
       
       return formmatedList.size();
    }
	
	public static boolean checkIfIndexExists(int val,int[] A) {
		int size = A.length;
		if(val < size) {
			return true;
		}else {
			return false;
		}
		
	}

}
