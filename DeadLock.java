public class DeadLock{
    public static void main(String[] args) {
        final String re1 = "Mostafa";
        final String re2 = "Menna";

        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (re1) {
                    System.out.println("this resource -> 1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                synchronized (re2) {
                    System.out.println("this resource -> 2");
                }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                    synchronized (re2) {
                        System.out.println("this resource -> 2");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                        }
                        synchronized (re1){
                            System.out.println("this resource -> 1");
                    }
                }

            }
        };
        t1.start();
        t2.start();

    }
}

