public class Factorial {
    public static void main(String[] args) {
        int i,fact=1;
        int n = 4;
        for(i=1;i<=n;i++)
        {
            fact = fact *i;
        }
        System.out.println("the factorial of "+n+ " is "+ fact);
    }
    
}
