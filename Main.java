class Publisher{
    String pname;
    String paddress;
    public Publisher(String pname,String paddress){
        this.pname=pname;
        this.paddress=paddress;
    }
    public void display(){
        System.out.println("publisher name:"+pname+"\t address:"+paddress);
    }
}
class Book extends Publisher implements Runnable{
    String bname;
    String author;
    public Book(String pname,String paddress,String bname,String author){
        super(pname,paddress);
        this.bname=bname;
        this.author=author;
    }

    public void run(){
        System.out.println("book is being processed:"+bname);
            display();
            System.out.println("book name:"+bname+"\t author:"+author);
        }

    }
class Department{
    String dname;
    public Department(String dname){
        this.dname=dname;
    }
    public void display(){
        System.out.println("department name:"+dname);
    }
}
class Employee extends Department implements Runnable{
    String ename;
    String eaddress;
    public Employee(String dname,String ename,String eaddress){
        super(dname);
        this.ename=ename;
        this.eaddress=eaddress;
    }
    public void run(){
        System.out.println("employee is being processed:"+ename);
        display();
        System.out.println("employee name:"+ename+"\t address:"+eaddress);

    }
}


public class Main {
    public static void main(String[] args){
        Book book=new Book("DC books", "kochi", "beauty and the beast","disney");
        Employee em=new Employee("MCA", "ram", "palakkad");

        Thread t1=new Thread(book);
        Thread t2=new Thread(em);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Processing completed for both book and employee.");
    }
    }
    

