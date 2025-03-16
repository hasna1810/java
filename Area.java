//method overloading
import java.util.Scanner;
class Area{
    public static int area(int l,int b){
        return l*b;
    
    }
    public static double arearect(double l,double b){
        return l*b;
    }
    public static int area(int s){
        return s*s;
    }
    public static double areasquare(double s){
        return s*s;
    }
    public static double area(double r){
        return 3.14*r*r;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        Double l=sc.nextDouble();
        System.out.println("Enter the breadth of rectangle");
        Double b=sc.nextDouble();
        System.out.println("Area of rectangle is "+arearect(l,b));
        System.out.println("Enter the side of square");
        int s=sc.nextInt();
        System.out.println("Area of square is "+area(s));
        System.out.println("Enter the radius of circle");
        double r=sc.nextDouble();
        System.out.println("Area of circle is "+area(r));
        
    }
}