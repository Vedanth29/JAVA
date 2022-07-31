import java.util.*;
public class Greatestnum 
{
    public static void main(String[] args) {
    int x,y,z;
    System.out.println("Enter the three number");
    Scanner sc = new Scanner(System.in);
    x = sc.nextInt();
    y = sc.nextInt();
    z = sc.nextInt();
    if(x>y & x>z)
    {
        System.out.println(x+" is the greatest number");
    }
    if(y>x & y>z)
    {
        System.out.println(y+" is the greatest number");
    }else{
        System.out.println(z+" is the greatest number");
    }



    }
}
