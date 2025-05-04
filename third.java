import java.sql.*;

public class third {
    private static String url = "jdbc:mysql://localhost:3306/hospital";
    private static String userName = "root";
    private static String password = "mm852023";

    private static Connection conn;
    private static Statement statement;
    private static ResultSet result;
    private static ResultSetMetaData rSmd;
    private static DatabaseMetaData dmd;

    public static Connection connect() {

        try {
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected");
            statement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String select = "select * from clint";
            result = statement.executeQuery(select);

            dmd = conn.getMetaData();
            String data_ver = dmd.getDatabaseProductVersion();
            String dataN = dmd.getDatabaseProductName();
            System.out.println(dataN+" "+data_ver);
            result = dmd.getTypeInfo();
            //while(result.next()){
              //  String info = result.getString("Type_Name");
              //  System.out.println(info);
            //}
            String[] table = {"TABLE"};
            result = dmd.getTables(null,userName,null,table);
            //while(result.next()){
                //String x = result.getString(4);
              //  System.out.println(x);
            //}
            printColumnCount(result);
            printColumnName(result);
            printInfo(result);


        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            try {
                conn.close();
                statement.close();
                result.close();
            } catch (SQLException e) {
                System.out.println(e);

            }

        }
        return conn;
    }

    public static void printColumnCount(ResultSet re) {
        try {
            rSmd = re.getMetaData();
            int count = rSmd.getColumnCount();
            System.out.println(count);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void printColumnName(ResultSet re) {
        try {
            rSmd = re.getMetaData();
            for (int i = 1; i <= rSmd.getColumnCount(); i++) {
                String Name = rSmd.getColumnName(i);
                System.out.println(Name);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void printInfo(ResultSet re) {
        try {
            rSmd = re.getMetaData();
            for (int i = 1; i <= rSmd.getColumnCount(); i++) {
                System.out.println(rSmd.getColumnType(i) + " " + rSmd.getColumnTypeName(i));
            }
        } catch (SQLException e) {
            System.out.println(e);

        }
    }
}