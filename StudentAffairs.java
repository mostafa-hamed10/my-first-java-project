
import java.io.BufferedReader;
import java.io.InputStreamReader;




public class StudentAffairs {

    public static void main(String[] args)throws Exception {

        final String pass = "mostafa2005";

        ConectionDataBase conectionDataBase = new ConectionDataBase();
        conectionDataBase.linkDataBase();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter password: ");
        String password = bufferedReader.readLine();
        if(pass.equals(password)){
            while (true) {
                System.out.println("Enter your order Insert or Select or Search Student or Delete Student: ");
                String order = bufferedReader.readLine().toLowerCase();
                if (order.equals("Insert".toLowerCase())) {
                    InsertStudent insertStudent = new InsertStudent();
                    insertStudent.insertStudent();

                } else if (order.equals("Select".toLowerCase())) {
                    RetrieveStudent retrieveStudent = new RetrieveStudent();
                    retrieveStudent.retrieveStudent();
                } else if (order.equals("Search Student".toLowerCase())) {
                    RetrieveStudent retrieveStudent = new RetrieveStudent();
                    retrieveStudent.foundStudentById();
                } else if (order.equals("Delete Student".toLowerCase())) {
                    DeleteStudent deleteStudent = new DeleteStudent();
                    deleteStudent.deleteStudent();
                }
                System.out.println("You Want Order More Yes/No".toLowerCase());
                String answer = bufferedReader.readLine();
                if (answer.equals("No".toLowerCase())) {
                    break;
                }
            }
        }else{
            System.out.println("Enter password correct");
        }
    }
}

