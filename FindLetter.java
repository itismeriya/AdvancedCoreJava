package String;
import java.util.*;
public class FindLetter{

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Write a word:");
            String word = sc.nextLine();
            if (word.contains("e")) {
                System.out.println("The letter 'e' is present in the word "+word);
            } else {
                System.out.println("The letter 'e' is not present in the word "+word);
            }
        }
    }