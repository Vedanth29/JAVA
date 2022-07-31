class Fibonacci
{
    public static void main(String[] args) 
    {
            int i,n1=0,n2=1,n3=0;
            int n=20;
            System.out.println(n1+"\n"+n2);
            for(i=0;i<n;++i)
            {
                n3=n1+n2;
                n1 = n2;
                n2 = n3;
                System.out.println(n3);

            }
    }
}