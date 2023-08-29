package String;

public class StringDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer("Welcome");
		System.out.println(buffer.capacity());
		buffer.append(" to java");
		System.out.println(buffer);
//		System.out.println(buffer.reverse());// this point string is reversed if i want to replace anything this can only do from this reversed string
		buffer.replace(8, 10, "from");
		System.out.println(buffer);
		buffer.delete(8, 12);
		System.out.println(buffer);
		
		

	}
}
