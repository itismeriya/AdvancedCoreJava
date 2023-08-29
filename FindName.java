package ArrayDemo;
import java.util.Scanner;

public class FindName {
	    static void wordSearch(String[] name, String e) {
	        int pos = -1; // indicating name not found
	        for (int i = 0; i < name.length; i++) {
	            if (name[i].equals(e)) {
	                pos = i;
	                break;
	            }
	        }

	        if (pos != -1) {
	            System.out.println("\nThe name is found at position " + (pos + 1));
	        } else {
	            System.out.println("\nName is not found");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string : ");

	        String[] name = new String[3];

	        for (int i = 0; i < name.length; i++) {
	            name[i] = sc.nextLine();
	        }
	        System.out.println("\nThe names of the array are : ");
	        for (int i = 0; i < name.length; i++) {
	            System.out.println(name[i]);
	        }
	        System.out.println("\nEnter the word which you want to search : ");
	        String key = sc.nextLine();
	        wordSearch(name, key);
	    }
	}
