import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9000);
        System.out.println("I'm Ready");
        Socket s = ss.accept();
        System.out.println("I'm Connected");
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String me = br.readLine();
        System.out.println("message: "+me);

        br.close();
        s.close();
        ss.close();
    }
}
