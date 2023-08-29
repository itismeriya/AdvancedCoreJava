package String;
import java.util.Scanner;
public class LastOccurence {





    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Write a word:");
           
        String str = sc.nextLine();
        int lastOIndex = str.lastIndexOf('o');
        int lastCommaIndex = str.lastIndexOf(',');
        System.out.println("Last occurrence of 'o': " + lastOIndex);
        System.out.println("Last occurrence of ',': " + lastCommaIndex);
    }
}