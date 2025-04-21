import java.util.Scanner;
class Factorial implements Runnable{
    private int number;
    private final Object lock;
    public Factorial(int number,Object lock){
        this.number=number;
        this.lock=lock;
    }
    public void run() {
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
            synchronized(lock){
                System.out.println("factorial of "+number+" is "+fact);
                lock.notify();
            }
            }
        }
        class Reverse implements Runnable{
            private int number;
            private final Object lock;
            public Reverse(int  number,Object lock){
                this.number=number;
                this.lock=lock;
            }
            public void run(){
                synchronized(lock){
                    try {
                        lock.wait();
                    
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int reversed=0,temp=number;
                while(temp>0){
                    reversed=reversed*10+temp%10;
                    temp=temp/10;
                }
                System.out.println("reverse of "+number+" is "+reversed);
            }
            }



public class Order {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for factorial:");
        int n=sc.nextInt();
        sc.nextLine();
        System.err.println("enter the number for reverse:");
        int m=sc.nextInt();
        sc.nextLine();

        Object lock=new Object();
        Thread t1=new Thread(new Factorial(n,lock));
        Thread t2=new Thread(new Reverse(m,lock));
        t1.start();
        Thread.sleep(200);
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        
}
}
