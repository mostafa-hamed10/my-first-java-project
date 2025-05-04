public class ThreadSender extends Thread {
    private String Mes;
    Sender sd;

    ThreadSender(String Mes, Sender sd){
        this.sd = sd;
        this.Mes = Mes;
    }

    @Override
    public void run() {
        synchronized (sd){
            sd.senderMes(Mes);
        }
    }
}
