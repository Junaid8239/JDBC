import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Studentdao {
    public static void createStudent(Student student) throws SQLException{
        Connection con=DB.connect();
        String query=Query.insert;
        PreparedStatement pstmt=con.prepareStatement(query);
        pstmt.setString(1, student.getName());
        pstmt.setInt(2,student.getRollno() );
        pstmt.setString(3,student.getEmail());
        pstmt.setFloat(4,student.getCgpa() );
        System.out.println("ps="+pstmt+"student="+student);
        pstmt.executeUpdate();
        pstmt.close();



        
    }
    
}
