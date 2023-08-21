public class Student {

    private String name;
    private int rollno;
    private String email;
    private float cgpa;

    public Student(String name,int rollno,String email,float cgpa){
        this.name=name;
        this.rollno=rollno;
        this.email=email;
        this.cgpa=cgpa;
    }

    public String getName(){
        return name ;
    }
    public int getRollno(){
        return rollno;

    }
      public float getCgpa(){
        return cgpa;

    }
    public  String getEmail(){
        return email;
    }

    
}
