import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;

public class ConectionDataBase {
    private static BasicDataSource basicDataSource = new BasicDataSource();
    public Connection connection;

    private static  final String url = "jdbc:mysql://localhost:3306/school";
    private static final String userName = "root";
    private static final String password = "mm852023";

    static {
       basicDataSource.setUrl(url);
       basicDataSource.setUsername(userName);
       basicDataSource.setPassword(password);
       basicDataSource.setMinIdle(5);
       basicDataSource.setMaxIdle(10);
       basicDataSource.setMaxOpenPreparedStatements(50);

    }

    public void linkDataBase(){
        try{
            connection = basicDataSource.getConnection();
            System.out.println("Conection....");
        }catch (Exception e) {
            System.out.println(e);
        }
    }


}
