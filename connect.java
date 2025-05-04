import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;

public class connect {
    private static ResultSet re;
    private static PreparedStatement pr;
    private static final BasicDataSource BD = new BasicDataSource();
    private static  Connection con;
    private static CallableStatement cs;

    private static final String url = "jdbc:mysql://localhost:3306/course";
    private static final String user_name = "root";
    private static final String pass =  "mm852023";

    static {
        BD.setUrl(url);
        BD.setUsername(user_name);
        BD.setPassword(pass);
        BD.setMaxIdle(10);
        BD.setMinIdle(5);
        BD.setMaxOpenPreparedStatements(100);
    }
    private static Connection con(){
        try {
            con = BD.getConnection();
            System.out.println("connected");
            String select = "select * from lang where lang.lang_id >= ?";
            pr = con.prepareStatement(select);
            pr.setInt(1,1);
            re = pr.executeQuery();

            while (re.next()){
                System.out.println(" id -> "+re.getInt(1)+" name -> "+re.getString(2));
            }
            cs = con.prepareCall("{CALL getUserById(?)}");
            cs.setInt(1, 3);
            re = cs.executeQuery();
            while(re.next()){
                System.out.println("Name -> "+re.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public static void main(String[] args) {
        Connection con1 = con();
    }
}
