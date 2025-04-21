class Counter{
    int count=10;
    public synchronized   void increment(){
        count++;
        System.out.println("count:"+count);
    }
    public synchronized void decrement(){
        count--;
        System.out.println("count:"+count);
    }
    public synchronized int getcount(){
        return count;
    }
}
class Incrementer implements Runnable{
    private Counter c;
    public  Incrementer(Counter c){
        this.c=c;
    }
    public void run(){
        for (int i=0;i<10;i++){
            c.increment();
        
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

}
}
class Decrementer implements Runnable{
    Counter c;
    public Decrementer(Counter c){
        this.c=c;
    }
    public void run(){
        for (int i=0;i<10;i++){
            c.decrement();
            try {
                Thread.sleep(200);
            } catch ( InterruptedException e) {
                e.printStackTrace();
            }
            }

    }
}

public class CDemo {
    public static void main(String[] args){
        Counter c=new Counter();
        Thread t1=new Thread(new Incrementer(c));
        Thread t2=new Thread(new Decrementer(c));
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("count:"+c.getcount());
    }
    
}
