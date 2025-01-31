import java.util.Scanner;

class Student {
    int rollno;
    String name;
    int mark;

    public Student(int rollno, String name, int mark) {
        this.rollno = rollno;
        this.name = name;
        this.mark = mark;
    }

    public void display() {
        System.out.println("Roll No: " + rollno + ", Name: " + name + ", Marks: " + mark);
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine(); 

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int rollno = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            int mark = sc.nextInt();
            sc.nextLine();

            students[i] = new Student(rollno, name, mark);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (students[i].mark < students[j].mark) {

                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        System.out.println("\nRank List:");
        for (int i = 0; i < n; i++) {           
            System.out.print("Rank " + (i + 1) + ": ");
            students[i].display();
        }

        sc.close();
    }

}