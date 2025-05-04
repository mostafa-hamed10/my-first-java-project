import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;


import org.apache.commons.dbcp2.BasicDataSource;
public class StudentAffairs {

    private static BasicDataSource basicDataSource = new BasicDataSource();
    private static ResultSet resultSet;
    private static PreparedStatement  preparedStatement;
    private static CallableStatement callableStatement;

    private static  final String url = "jdbc:mysql://localhost:3306/school";
    private static final String user_name = "root";
    private static final String password = "mm852023";

      static {
      basicDataSource.setUrl(url);
      basicDataSource.setUsername(user_name);
      basicDataSource.setPassword(password);
      basicDataSource.setMaxIdle(10);
      basicDataSource.setMinIdle(5);
      basicDataSource.setMaxOpenPreparedStatements(50);
    }

    public static void main(String[] args){
       try (Connection connection = basicDataSource.getConnection() ){

           System.out.println("Connected......");

           String select = "select * from student where student_id > ?";
           preparedStatement = connection.prepareStatement(select);
           preparedStatement.setInt(1,1);
           resultSet = preparedStatement.executeQuery();
           System.out.println("---------------------------------------------------------------------------");
           while(resultSet.next()){
               System.out.println("| Id -> "+resultSet.getInt(1)+" | firstName -> "+resultSet.getString(2)+" | lastName -> "+resultSet.getString(3)+" | B_d -> "+resultSet.getString(4)+"  |");
               System.out.println("------------------------------------------------------------------------------");
           }
           //String input = "select * from student";
           //pr = con.prepareStatement(input);
           //re = pr.executeQuery();
           //while (re.next()){
             //  System.out.println(re.getString(2));
           //}
           callableStatement = connection.prepareCall("{CAll getStudentById(?)}");
           callableStatement.setInt(1,1);
           resultSet = callableStatement.executeQuery();
           while(resultSet.next()){
               System.out.println("id -> "+resultSet.getInt(1)+" first_name -> "+resultSet.getString(2)+" last_name -> "+resultSet.getString(3));
           }


           PreparedStatement ps = connection.prepareStatement("insert into student values(?,?,?,?,?)");
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           while (true){
               System.out.println("Enter your id: ");
               String Id = br.readLine();
               int userId = Integer.parseInt(Id);

               System.out.println("Enter your firstName: ");
               String firstName = br.readLine();

               System.out.println("Enter your LastName: ");
               String lastName = br.readLine();

               System.out.println("Enter your Birth Date: ");
               String birthday = br.readLine();



               System.out.println("Enter your Class ID: ");
               String clasId = br.readLine();
               int classId = Integer.parseInt(clasId);


               ps.setInt(1,userId);
               ps.setString(2,firstName);
               ps.setString(3,lastName);
               ps.setString(4, birthday);
               ps.setInt(5,classId);


               ps.addBatch();

               System.out.println("Are you want enter more y/n");
               String answer = br.readLine();
               if(answer.equals("n")) {
                     break;
                  }
           }
           ps.executeBatch();
       } catch (Exception exception) {
           System.out.println(exception);
       }
    }
}
