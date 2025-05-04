public class CoThread{
     private String food;
     private boolean isReady = false;

     synchronized void cook(String mael){
         while (isReady){
             try {
                 wait();
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
         food = mael;
         isReady = true;
         System.out.println("Prepar this order: "+food);
         notify();
     }
     synchronized void serve(){
         while (!isReady){
             try {
                 wait();
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
         System.out.println("Come to take is order");
         isReady = false;
         notify();
     }

    public static void main(String[] args) {
        CoThread c  = new CoThread();

        Thread chef = new Thread(){
            @Override
            public void run() {
                String [] males = {"Meat","Bread","Rice"};
                for (String male : males) {
                    c.cook(male);
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        };
        Thread waiter = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    c.serve();
                    try{
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            }
        };
        chef.start();
        waiter.start();

    }
}





