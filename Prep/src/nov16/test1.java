package nov16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> array = new ArrayList<>();
		array.add(2);
		array.add(1);
		array.add(2);
		array.add(2);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(2);
		
		
		System.out.println(moveElementToEnd(array,2)); 

	}
	
	public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
	    // Write your code here.
			//List<Integer> newList = new ArrayList<Integer>();
			int topElIdx = 0;
			int lastElIdx = array.size() - 1;
			int[] modifiedArray = new int[lastElIdx+1];
			
			for(int i =0;i<array.size() - 1;i++){
				int element = array.get(i);
				if(element == toMove){
					modifiedArray[lastElIdx] = element;
					lastElIdx--;
				} else {
					modifiedArray[topElIdx] = element;
					topElIdx++;
				}
			}
			
		return Arrays.stream(modifiedArray).boxed().collect(Collectors.toList());
			
	  }

}
