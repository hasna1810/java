class Multiplicationtable implements Runnable{
    public void run(){
        System.out.println("multiplication table:");
        for(int i=0;i<=10;i++){
            System.out.println("5 * "+i+" = "+(5*i));
        }
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e ){
            e.printStackTrace();
        }

    }
    }
    class Factorfind implements Runnable{
        public void run(){
            int number=36;
            System.out.println("factor of "+number+":");
            for(int i=1;i<number;i++){
                if(number%i==0){
                    System.out.println("factor:"+i);
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
class Prime implements Runnable{
    public void run(){
        System.out.println("Prime number thread is running:");
        int n=20;
        for (int i=2;i<=n;i++){
            boolean isPrime= true ;
            for(int j=2;j<i;j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime number:"+i);
        }
        try{
            Thread.sleep(100);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

}}}

public class Threaddemo{
    public static void main(String [] args){
        Multiplicationtable tabletask=new Multiplicationtable();
        Factorfind factortask=new Factorfind();
        Prime primetask=new Prime();

        Thread tablethread=new Thread(tabletask);
        Thread factorthread=new Thread(factortask);
        Thread primethread=new Thread(primetask);

        tablethread.start();
        factorthread.start();
        primethread.start();

        System.out.println("main thread continues:");
        try{
            tablethread.join();
            factorthread.join();
            primethread.join();

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("threads are finished");

    }
}                                                                                                                                                                                                                      
