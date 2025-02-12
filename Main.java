import java.util.Scanner;
interface Measurable{
    public double area();
    public double perimeter();
}
class Circle implements Measurable{
    double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI *radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public void display(){
        System.out.println("Radius:"+radius);
        System.out.println("Area of the circle is:"+area());
        System.out.println("Perimeter of the circle is:"+perimeter());
    }
    }


class Rectangle implements Measurable{
    double length;
    double width;
    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
    public void display(){
        System.out.println("length:"+length+"  width:"+width);
        System.out.println("Area of the rectangle is:"+area());
        System.out.println("Perimeter of the rectangle is:"+perimeter());
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter the radius of circle:");
        double radius=sc.nextDouble();

        Circle c=new Circle(radius);
        c.display();

        System.out.print("Enter length of the rectangle:");
        double length=sc.nextDouble();

        System.out.print("Enter width of the rectangle:");
        double width=sc.nextDouble();

        Rectangle r=new Rectangle(length,width);
        r.display();

        sc.close();






    }
}
