public class Reversenum {
    public static void main(String[] args) {
        int n =987654321,r=0,sum=0;

        while(n>0)
        {
        r=n%10;
        sum = (sum*10)+r;
        n = n/10;
        }
        System.out.println("the reversed number is: "+sum);


    }
    
}
