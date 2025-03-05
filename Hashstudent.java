import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Hashstudent {
   
    public static void main(String[] args){
     HashMap<Integer,String> students=new HashMap<>();

     Scanner sc=new Scanner(System.in);
     while(true){
        System.out.print("enter the studentID(or 0 to stop):");
        int studentId=sc.nextInt();
        sc.nextLine();

        if(studentId==0){
            break;
        }
        System.out.print("enter student name:");
        String studentName=sc.nextLine();

        students.put(studentId,studentName);
        System.out.println("\nStudent "+studentName+ " with ID "+ studentId+" added");
     }
     System.out.print("Enter student ID to retrieve the name: ");
     int searchId = sc.nextInt();


     if (students.containsKey(searchId)) {
        String studentName = students.get(searchId);
        System.out.println("Student with ID " + searchId + " is: " + studentName);
    } else {
        System.out.println("Student with ID " + searchId + " not found.");
    }
    sc.close();
}
}