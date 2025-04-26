import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;


import org.apache.commons.dbcp2.BasicDataSource;
public class newCon {

    private static BasicDataSource BD = new BasicDataSource();
    // private static Connection con;
    //private static Statement stat;
    private static ResultSet re;
    private static PreparedStatement  pr;
    private static CallableStatement cs;

    private static  final String url = "jdbc:mysql://localhost:3306/school";
    private static final String user_name = "root";
    private static final String password = "mm852023";

      static {
      BD.setUrl(url);
      BD.setUsername(user_name);
      BD.setPassword(password);
      BD.setMaxIdle(10);
      BD.setMinIdle(5);
      BD.setMaxOpenPreparedStatements(50);
    }

    public static void main(String[] args){
       try (Connection con = BD.getConnection() ){

           System.out.println("Connected......");

           String select = "select * from student where student_id > ?";
           pr = con.prepareStatement(select);
           pr.setInt(1,1);
           re = pr.executeQuery();
           System.out.println("---------------------------------------------------------------------------");
           while(re.next()){
               System.out.println("| Id -> "+re.getInt(1)+" | firstName -> "+re.getString(2)+" | lastName -> "+re.getString(3)+" | B_d -> "+re.getString(4)+"  |");
               System.out.println("------------------------------------------------------------------------------");
           }
           //String input = "select * from student";
           //pr = con.prepareStatement(input);
           //re = pr.executeQuery();
           //while (re.next()){
             //  System.out.println(re.getString(2));
           //}
           cs = con.prepareCall("{CAll getStudentById(?)}");
           cs.setInt(1,1);
           re = cs.executeQuery();
           while(re.next()){
               System.out.println("id -> "+re.getInt(1)+" first_name -> "+re.getString(2)+" last_name -> "+re.getString(3));
           }
           PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?)");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           while (true){
               System.out.println("Enter your id: ");
               String id = br.readLine();
               int user_id = Integer.parseInt(id);

               System.out.println("Enter your firstName: ");
               String FName = br.readLine();

               System.out.println("Enter your LastName: ");
               String LName = br.readLine();

               System.out.println("Enter your Birth Date: ");
               String B_D = br.readLine();



               System.out.println("Enter your Class ID: ");
               String c_id = br.readLine();
               int class_id = Integer.parseInt(c_id);


               ps.setInt(1,user_id);
               ps.setString(2,FName);
               ps.setString(3,LName);
               ps.setString(4, B_D);
               ps.setInt(5,class_id);


               ps.addBatch();

               System.out.println("Are you want enter more y/n");
               String ans = br.readLine();
               if(ans.equals("n")) {
                     break;
                  }
           }
           ps.executeBatch();
       } catch (Exception e) {
           System.out.println(e);
       }
    }
}
