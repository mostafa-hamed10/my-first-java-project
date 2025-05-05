
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;



public class StudentAffairs {

    public static void main(String[] args)throws Exception {

        ConectionDataBase conectionDataBase = new ConectionDataBase();
        conectionDataBase.linkDataBase();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            System.out.println("Enter your order Insert or Select or Search Student: ");
            String order = br.readLine();
            if(order.equals("insert")) {
                InsertStudent insertStudent = new InsertStudent();
                insertStudent.insertStudent();

            } else if(order.equals("select")) {
                RetrieveStudent retrieveStudent = new RetrieveStudent();
                retrieveStudent.retrieveStudent();
            } else if (order.equals("Search Student")) {
                RetrieveStudent retrieveStudent = new RetrieveStudent();
                retrieveStudent.foundStudentById();
            }
            System.out.println("You Want Order More y/n");
            String answer = br.readLine();
            if(answer.equals("n")){
                break;
            }
        }
    }

}
