import javax.imageio.IIOException;
import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws IOException {
         Socket s = new Socket("localhost", 9000);

        System.out.println("I will open connection now you ready");
        OutputStream op = s.getOutputStream();
        PrintWriter p = new PrintWriter(op);
        p.write("Hello I'm caller");
        op.flush();
        p.close();
        op.close();
        s.close();
    }
}
