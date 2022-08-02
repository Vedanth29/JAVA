// Parent class
class Parent 
{
   int x;
   String y;
   Parent()  // constructor
   {
        x=26;
        y="Vedanth";  
   }
   void show()
   {
    System.out.println("name::"+y+" roll no.::"+x);
   }
}

// child class
class Child extends Parent
{
    String a,b;
    Child()
    {
        a="india";
        b="asia";
        
    }
    void show1()
    {
        System.out.println("Country::"+a+" Continent::"+b);
    }

}

// main class
public class Inheritance
{
    public static void main(String[] args) {
        Child n = new Child();
        n.show();
        n.show1();


    }
}