import java.util.Scanner;
import javax.xml.transform.Templates;
class Wordcount{
    String word;
    public Wordcount(String word){
        this.word=word;
    }
    public synchronized void left(){
        if(word.length()>0){
            System.out.println("removed left: "+word.substring(0,word.length()-1));
        }
        else{
            System.out.println("no letters to remove");
        }
    }
    public synchronized void right(){
        if(word.length()>0){
            System.out.println("removed right: "+word.substring(1));
        }
        else{
            System.out.println("no letters to remove");
        }
    }
    public synchronized void getword(){
        return word;
    }
    
}

class Rleft implements Runnable{
    private Wordcount wc;
    public Rleft(Wordcount wc){
        this.wc=wc;
    }
    public void run(){
        for (int i = 0; i < 10; i++) {
            wc.left();
        
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}
class Rright implements Runnable{
    private Wordcount wc;
    public Rright(Wordcount wc){
        this.wc=wc;
    }
    public void run(){
        for (int i=0;i<10;i++){
            wc.right();
            try {
                Thread.sleep(200);
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Shared {
public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the word:");
    String en=sc.nextLine();
    Wordcount wd=new Wordcount(en);
    Thread t1=new Thread(new Rleft(wd));
    Thread t2=new Thread(new Rright(wd));

    t1.start();
    t2.start();
    try {
       t1.join();
       t2.join(); 
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
   

}

    
}
