import java.util.Scanner;
public class Multiplyfloatnum {
    public static void main(String[] args) {
        float x=0,y=0,z=0;
        System.out.println("Enter the two floating number:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        y = sc.nextFloat();
        z = x * y;
        System.out.println("the multiplied value is "+z);



    }
    
}
