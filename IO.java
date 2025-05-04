import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.PermissionCollection;
import java.sql.SQLOutput;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.zip.*;
public class IO{
    public static void main(String[] args) {
        /*
        try {
                FileOutputStream fo = new FileOutputStream("D:\\testout.txt");

                String s = "Welcome to javaTpoint.";
                byte[] b = s.getBytes(s);
                fo.write(b);
                fo.close();

            System.out.println("Succses");
       }catch (Exception e) {
            System.out.println(e);
        }

         */
        /*
        String s = "D:\\testout.txt";
        try{
            FileOutputStream fo = new FileOutputStream(s);
            fo.write("Mostafa & Menna".getBytes());
        } catch (IOException e) {
            System.out.println("THIS IS ERROR: "+e.getMessage());
        }
        try (FileInputStream fi = new FileInputStream(s);){
            FileInputStream fis = new FileInputStream(fi.getFD());

            int i =0 ;
            while((i = fi.read()) != -1){
                System.out.print((char)i);
            }


        } catch (IOException e) {
            System.out.println("THIS IS ERROR: "+e.getMessage());
        }

         */
        /*
        String s = "D:\\test.txt";
        try{
            FileOutputStream fo = new FileOutputStream(s);
            fo.write("Mostafa Ansha Alahe will mariying from Menna".getBytes());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileInputStream fi = new FileInputStream(s);
            int i = 0;
            while ((i = fi.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

         */
        /*
        String s  = "D:\\try.txt";
        try{
            FileOutputStream fo = new FileOutputStream(s);
            fo.write("Rmadan Kaream".getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
        try{
           FileInputStream fi = new FileInputStream(s);
           int i;
           while ((i = fi.read())!= -1){
               System.out.print((char)i);
           }
        }catch(IOException e){
            System.out.println(e);
        }

         */
        /*
        try {
            FileOutputStream fo = new FileOutputStream("D:\\fax.txt");
            BufferedOutputStream bo = new BufferedOutputStream(fo);
            String s = "Eid Mobrak";
            byte [] b = s.getBytes();
            bo.write(b);
            bo.flush();
            bo.close();
            fo.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success");
        try {
            FileInputStream fi = new FileInputStream("D:\\fax.txt");
            BufferedInputStream bi = new BufferedInputStream(fi);
            //int i = bi.read();
            int i;
            while((i = bi.read()) != -1){
                System.out.print((char)i);
            }
            bi.close();
            fi.close();

        } catch (Exception e) {
            System.out.println(e);
        }

         */
         /*
        try {
            FileInputStream fi1 = new FileInputStream("D:\\fax.txt");
            FileInputStream fi2 = new FileInputStream("D:\\try.txt");
            FileOutputStream fi3 = new FileOutputStream("D:\\test.txt");
            SequenceInputStream si = new SequenceInputStream(fi1, fi2);
            int i = 0;
            while((i = si.read()) != -1){
                fi3.write(i);
            }
            FileInputStream fi4= new FileInputStream("D:\\test.txt");
            while((i = fi4.read()) != -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
       // System.out.println("Success");

        try {
            FileInputStream fi1 = new FileInputStream("D:\\fax.txt");
            FileInputStream fi2 = new FileInputStream("D:\\try.txt");
            FileInputStream fi3 = new FileInputStream("D:\\test.txt");

            Vector v = new Vector();
            v.add(fi1);
            v.add(fi2);
            v.add(fi3);
            Enumeration e = v.elements();
            SequenceInputStream si = new SequenceInputStream(e);
            int i = 0;
            while((i = si.read()) != -1){
                System.out.print((char) i);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

          */
        /*
        try {
            FileOutputStream fo1 = new FileOutputStream("D:\\fax.txt");
            FileOutputStream fo2 = new FileOutputStream("D:\\try.txt");

            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            bo.write("Hello".getBytes());
            bo.writeTo(fo1);
            bo.writeTo(fo2);

            bo.flush();
            bo.close();
            fo2.close();
            fo1.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
        try {
            FileInputStream fi1 = new FileInputStream("D:\\fax.txt");
            FileInputStream fi2 = new FileInputStream("D:\\try.txt");

            byte [] b = {12,35,67};
            ByteArrayInputStream bi = new ByteArrayInputStream(b);

            int k = 0;
            while((k = bi.read()) != -1) {
                System.out.println((char) k);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*
        try {
            FileOutputStream fo = new FileOutputStream("D:\\fax.txt");
            DataOutputStream Do = new DataOutputStream(fo);
            Do.writeBytes("java");
            Do.flush();
            Do.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileInputStream fi = new FileInputStream("D:\\fax.txt");
            DataInputStream Di = new DataInputStream(fi);

            int input =  fi.available();
            byte [] b = new byte[input];
            Di.read(b);
            for (int bt: b){
                char k =  (char)bt;
                System.out.print(k+"-");
            }




            int i;
            while ((i = Di.read()) != -1){
                //System.out.print((char)i);
                System.out.print(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*
        try {
            FileOutputStream fo = new FileOutputStream("D:\\fax.txt");
            FilterOutputStream fro = new FilterOutputStream(fo);
            String s = "Hello, world";
            byte [] b = s.getBytes();
            fro.write(b);
            fro.flush();
            fo.close();
            fro.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileInputStream fi = new FileInputStream("D:\\fax.txt");
            FilterInputStream fri = new BufferedInputStream(fi);

            int i;
            while ((i = fri.read())!= -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

         */
        /*
        ObjectStreamClass o = ObjectStreamClass.lookup(Main.class);
        System.out.println(o.getField("Name"));

        ObjectStreamClass o1 = ObjectStreamClass.lookup(String.class);

        System.out.println(o1.getField("mostafa"));
        ObjectStreamClass o2 = ObjectStreamClass.lookup(Employee.class);
        System.out.println(o2.getField("id"));
        System.out.println(o2.getField("name"));
        System.out.println(o2.getField("isUsd"));
        System.out.println(o2.getField("speed"));
        System.out.println(o2.getField("ar"));

         */
        /*
        Console c = System.console();
        System.out.println("Enter your name: ");
        String name = c.readLine();
        System.out.println("hello "+name);

         */
        /*
        try {
            Writer w = new FileWriter("D:\\fax.txt");
            w.write("Hello world");
            w.append("mw");
            w.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("done");

        try {
            Reader r = new FileReader("D:\\fax.txt");
            int i;
            while((i = r.read()) != -1 ){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

         */

        /*
        try {
            FileWriter fw = new FileWriter("D:\\fax.txt");
            fw.write("this my life you understand me");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileReader fr = new FileReader("D:\\fax.txt");
            int data = fr.read();
            while(data != -1){
                System.out.print((char)data);
                data = fr.read();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

         */
        /*
        try {
            FileWriter fw = new FileWriter("D:\\try.txt");
            BufferedWriter bf = new BufferedWriter(fw);
            bf.write("I can't lose");
            bf.flush();
            bf.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try{
            FileReader fr = new FileReader("D:\\try.txt");
            BufferedReader br = new BufferedReader(fr);
            int i;
            while((i = br.read()) != -1){
                System.out.print((char)i);
            }
            System.out.println();
        }catch(IOException e){
            System.out.println(e);
        }
        try {
            InputStreamReader fi = new InputStreamReader(System.in);
            BufferedReader Br = new BufferedReader(fi);
            System.out.println("Enter your name: ");
            String name = Br.readLine();
            System.out.println("hello "+name);
        }catch(IOException e){
            System.out.println(e);
        }

         */
        /*
        try {
            char[] c = {'m', 'o', 's', 't', 'a', 'f', 'a'};
            CharArrayReader cr = new CharArrayReader(c);
            for (char b : c) {
                //System.out.print((char) b);
                System.out.print((char)cr.read());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*
        try {
            CharArrayWriter cw = new CharArrayWriter();
            cw.write("mostafa hamed love you menna");
            FileWriter f1 = new FileWriter("D:\\fax.txt");
            FileWriter f2 = new FileWriter("D:\\test.txt");
            FileWriter f3 = new FileWriter("D:\\try.txt");

            cw.writeTo(f1);
            cw.writeTo(f2);
            cw.writeTo(f3);

            f1.close();
            f2.close();
            f3.close();
            cw.close();

            FileReader fr1 = new FileReader("D:\\fax.txt");
            FileReader fr2 = new FileReader("D:\\test.txt");
            FileReader fr3 = new FileReader("D:\\try.txt");

            int data;
            while((data = fr1.read())!= -1){
                System.out.print((char) data);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*
        try {
            FileOutputStream fo = new FileOutputStream("D:\\fax.txt");
            PrintStream p = new PrintStream(fo);
            p.println(852023);
            p.println("mostafa & menna");
            p.close();
            fo.close();
        } catch (Exception e) {
            System.out.println(e);
        }

         */

        //PrintWriter p = new PrintWriter(System.out);
       // p.write("i go to gym");
        //p.flush();
        //p.close();
        /*
        try {

            PrintWriter p1 = new PrintWriter("D:\\try.txt");
            p1.write("mostafa");
            p1.flush();
            p1.close();
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*
        try {
            OutputStream o = new FileOutputStream("D:\\fax.txt");
            Writer w = new OutputStreamWriter(o);
            w.write("Hello, world");
            w.close();
            o.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            InputStream i = new FileInputStream("D:\\fax.txt");
            Reader r = new InputStreamReader(i);
            int  data = r.read();
            while(data != -1){
                System.out.print((char) data);
                data = r.read();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

         */
         /*
        try {
            byte[] c = {'m', 'o', 's', 't', 'a', 'f', 'a'};
            ByteArrayInputStream b = new ByteArrayInputStream(c);
            PushbackInputStream p = new PushbackInputStream(b);
            int byRead = p.read();
            if(byRead == 'm'){
                System.out.println("found");
            }else{
                p.unread(byRead);
                System.out.println((char)byRead);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

          */
        /*
        try {
            char[] c = {'m', 'o', 's', 't', 'a', 'f', 'a'};
            PushbackReader p = new PushbackReader(new CharArrayReader(c));
            int byRead = p.read();
            if(byRead == 'o'){
                System.out.println("found");
            }else{
                p.unread(byRead);
                System.out.println((char)byRead);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

         */
        /*

        StringWriter s = new StringWriter();
        PrintWriter p = new PrintWriter(s);
        p.write("hello world");
        System.out.println(s.toString());

        try {
            String str = "mostafa tired";
            StringReader r = new StringReader(str);
            int i;
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*

        try {
            final PipedReader r = new PipedReader();
            final PipedWriter w = new PipedWriter(r);
            Thread threadRead = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        int data = r.read();
                        while (data != -1){
                            System.out.print((char) data);
                            data = r.read();
                        }
                        r.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            });


            Thread threadWrit = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        w.write("i will go now Kafer Sqer");
                        w.flush();
                        w.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            });
            threadRead.start();
            threadWrit.start();

        } catch (Exception e) {
            System.out.println(e);
        }

       */
        /*
        try {
            FileWriter fw = new FileWriter("D:\\fax.txt");
            CoFilter c = new CoFilter(fw);
            c.write("this my life");
            c.close();
            fw.close();

            FileReader fr= new FileReader("D:\\fax.txt");
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println();
        }
        System.out.println();
        try {
            FileReader fr= new FileReader("D:\\fax.txt");
            CoFRead cf = new CoFRead(fr);
            int i ;
            while((i = cf.read()) != -1){
                System.out.print((char)i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        ///* FILE Handling *///

       /*
        File f  = new File("D:/myFolder");
       // System.out.println(f.mkdir());
        File file = new File(f, "myFile.txt");
        File file2 = new File(f, "me.png");
        System.out.println(file.getAbsoluteFile());
        try {
            System.out.println(file.createNewFile());
            System.out.println(file2.createNewFile());

                String [] s= f.list();
                for(String x : s){
                    System.out.println(x);
                }
            } catch (Exception e) {
                System.out.println(e);
            }



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name File: ");
        String name = sc.nextLine();
        try {
            FileOutputStream fi = new FileOutputStream(name, true);

            System.out.println("Enter concept a file: ");

            String str = sc.nextLine();
            byte [] b = str.getBytes();
            fi.write(b);
            fi.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Saved");


        try {
            FileInputStream r= new FileInputStream("D:\\fax.txt");
            int i;
            while((i = r.read())!= -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        */
        /*
        Path path = Paths.get("D:\\myFolder\\mail.txt");
        try {
            Path p = Files.createFile(path);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Exits");

         */
        /*
        try{
        String txt = "helle, java";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your path: ");
        String path = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write(txt);

        bw.close();

        } catch (IOException e) {
            System.out.println(e);
        }

        try{
            String txt = "helle, java";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your path: ");
            String path = br.readLine();

            FileWriter fw = new FileWriter(path);
            fw.write(txt);

        } catch (IOException e) {
            System.out.println(e);
        }

         */
        /*
        try {
            String txt = "this is life it's def";
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter FileName here: ");
            String fileName = sc.nextLine();
            FileOutputStream fos = new FileOutputStream(fileName);
            byte [] b = txt.getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException e) {
            System.out.println(e);
        }

         */
        /*
        try {
            File f = new File("D:\\fax.txt");
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();

            String line;
             while((line = bf.readLine()) != null){
                 //System.out.println(line);
                 sb.append(line);
                 sb.append('\n');
            }
            System.out.println(sb);
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileInputStream fi = new FileInputStream("D:\\fax.txt");
            Scanner sc = new Scanner(fi);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*
        try {
            File f = new File("D:\\quiz.txt");
            f.createNewFile();
            System.out.println(f.exists());
            System.out.println(f.delete());
            System.out.println(f.exists());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("<--------------------->");
        try {
            File f1 = new File("D:\\qu.txt");
            f1.createNewFile();
            System.out.println(f1.exists());
            f1.deleteOnExit();

            System.out.println(f1.exists());
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*
        File dir = new File("D:\\quiz");
        File f = new File(dir,"D:\\fax.txt");
        System.out.println(f.getAbsoluteFile());
        String path = "D:\\quiz\\fax.txt";
        FilePermission file1 = new FilePermission("D:\\quiz\\-","read");
        PermissionCollection p = file1.newPermissionCollection();
        p.add(file1);
        FilePermission file2 = new FilePermission(path,"write");
        p.add(file2);
        if(p.implies(new FilePermission(path,"read,write"))){
            System.out.println("ok");
        }else{
            System.out.println("don't worry");
        }

         */
        /*
        try {
            byte[] b = {90, 23, 43, 45, 12, 34, 54, 76, 78};
            FileOutputStream fo = new FileOutputStream("D:\\fax.txt");
            FileInputStream fi = new FileInputStream("D:\\fax.txt");

            FileDescriptor fd = fo.getFD();
            fo.write(b);
            fo.flush();
            fd.sync();
            System.out.println(fd.valid());
            int i = 0;
            while((i = fi.read()) != -1){
                char ch = (char) i;
                System.out.print(ch+" ");
            }

        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*
        try {
            RandomAccessFile r = new RandomAccessFile("D:\\fax.txt", "rw");
            r.write("I'm fine you ok".getBytes());
            r.seek(4);
            r.write("not".getBytes());
            r.seek(0);
            String line = r.readLine();
            System.out.println(line);

        } catch (Exception e) {
            System.out.println(e);
        }

        final String file = "D:\\fax.txt";

        final String data = "Hello my mother";
        try {
            System.out.println(new String(readFile(file,0, 10)));
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            writeTO(file,data,6);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

         */
        /*

        try {
            FileOutputStream fo = new FileOutputStream("ox.zip");
            ZipOutputStream zo = new ZipOutputStream(fo);
            File f = new File("D:\\try.txt");
            FileInputStream fi = new FileInputStream(f);
            ZipEntry zt = new ZipEntry(f.getName());
            zo.putNextEntry(zt);
            byte [] b = new byte[1024];
            int len;
            while((len = fi.read())!= -1){
                zo.write(b,0,len);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        /*

        File f = new File("D:\\fax.txt");
        Path p = f.toPath();
        try {
            System.out.println(Files.readString(p));
        } catch (IOException e) {
            System.out.println(e);
        }

         */
        /// Serialization in java ///
        Employee E = new Employee("mostafa", 1,20);
        /*
    try {

            FileOutputStream fo = new FileOutputStream("D:\\fax.txt");
            ObjectOutputStream op = new ObjectOutputStream(fo);
            op.writeObject(E);
            op.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        try {

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\fax.txt"));
            E = (Employee) in.readObject();

            in.close();

            System.out.println(E.name);
            System.out.println(E.id);
            System.out.println(E.age);
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        Employee1  e2 = new Employee1("menna",1, 19 );
        try {
            ObjectOutputStream op =  new ObjectOutputStream(new FileOutputStream("D:\\fax.txt") );
            op.writeObject(e2);
            op.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            ObjectInputStream oi = new ObjectInputStream(new FileInputStream("D:\\fax.txt"));
            e2 = (Employee1) oi.readObject();
            System.out.println(e2.name);
            System.out.println(e2.id);
            System.out.println(e2.age);

        } catch (Exception e) {
            System.out.println(e);
        }


    }
    /*

    public static void ReadZip(String path){

        try {
            FileInputStream fi = new FileInputStream(path);
            ZipInputStream zi = new ZipInputStream(new BufferedInputStream(fi));
            ZipEntry zt = null;

            while ((zt = zi.getNextEntry()) != null){
                System.out.print(zt.getName());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

     */
    /*
    private static void zipFolder( File folder,String path, ZipOutputStream zos){
        File [] files = folder.listFiles();
        for(File file : files){
            String zipE = path +"\\"+ file.getName();
            if(file.isDirectory()){
                zipFolder(folder,zipE,zos);
            }else {
                try {
                    FileInputStream fi = new FileInputStream(file);
                    ZipEntry zt = new ZipEntry(file.getName());
                    zos.putNextEntry(zt);
                    byte [] b = new byte[1024];
                    int len;
                    while((len = fi.read())!=-1){
                        zos.write(b,0,len);
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

     */
}
