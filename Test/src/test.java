
import java.util.*;
public class test {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3}));
		String s= "   aaa ";
		String s1 =  s.trim();
		System.out.println(s1);
		

	}

	public static int solution(int[] A) {
		int num = 1;
        HashSet<Integer> hset = new HashSet<Integer>();

        for (int i = 0 ; i < A.length; i++) {
            hset.add(A[i]);                     
        }

         while (hset.contains(num)) {
                num++;
            }

        return num;
	}
}
