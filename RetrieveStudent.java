import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class RetrieveStudent {
    private static PreparedStatement  preparedStatement;
    private static CallableStatement callableStatement;
    private static ResultSet resultSet;
    ConectionDataBase conectionDataBase = new ConectionDataBase();


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



    public void retrieveStudent() throws Exception {
        conectionDataBase.linkDataBase();
        Connection connection = conectionDataBase.connection;

            System.out.println("Enter Student Id: ");
            String id = br.readLine();
            int userId = Integer.parseInt(id);
            String select = "select * from student where student_id = ?";
            preparedStatement = connection.prepareStatement(select);
            preparedStatement.setInt(1, userId);
            resultSet = preparedStatement.executeQuery();
            System.out.println("---------------------------------------------------------------------------");
            while (resultSet.next()) {
                System.out.println("| Id -> " + resultSet.getInt(1) + " | firstName -> " + resultSet.getString(2) + " | lastName -> " + resultSet.getString(3) + " | B_d -> " + resultSet.getString(4) + "  |");
                System.out.println("------------------------------------------------------------------------------");
            }




    }
    public void foundStudentById() throws Exception{
        conectionDataBase.linkDataBase();
        Connection connection = conectionDataBase.connection;

        System.out.println("Enter Student Id What You Want: ");
        String id = br.readLine();
        int userId = Integer.parseInt(id);
        callableStatement = connection.prepareCall("{CAll getStudentById(?)}");
        callableStatement.setInt(1, userId);
        resultSet = callableStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("id -> " + resultSet.getInt(1) + " first_name -> " + resultSet.getString(2) + " last_name -> " + resultSet.getString(3));
        }
    }
}
