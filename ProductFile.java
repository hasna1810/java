import java.io.*;
import java.util.Scanner;
class Product{
    int pid;
    String name;
    int price;
    public Product(int pid,String name,int price){
        this.pid=pid;
        this.name=name;
        this.price=price;
    }
    public String toString(){
        return pid+","+name+","+price;
       }

}
public class ProductFile {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        try{
        FileWriter writer=new FileWriter("input.txt");
        System.out.println("enter the  number of products:");
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            System.out.println("enter the pid:");
            int pid=Integer.parseInt(sc.nextLine());
            System.out.println("enter the product name:");
            String name=sc.nextLine();
            System.out.println("enter the price");
            int price=Integer.parseInt(sc.nextLine());
            Product p=new Product(pid, name, price);
            writer.write(p.toString()+"\n");
        }
        writer.close();
        System.out.println("read the file");
        FileReader reader=new FileReader("input.txt");
        int ch;
        StringBuilder sb=new StringBuilder();
        while((ch=reader.read())!=-1){
            sb.append((char)ch);
        }
        reader.close();
        String[] line=sb.toString().split("\n");
        for(String x:line){
            String[] parts=x.split(",");
            if(parts.length>=2){
                System.out.println(parts[1]);
            }
        }

        }
        catch (IOException e){
            System.err.println("file error"+e.getMessage());
        }
        catch(NumberFormatException e){
            System.err.println("invalid nyumber format");

        }
        finally{
            sc.close();
        }
    }
    
}
