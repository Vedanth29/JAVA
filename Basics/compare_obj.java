public class compare_obj
{
    public static void main(String[] args) {
        Double x = new Double(123.45678);
        Long y = new Long(6787878);
        System.out.println("objects are not equal, hence it return "+ x.equals(y) );
        System.out.println("objects are equal, hence it return "+ x.equals(123.45678));

        /*Employee emp1 = new Employee(21,"vedanth");
        Employee emp2 = new Employee(21,"Vedanth");

        int a = emp1.hashCode();
        int b = emp2.hashCode();

        System.out.println("comparing emp1 with emp2 "+ emp1.equals(emp2));*/
    }
    
}
