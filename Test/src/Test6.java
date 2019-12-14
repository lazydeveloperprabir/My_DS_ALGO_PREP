public class Test6{
	public static void main(String[] args) {

		try {
			bad();
			System.out.println("A");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("c");
		}finally {
			System.out.println("D");
		}
		System.out.println("E");
		
}
	
	static void bad() {
		throw new Error();
	}
}