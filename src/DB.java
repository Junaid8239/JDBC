import java.sql.Connection;
import java.sql.DriverManager;

public class DB{
    static Connection conn=null;
    public static Connection connect(){
        try{
                String url ="jdbc:mysql://localhost:3306/";
				String db="student_management";
				String userName = "root";
				String password = "root";
				conn=DriverManager.getConnection(url+db,userName,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }

    
}
