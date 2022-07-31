public class Palindrome
{
    public static void main(String[] args) {
        int m,sum=0,temp;
        int n=575;
        temp=n;
        while(n>0)
        {
           m = n%10;
           sum = (sum *10)+m;
           n= n/10;
        }
        if(temp == sum){
            System.out.println(temp+ " it is a palindrome");
        }else{
            System.out.println(temp+ " it is not a palindrome");
        }
    }    
}
