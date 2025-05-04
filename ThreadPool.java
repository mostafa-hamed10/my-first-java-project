import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool implements Runnable{

    private String message;

    ThreadPool(String message){
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start: "+message);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName()+": End");
    }

    public static void main(String[] args) {
        //ExecutorService ex = Executors.newFixedThreadPool(3);
        //ExecutorService ex = Executors.newSingleThreadExecutor();
        //ExecutorService ex  = Executors.newCachedThreadPool();
        ExecutorService ex =  Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 10; i++) {
            Runnable r = new ThreadPool(""+i);
            ex.execute(r);
        }
        ex.shutdown();

        while(!ex.isTerminated()){}

        System.out.println("Finished all");
    }
}
