import java.applet.Applet;
import java.awt.*;

class MyViewer extends Frame {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class c=Class.forName(args[0]);

        MyViewer v= new MyViewer();
        v.setSize(400,400);
        v.setLayout(null);
        v.setVisible(true);

        Applet a=(Applet)c.newInstance();
        a.start();
        Graphics g=v.getGraphics();
        a.paint(g);
        a.stop();
        /*
        Class c1 = Class.forName("IO");
        System.out.println(c1.getName());

        Class c2 = Object.class.getClass();
        System.out.println(c2.getName());

        Class c3 =  Boolean.class;
        System.out.println(c3.getName());

        Class c4 = IO.class;
        System.out.println(c4.getName());

     */
        /*
        Class c = Class.forName(args[0]);



        Field[] f = c.getDeclaredFields();
        for (int i = 0; i < f.length; i++) {
           System.out.println(f[i]);
        }

        Constructor [] co  = c.getDeclaredConstructors();
        for (int i = 0; i < co.length; i++) {
            System.out.println(co[i]);
        }

        Method [] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }

         */




    }
}

