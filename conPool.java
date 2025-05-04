import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

public class conPool {
    private static BasicDataSource bDs = new BasicDataSource();
    private static CallableStatement cs;
    private static Connection con;
    private static PreparedStatement prepar;
    private static ResultSet re;
    static {
       bDs.setUrl("jdbc:mysql://localhost:3306/elmostafa");
       bDs.setUsername("root");
       bDs.setPassword("mm852023");
       bDs.setMinIdle(10);
       bDs.setMaxIdle(5);
       bDs.setMaxOpenPreparedStatements(100);
    }

    public static void main(String[] args) {
        try(Connection con = bDs.getConnection()){
            System.out.println("connected");
            String select = "select * from shops where shop_id >= ?";
            prepar = con.prepareStatement(select);
            prepar.setInt(1,1);
            re = prepar.executeQuery();
            while(re.next()){
                System.out.println(re.getInt(1)+" "+re.getString(2) );
            }
            cs = con.prepareCall("{CALL course.getUserById(?)}");
            cs.setInt(1,4);
            re = cs.executeQuery();
            while(re.next()){
                System.out.println("Name -> "+re.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
