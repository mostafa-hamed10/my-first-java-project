public class ThreadGr extends Thread{
    ThreadGr(String name, ThreadGroup gr){
        super(gr, name);
        start();
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"finished this thread");
    }

    public static void main(String[] args) {

        ThreadGroup g = new ThreadGroup("Group parent");
        ThreadGroup g2= new ThreadGroup(g,"Group Child");

        ThreadGr tg1 = new ThreadGr("first ", g);
        ThreadGr tg2 = new ThreadGr("secend ", g);


        try {
            tg1.join();
            tg2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        //System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(g.getParent().getName());
        System.out.println(g2.getParent().getName());

        //g.interrupt();
        //g2.destroy();
        //System.out.println("destroy is child group");

        //g.destroy();
        //System.out.println("destroy is parent group");

        //g.list();
       // System.out.println("count: "+g.activeCount());
       // System.out.println("count2: "+g.activeGroupCount());
    }
}
