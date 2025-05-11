import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DeleteStudent {
    private PreparedStatement preparedStatement;



    ConectionDataBase conectionDataBase = new ConectionDataBase();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public void deleteStudent() throws Exception{
       conectionDataBase.linkDataBase();
       Connection connection = conectionDataBase.connection;
       /// first you should before delete main table delete sub tables///


          System.out.println("Enter Student id: ");
          String id = bufferedReader.readLine();
          int userId = Integer.parseInt(id);

          String deleteSubject = "delete from student_sub where ss_id = ?";
          preparedStatement = connection.prepareStatement(deleteSubject);
          preparedStatement.setInt(1, userId);
          preparedStatement.executeUpdate();

          String deleteTeacher = "delete from teatchr_student where ts_id = ?";
          preparedStatement = connection.prepareStatement(deleteTeacher);
          preparedStatement.setInt(1, userId);
          preparedStatement.executeUpdate();


          String deleteStudent = "delete from student where student_id = ?";
          preparedStatement = connection.prepareStatement(deleteStudent);
          preparedStatement.setInt(1, userId);
          preparedStatement.executeUpdate();

          System.out.println("Deletion Student");
      }
    }


