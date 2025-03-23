import java.util.Scanner;
class Multiplicationtable implements Runnable{
    private int num;
    public Multiplicationtable(int num) {
        this.num = num;
    }
    public void run(){
        System.out.println("multiplication table for number "+num);
        for(int i=1;i<=10;i++){
            System.out.println(num +" x "+i+" = "+(num*i));
            try{
                Thread.sleep(200);
            }
            catch( InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Factorfinder implements Runnable{
        private int number;
        public Factorfinder(int number){
            this.number = number;
        }
        public void run(){
    
        System.out.println("Factor of "+number+" : ");
        for(int i=1;i<=36;i++){
            if(number%i==0){
                System.out.println("Factor :"+i);
            }
            try{
                Thread.sleep(300);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            }
    }
}


public class classDemo {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to fing its multiplication table");
    int tnum=sc.nextInt();

    System.out.println("enter a number to find its factor:");
    int usernumber=sc.nextInt();
    sc.close();
    Multiplicationtable tabletask=new Multiplicationtable(tnum);
    Factorfinder factortask=new Factorfinder(usernumber);
    Thread tablethread=new Thread(tabletask);
    Thread factorthread=new Thread(factortask);
    tablethread.start();
    factorthread.start();
    System.out.println("main thread continous");
    try{
        tablethread.join();
        factorthread.join();
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
System.out.println("both threads are finished");


 } 
}
