
public class Sender{
    public  void senderMes(String Mes){
        System.out.println("Sending a Message: "+Mes);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);;
        }
        System.out.println(Mes+" Send");
    }
}


