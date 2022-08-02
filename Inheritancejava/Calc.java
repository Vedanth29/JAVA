class Main
{
    int a;
    int b;
    
    Main(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    void show()
    {
        System.out.println("The numbers choosen to:");
    }
    public void FIBONACCI() {
    }
}
class Calculator extends Main
{
    Calculator(int a, int b) 
    {
        super(a, b); // referring to inherit parent class constructor
    }
    int add;
    int sub;
    int mul;
    float div;
    void show()
    {
        add = a+b;
        System.out.println("ADD::"+add);
        sub = a-b;
        System.out.println("SUB::"+sub);
        mul = a*b;
        System.out.println("MUL::"+mul);
        div = a/b;
        System.out.println("DIV::"+div);
    }
    
}

public class Calc {
    public static void main(String[] args) {
        Calculator n = new Calculator(40,20);
        n.show();

    }
}
