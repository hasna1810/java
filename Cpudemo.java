import java.util.Scanner;
class CPU{
    int price;
    public CPU(int price){
        this.price=price;
    }
    public void display(){
        System.out.println("price of the cpu is:"+price);
    }
    class Processor{
        int core;
        String man;
        public Processor(int core,String man){
            this.core=core;
            this.man=man;
        }
        public void display(){
            System.out.println("core of the processor is:"+core+"\n manufacture is:"+man);
        }
    }
   static class RAM{
        String mem;
        String mans;
        public RAM(String mem,String mans){
            this.mem=mem;
            this.mans=mans;
    
        }
        public void display(){
            System.out.println("memory of the ram is:"+mem+"\n manufactured by:"+mans);
        }
    }
}


public class Cpudemo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the price:");
        int price=sc.nextInt();
        CPU c=new CPU(price);
        System.out.println("enter the core:");
        int core=sc.nextInt();
        System.out.println("enter the manufracture:");
        String man=sc.next();
        CPU.Processor p=c.new Processor(core,man);
        System.out.println("enter the memory:");
        String mem=sc.next();
        System.out.println("enter the manufactured by:");
        String mans=sc.next();
        CPU.RAM r=new CPU.RAM(mem,mans);
        c.display();
        p.display();
        r.display();

    }
    
}
