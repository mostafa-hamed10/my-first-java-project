import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.swing.*;
import java.io.*;
import java.sql.*;

public class Jdbc {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/elmostafa";
        String name = "root";
        String pass = "mm852023";
        //Connection con = DriverManager.getConnection(url,name,pass);
        /*
        Statement st = con.createStatement();
        ResultSet re = st.executeQuery("select * from clintes");

        while (re.next()){
            System.out.println(re.getInt(1)+" -> "+re.getString(2)+" -> "+re.getString(3));
        }

         */
       // PreparedStatement ps = con.prepareStatement("select * from clintes");
        //ps.setInt(1,5);
        //ps.setString(2,"Ali");
       // ps.setString(3,"Ali@12.com");
        //ps.executeUpdate();
        //ResultSet s = ps.executeQuery();
        //while (s.next()) {
          //  System.out.println(s.getInt(1)+" "+s.getString(2)+" "+s.getString(3));
        // }
        /*
        ResultSet re = ps.executeQuery();
        ResultSetMetaData rse = re.getMetaData();
        System.out.println("count: "+rse.getColumnCount());
        System.out.println("Name: "+rse.getColumnName(2));
        System.out.println(rse.getColumnTypeName(1));
        System.out.println(" ========= ");

        DatabaseMetaData d = con.getMetaData();
        String []table = {"SYSTEM TABLE"};
        ResultSet result = d.getTables(null,null,null,table);
        while (result.next()){
            System.out.println(result.getString(3));
        }
        System.out.println(d.getDatabaseProductName());
        System.out.println(d.getTypeInfo());
        System.out.println(d.getDriverName());

         */
        /*
        PreparedStatement pr = con.prepareStatement("insert into Image values(?,?)");
        pr.setString(1,"son");
        FileInputStream fi = new FileInputStream("C:\\Users\\AL_Qadisiyah\\Pictures\\Camera Roll\\download.jfif");
        pr.setBinaryStream(2,fi,fi.available());
         int i = pr.executeUpdate();
        System.out.println(i);

 3
        PreparedStatement p = con.prepareStatement("select * from Image");
        ResultSet r = p.executeQuery();

        if(r.next()){
            Blob b = r.getBlob(2);
            byte[] by = b.getBytes(1,(int)b.length());
            FileOutputStream fo = new FileOutputStream("C:\\Users\\AL_Qadisiyah\\Pictures\\Camera Roll\\download.jfif");
            fo.write(by);
            fo.close();
        }

         */
        /*
        PreparedStatement p = con.prepareStatement("insert into Ftest values(?,?)");
        File f = new File("d:\\test.txt");
        FileReader fr  = new FileReader(f);
        p.setInt(1,101);
        p.setCharacterStream(2,fr,f.length());

        int i = p.executeUpdate();
        System.out.println(i);

        PreparedStatement pr = con.prepareStatement("select * from Ftest");
        ResultSet r = pr.executeQuery();
        r.next();
        Clob c = r.getClob(2);
        Reader re  = c.getCharacterStream();
        FileWriter fw = new FileWriter("d:\\test.txt");

        int x;
        while ((i = re.read()) != -1){
            fw.write((char)i);
        }

         */
        /*
        CallableStatement ca = con.prepareCall("{call getId(?)}");
        ca.setInt(1,1);
        ResultSet rs = ca.executeQuery();
        while (rs.next()){
            int id = rs.getInt(1);
            String Name = rs.getString(2);
            System.out.println("Id: "+id+" / "+"Name: "+Name);
        }

        CallableStatement cs = con.prepareCall("{call InsertR(?,?,?)}");
        cs.setInt(1,13);
        cs.setString(2,"ALi");
        cs.setString(3,"ALi@gmail.com");

        boolean i  = cs.execute();
        System.out.println(i);

         */
        /*

        CallableStatement cs1 = con.prepareCall("{? = call sumN(?,?)}");
        cs1.registerOutParameter(1, Types.INTEGER);
        cs1.setInt(2,20);
        cs1.setInt(3,30);
        cs1.execute();

        int s = cs1.getInt(1);

        cs1.registerOutParameter(1, Types.INTEGER);
        cs1.setInt(2,4);
        cs1.setInt(3,11);
        cs1.execute();
        int x = cs1.getInt(1);
        System.out.println(s);
        System.out.println(x);

         */
        /*
        try {
            con.setAutoCommit(false);
            Statement s = con.createStatement();
            s.executeUpdate("update acounts set balanc =  balanc - 100 where id = 1");
            s.executeUpdate("update acounts set balanc = balanc + 100 where id = 2");
            con.commit();
        } catch (Exception e) {
            if(con != null){
                con.rollback();
                System.out.println("null");
            }
        }
        finally {
            if(con != null){
                con.setAutoCommit(true);
                con.close();
            }

        }
        System.out.println("right");

         */
        /*
        con.setAutoCommit(false);
        Statement s = con.createStatement();
        s.addBatch("insert into acounts values(10,'Abdall',2000)");
        s.addBatch("insert into acounts values(11,'Salah',3000)");
        s.executeBatch();
        con.commit();

         */
        /*
        try{
            PreparedStatement pr = con.prepareStatement("insert into acounts values(?,?,?)");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("Enter your Id: ");
                String id = br.readLine();
                int user_id = Integer.parseInt(id);
                System.out.println("Enter your Name: ");
                String Name = br.readLine();
                System.out.println("Enter your counting: ");
                String bala = br.readLine();
                int user_bala = Integer.parseInt(bala);

                pr.setInt(1, user_id);
                pr.setString(2, Name);
                pr.setInt(3, user_bala);

                pr.addBatch();
                System.out.println("Enter more statements y/n");
                String ans = br.readLine();
                if(ans.equals("n")){
                    break;
                }
               }
            pr.executeBatch();

            System.out.println("record successfully saved");
            con.close();


        }catch(Exception e){
                System.out.println(e);
        }

         */
        /*
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/elmostafa");
        rowSet.setUsername("root");
        rowSet.setPassword("mm852023");
        rowSet.setCommand("select * from acounts");
        rowSet.execute();
        rowSet.addRowSetListener(new MyLisnter());

        while (rowSet.next()){
            System.out.println(rowSet.getInt(1)
                    +" "+rowSet.getString(2)
                    +" "+rowSet.getInt(3));
        }

         */
        BasicDataSource bd = new BasicDataSource();
        bd.setUrl(url);
        bd.setUsername(name);
        bd.setPassword(pass);
        bd.setMaxIdle(10);
        bd.setMinIdle(50);
        bd.setMaxOpenPreparedStatements(50);
        Connection con = bd.getConnection();
        PreparedStatement pr;
       // pr = con.prepareStatement("select * from acounts");
       // ResultSet re = pr.executeQuery();
        //while (re.next()){
          //  System.out.println(re.getInt(1)+" "+re.getInt(3));
        //}
        PreparedStatement pr2 = con.prepareStatement("insert into acounts values(?,?,?)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Enter your id: ");
            String id = br.readLine();
            int user_id = Integer.parseInt(id);
            System.out.println("Enter your name: ");
            String user_name = br.readLine();
            System.out.println("Enter your counting: ");
            String counting = br.readLine();
            int count = Integer.parseInt(counting);
            pr2.setInt(1,user_id);
            pr2.setString(2,user_name);
            pr2.setInt(3,count);
            pr2.addBatch();
            System.out.println("you want add more y/n");
            String answer = br.readLine();
            if(answer.equals("n")){
                break;
            }
        }
        pr2.executeBatch();






     }
}





