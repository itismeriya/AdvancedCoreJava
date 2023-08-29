package String;
import java.util.Scanner;
public class JoinString {





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        
        String joinedString = string1 + string2;
        System.out.println("Joined string: " + joinedString);
    }
}