
public class ReverseAString {

	int a = 200;
	
	static String reverse(String s) {
		if(s==null) {
			return new String("");
		}else {
			StringBuilder sb = new StringBuilder();
			for(int i =s.length()-1;i>=0;i--) {
				char c = s.charAt(i);
				sb.append(c);
			}
			return sb.toString();
			
		}
	}
	public static void main(String[] args) {
		
		int a =220;
		ReverseAString r = new ReverseAString();
		System.out.println(a);
		
		int[] aw = {1,2};
		final int[] aw2 = {2,4,5};
		aw2 = aw;
		// TODO Auto-generated method stub
		System.out.println(reverse("apple"));
	}
	
	
	static  void test() {
		int a =320;
		
	}

}
