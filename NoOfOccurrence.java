package String;
import java.util.*;
public class NoOfOccurrence {





    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            System.out.print("Enter an alphabet: ");
            char letter = scanner.next().charAt(0);
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == letter) {
                    count++;
                }
            }
            System.out.println("Number of occurrences of " + letter + " in the string: " + count);
        }
    }