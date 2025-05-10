
import java.io.BufferedReader;
import java.io.InputStreamReader;




public class StudentAffairs {

    public static void main(String[] args)throws Exception {

        ConectionDataBase conectionDataBase = new ConectionDataBase();
        conectionDataBase.linkDataBase();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            System.out.println("Enter your order Insert or Select or Search Student or Delete Student: ");
            String order = br.readLine().toLowerCase();
            if(order.equals("Insert".toLowerCase())) {
                InsertStudent insertStudent = new InsertStudent();
                insertStudent.insertStudent();

            } else if(order.equals("Select".toLowerCase())) {
                RetrieveStudent retrieveStudent = new RetrieveStudent();
                retrieveStudent.retrieveStudent();
            } else if (order.equals("Search Student".toLowerCase())) {
                RetrieveStudent retrieveStudent = new RetrieveStudent();
                retrieveStudent.foundStudentById();
            } else if(order.equals("Delete Student".toLowerCase())){
                DeleteStudent deleteStudent = new DeleteStudent();
                deleteStudent.deleteStudent();
            }
            System.out.println("You Want Order More y/n".toLowerCase());
            String answer = br.readLine();
            if(answer.equals("n".toLowerCase())){
                break;
            }
        }
    }

}
