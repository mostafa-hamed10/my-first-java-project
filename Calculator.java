import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args)throws Exception {
         while (true) {
                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                 System.out.println("Enter first number: ");
                 String n1 = br.readLine();
                 int num1 = Integer.parseInt(n1);
                 System.out.println("Enter your operation: ");
                 String op = br.readLine();
                 System.out.println("Enter second number: ");
                 String n2 = br.readLine();
                 int num2 = Integer.parseInt(n2);

                 if(op.equals("+")) {
                         System.out.println(num1 + num2);
                 } else if (op.equals("-")) {
                         System.out.println(num1 - num2);
                 } else if (op.equals("*")) {
                         System.out.println(num1 * num2);
                 } else if (op.equals("/")) {
                         System.out.println(num1 / num2);
                 } else if (op.equals("%")) {
                         System.out.println(num1 % num2);
                 }
                 System.out.println("Are you want enter operation more y/n");
                 String ans = br.readLine();
                 if (ans.equals("n")){
                         break;
                 }

         }
    }
}
