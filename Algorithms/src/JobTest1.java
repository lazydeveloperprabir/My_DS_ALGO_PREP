import java.util.HashMap;
import java.util.Map;

public class JobTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("BALLOON"));
		System.out.println(solution("BAONXXOLL"));
		System.out.println(solution("BAOOLLNNOLOLGBAX"));

	}
	
	public static int solution(String S) {
        // write your code in Java SE 8
        Map<Character,Integer> stringToCharMap = charCountInString(S);
        int iterCount =0;
        
        while(stringToCharMap.get('B') >= 1 && stringToCharMap.get('A') >=1 
        		&& stringToCharMap.get('L') >= 2 && stringToCharMap.get('O') >= 2 && stringToCharMap.get('N') >= 1) {
        	iterCount ++;
        	stringToCharMap.put('B', stringToCharMap.get('B') -1 );
        	stringToCharMap.put('A', stringToCharMap.get('A') -1 );
        	stringToCharMap.put('L', stringToCharMap.get('L') -2 );
        	stringToCharMap.put('O', stringToCharMap.get('O') -2 );
        	stringToCharMap.put('N', stringToCharMap.get('N') -1 );
        }
        return iterCount;
        
    }
    
    
    public static  Map<Character,Integer> charCountInString(String s){
        
        Map<Character,Integer> countMap = new HashMap<Character,Integer>();
        
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(! countMap.containsKey(ch)){
                countMap.put(ch,1);
            } else {
                int val = countMap.get(ch);
                countMap.put(ch,val +1);
            }
        }
        
        return countMap;
        
    }

}
