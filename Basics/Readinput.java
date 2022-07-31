import java.util.*;
public class Readinput {
    public static void main(String[] args) {
        int num;
        String word;
        System.out.println("Enter the number to be read: ");
        Scanner ic = new Scanner(System.in);
        num = ic.nextInt();
        System.out.println("the number read is: "+num);
        System.out.println("--------------------------------------------");
        System.out.print("Enter the string to be read:\n");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        System.out.println("the string read are: "+word);


    }
    
}
