package String;

public class StringDemo1 {

	
		public static void main(String[] args)
		{
			String s1 = "Deesha";
			String s2 = "Deesha";
			String s3 = "deesha";
			//String s4;
			System.out.println(s1==s2);  //checks the equality of the string object reference
			System.out.println(s1==s3);  //checks the equality of the string object reference
			System.out.println(s1.equals(s2));  //checks the equality of the content of the string
			System.out.println(s1.equals(s3));  //checks the equality of the content of the string
			s1.concat("Basu");  //this will not concatenate with string s1 because it is pointing to 
			                    //the original string s1 reference
			
			System.out.println(s1);  //it prints the string s1 without concatenation
			
			s1 = s1.concat(" Basu");  //this will concatenate with string s1 because s1 has been declared 
			                          //explicitly here and another object reference has been created and 
			                          //the pointer s1 points to the newly created object in the memory 
			                          //and then concatenation occurs	
			
			System.out.println(s1);  //it prints string s1 with concatenation
			System.out.println(s2);  //it prints the string s2 without concatenation
		}

}
