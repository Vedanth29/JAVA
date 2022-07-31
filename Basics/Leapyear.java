public class Leapyear {
    public static void main(String[] args) {
        int year =2003,flag=0;
        if(year%4==0 & year%100!=0){
            System.out.println(year+" this year is a leap year");
            flag=1;
        }
        if(year%100==0 & year%400==0){
            System.out.println(year+" this year is a leap year and a century year");
            flag=1;
        }    
        if(flag==0){
            System.out.println(year+" this year is not a leap year");

        }
    }
}