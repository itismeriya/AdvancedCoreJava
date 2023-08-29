package String;
import java.util.Scanner;
public class CheckWord {





    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Write a word:");
        String sentence = sc.nextLine();
        if (sentence.contains("I")) {
            System.out.println("The word 'I' is present in the sentence ."+sentence);
        } else {
            System.out.println("The word 'I' is not present in the sentence ."+sentence);
        }
    }
}