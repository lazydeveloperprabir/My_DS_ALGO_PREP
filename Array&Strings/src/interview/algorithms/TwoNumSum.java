/**
 * 
 */
package interview.algorithms;

import java.util.*;

/**
 * @author prabirpadhy
 * Sample I/p - [3,5,-4,8,11,1,-1,6] target = 10
 * Sample O/P - [-1,11]
 * 
 *
 */
public class TwoNumSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(twoSum(new int[] {3,2,4},6));
	}
	
	public static int[] twoSum(int[] nums, int target) {
        int leftIndex =0;
        int rightIndex = nums.length - 1;
        while(leftIndex < rightIndex){
            int currentSum = nums[leftIndex] + nums[rightIndex];
            if(currentSum == target) {
                return new int[]{leftIndex,rightIndex};
            } else if(currentSum < target){
                leftIndex++;
            } else {
                rightIndex--;
            }
        }
        return new int[0];
    }

}
