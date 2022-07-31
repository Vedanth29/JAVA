public class Neonnum {
    public static void main(String[] args) {
        int n,mul,temp1=0,r,temp2=0;
        for(n=0;n<10000;n++) // check number from 1 to 10000
        {
            mul = n*n;
            r =mul%10;
            temp1 = r;
            r =mul/10;
            temp2 = r;
            if(n==10){
                break;
            }
            if(temp1+temp2==n){
                System.out.println(n+" is a neon number");
            }
        }
    }
    
}
