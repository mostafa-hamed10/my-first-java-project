import java.io.InputStream;
import java.net.*;

public class Network {
    public static void main(String[] args)throws Exception {
       /*
        //URL url=new URL("http://www.javatpoint.com/java-tutorial");
        URL url=new URL("https://httpbin.org/get");
        URLConnection conUrl = url.openConnection();
        InputStream in = conUrl.getInputStream();
        int i;
        while((i = in.read()) != -1){
            System.out.print((char)i);
        }
        
        */

        //System.out.println("Protocol: "+url.getProtocol());
        //System.out.println("Host: "+url.getHost());
        //System.out.println("File: "+url.getFile());
        //System.out.println("Port: "+url.getPort());
        /*
        URL url=new URL("http://exampel.com");
        HttpURLConnection h = (HttpURLConnection) url.openConnection();

        for (int i = 1; i < 8; i++) {
            System.out.println(h.getHeaderFieldKey(i) +" = "+h.getHeaderField(i));
        }
        h.disconnect();

         */
        InetAddress ip = InetAddress.getByName("www.example.com");
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());

    }
}
