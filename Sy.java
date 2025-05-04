 public class Sy {
    static synchronized void printTable(int n) {
        //synchronized(this){
            for (int i = 1; i < 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

        }
    //}

    public static void main(String[] args) {

        Sy ob = new Sy();
        Thread th1 = new Thread(){
            @Override
            public void run() {
                ob.printTable(1);
            }
        };
        Thread th2 = new Thread(){
            @Override
            public void run() {
                ob.printTable(10);
            }
        };
        Thread th3 = new Thread(){
            @Override
            public void run() {
                ob.printTable(100);
            }
        };
        Thread th4 = new Thread(){
            @Override
            public void run() {
                ob.printTable(1000);
            }
        };
        th1.start();
        th2.start();
        th3.start();
        th4.start();


        /*
        Sender sender = new Sender();
        ThreadSender th1 = new ThreadSender("Menna", sender);
        ThreadSender th2 = new ThreadSender("Mostafa", sender);
        th1.start();
        th2.start();


        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

         */

    }

}
