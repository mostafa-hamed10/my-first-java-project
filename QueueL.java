public class QueueL {
    public Link frIst;
    public Link last;

    public void insertFirst(int newV){
        Link newLink = new Link(newV);
        if(frIst == null) {
           last = newLink;
        }
        newLink.next = frIst;
        frIst = newLink;

    }
    public void insertLast(int newV){
        Link newLink = new Link(newV);
        if(frIst == null){
            frIst = newLink;
        }else{
            last.next = newLink;
        }
        last = newLink;
    }
    public int deleteFirst(){
        int data = frIst.data;
        if(frIst.next == null){
            last = null;
        }else{
            frIst = frIst.next;
        }
        return  data;
    }
    public int  disPlay(){
        return frIst.data;
    }

    public static void main(String[] args) {
        QueueL l = new QueueL();
        l.insertLast(10);
        l.insertLast(13);
        l.insertLast(11);
        System.out.println(l.disPlay());
        System.out.println(l.deleteFirst());
    }
}
