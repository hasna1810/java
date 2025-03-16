import java.util.Scanner;
class Person{
    String name;
    String gender;
    String address;
    int age;
    public Person(String name,String gender,String address,int age){
        this.name=name; 
        this.gender=gender;
        this.address=address;
        this.age=age;
}
public void display(){
    System.out.println(" Name: "+name+"\n gender:"+gender+"\n address:"+address+"\n age:"+age);
}
class Employee extends Person{
    int empid;
    String company;
    String ename;
    String quali;
    int salary;
public Employee(String name,String gender,String address,int age, int empid,String company,String ename,String quali,int salary){
    super(name,gender,address,age);
    this.empid=empid;
    this.company=company;
    this.ename=ename;
    this.quali=quali;
    this.salary=salary;
}
public void displayemp(){
    super.display();
    System.out.println(" Employee id: "+empid+"\n name:"+ename+"\n company name: "+company+"\n qualification:"+quali+"\n salary: "+salary);
}}
class Teacher extends Employee{
    int tid;
    String subject;
    String department;
    public Teacher(String name,String gender,String address,int age, int empid,String company,String ename,String quali,int salary,int tid,String subject,String department){
        super(name,gender,address,age,empid,company,ename,quali,salary);
        this.tid=tid;
        this.subject=subject;
        this.department=department;

}
public void displaytea(){
    displayemp();
    System.out.println("teacher id:"+tid+"\nsubject:"+subject+"\ndepartment:"+department);

}
}
class Teacherdemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of teachers");
        int n=sc.nextInt();
        Teacher[] teacher=new Teacher[n];
        for(int i=0;i<n;i++){
            System.out.println("enter name of teacher"+(i+1)+":");
            System.out.println("name:");
            String name=sc.next();
            System.out.println("gender:");
            String gender=sc.next();
            System.out.println("address:");
            String address=sc.next();
            System.out.println("age:");
            int age=sc.nextInt();
            System.out.println("employee id:");
            int empid=sc.nextInt();
            System.out.println("company name:");
            String company=sc.next();
            System.out.println("ename:");
            String ename=sc.next();
            System.out.println("qualification:");
            String quali=sc.next();
            System.out.println("salary:");
            int salary=sc.nextInt();
            System.out.println("teacher id:");
            int tid=sc.nextInt();
            System.out.println("subject:");
            String subject=sc.next();
            System.out.println("department:");
            String department=sc.next();
            teacher[i]=new Teacher(name,gender,address,age,empid,company,ename,quali,salary,tid,subject,department);

        }
        System.out.println("]n teacher deatails:");
        for(Teacher t:teacher){
            t.displaytea();
        }

}}}
