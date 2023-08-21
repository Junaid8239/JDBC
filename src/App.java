import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("enter student details rollno,name,email,cgpa");
        Scanner sc=new Scanner(System.in);
        int rollno=sc.nextInt();
        String name=sc.next();
        String email=sc.next();
        Float cgpa=sc.nextFloat();
        Student student = new Student(name,rollno,email,cgpa);
        Studentdao.createStudent(student);
        System.out.println("student created succesfully");
        sc.close();

    }
}
