import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;


import org.apache.commons.dbcp2.BasicDataSource;
public class StudentAffairs {

    private static BasicDataSource basicDataSource = new BasicDataSource();
    private static ResultSet resultSet;
    private static PreparedStatement  preparedStatement;
    private static CallableStatement callableStatement;

   

    public static void main(String[] args)throws Exception {


        ConectionDataBase conectionDataBase = new ConectionDataBase();
        conectionDataBase.linkDataBase();

        InsertStudent insertStudent = new InsertStudent();
        insertStudent.insertStudent();

        Connection connection = conectionDataBase.connection;

        String select = "select * from student where student_id > ?";

        preparedStatement = connection.prepareStatement(select);
        preparedStatement.setInt(1, 1);
        resultSet = preparedStatement.executeQuery();
        System.out.println("---------------------------------------------------------------------------");
        while (resultSet.next()) {
            System.out.println("| Id -> " + resultSet.getInt(1) + " | firstName -> " + resultSet.getString(2) + " | lastName -> " + resultSet.getString(3) + " | B_d -> " + resultSet.getString(4) + "  |");
            System.out.println("------------------------------------------------------------------------------");
        }

        callableStatement = connection.prepareCall("{CAll getStudentById(?)}");
        callableStatement.setInt(1, 1);
        resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("id -> " + resultSet.getInt(1) + " first_name -> " + resultSet.getString(2) + " last_name -> " + resultSet.getString(3));


        }
    }

}
