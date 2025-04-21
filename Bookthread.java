class Publisher{
    String name,address;
    public Publisher(String name,String address){
        this.name=name;
        this.address=address;
    }
}
class Book extends Publisher implements Runnable{
    String title,author;
    public Book(String name,String address,String title,String author){
        super(name,address);
        this.title=title;
        this.author=author;
    }
    public void run(){
        System.out.println("publisher : "+name+"\taddress : "+ address);
        System.out.println("title : "+title+"\tauthor : "+author);

    try{
        Thread.sleep(300);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
    }}
    class Department{
        String name;
        public Department(String name){
            this.name=name;
        }
    }
    class Employee extends Department implements Runnable{
        String empname;
        public Employee(String name,String empname){
            super(name);
            this.empname=empname;
        }
        public void run(){
            System.out.println("department:"+name+"\tEmployee name:"+empname);
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }}




public class Bookthread {
    public static void main(String [] args){
        Book books=new Book("DC BOOKS","Kochi","MY STORY","Madhavi kutty");
        Employee emp=new Employee("MCA","ANN");
        Thread t1=new Thread(books);
        Thread t2=new Thread(emp);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }   
}
