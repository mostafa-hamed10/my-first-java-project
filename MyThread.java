public class MyThread extends Thread{
    //MyThread(String name){
      //  super(name);
    public void finalize(){
      System.out.println("This is cleaning");
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1 = null;
        t2 = null;

        System.gc();
        /*
        Thread t1  = new Thread(){
            @Override
            public void run() {
                System.out.println("first");
            }
        };
        Thread t2  = new Thread(){
            @Override
            public void run() {
                System.out.println("secend");
            }
        };
        t1.start();
        t2.start();

         */
       // MyThread t2 = new MyThread();
       // MyThread t3 = new MyThread();



        //  System.out.println("Name 1: "+t1.getName());
        //System.out.println("Name 2: "+t2.getName());

       // System.out.println(t1.getPriority());
       // System.out.println(t2.getPriority());

        //t1.setPriority(6);
        //t2.setPriority(3);

        //System.out.println(t1.getPriority());
        //System.out.println(t2.getPriority());

        //System.out.println(Thread.currentThread().getName());
        //Thread.currentThread().setPriority(6);
        //System.out.println(Thread.currentThread().getPriority());
         //t1.setDaemon(true);
        //t1.start();
        //t2.start();
        //t3.start();

        //t1.setName("Thread me");
        //System.out.println("After change: "+t1.getName());

    }
}
