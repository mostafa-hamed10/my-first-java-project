import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertStudent {

    public void insertStudent() throws Exception {
        ConectionDataBase conectionDataBase = new ConectionDataBase();
        conectionDataBase.linkDataBase();
        Connection connection = conectionDataBase.connection;

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

            System.out.println("Are You Want Enter Students More y/n".toLowerCase());
            String answer = br.readLine();
            if(answer.equals("n".toLowerCase())) {
                break;
            }
        }
        ps.executeBatch();

    }

}
