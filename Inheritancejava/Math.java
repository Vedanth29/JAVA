
class Num
{
    int n1,n2;
    Num(int n1,int n2)
    {
        this.n1=n1;
        this.n2=n2;
    }
    void show()
    {
        System.out.println("START\nADD NUMBER\nSUB NUMBER\nMUL NUMBER");
    }
}
class Fib extends Num
{
    int n2=2;
    Fib(int n1,int n2)
    {
        super(n1, n2);
    }
    String add()
    {
        return ("dsdeded"+n2);
    }
}

public class Math {
    public static void main(String[] args) {
        Fib n = new Fib(0, 1);
        n.show();
        n.add();
        
    }
    
}
