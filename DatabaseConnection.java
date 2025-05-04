
import javax.swing.*;
import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/acount";
        String username = "root";  // اسم المستخدم
        String password = "mm852023";
        Connection connect ;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            System.out.println("found");
            try{

                  connect = DriverManager.getConnection(url,username, password);
                  //Statement statement = connect.createStatement();
                  //String sqlStat = "select * from user";
                  //ResultSet result = statement.executeQuery(sqlStat);

                  //while(result.next()){
                 //  System.out.println("this is id -> "+result.getString(1)+" ,this is Name -> "+result.getString(2)+" ,this is password -> "+result.getString(3));
                  //}
                 //System.out.println("true");
                 //JTextArea txt_id = new JTextArea();
                 //txt_id.setText("5");
                 //String insertNew = "delete from user where id = "+txt_id.getText();
                 //statement.executeUpdate(insertNew);
                 String prep_insert = "insert into user values(?,?,?)";
                PreparedStatement prepared = connect.prepareStatement(prep_insert);
                prepared.setInt(1,5);
                prepared.setString(2,"Esam");
                prepared.setInt(3, 555);
                prepared.executeUpdate();

             } catch (SQLException e) {
            //if (e.getErrorCode() == 1062) {
                //System.out.println("id is already");
            //} else {
                //System.out.println("user or password incorrect");
            //}

             }
        }catch (SQLException sx){
            System.out.println("Not found");
        }
    }
}
