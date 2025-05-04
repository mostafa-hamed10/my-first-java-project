public class dlyLinked {
    public Node first, last;

    public void insertFirst(int newV) {
        Node newLink = new Node(newV);
        if(first == null){
            last = newLink;
        }else{
            first.prv = newLink;
        }
        newLink.next = first;
        first = newLink;
    }
    public void insertLast(int newV){
        Node newLink = new Node(newV);
        if(first == null){
            first = newLink;
        }else{
            last.next = newLink;
            newLink.prv = last;
        }
        last = newLink;
    }
    public int deleteFirst(){
        Node tmp = first;
        if(first.next == null){
            last = null;
        }else{
            first.next.prv = null;
        }
        first = first.next;
        return tmp.data;
    }
    public int deleteLast(){
         Node tmp = first;
         if(first.next == null){
             first = null;
         }else{
             last.prv.next = null;
         }
         last = last.prv;
         return tmp.data;
    }
    public void disPlayForward(){
        Node cuRRnt = first;
        while (cuRRnt != null){
            System.out.println(cuRRnt.data);
            cuRRnt = cuRRnt.next;
        }
    }
    public void disPlayBackward(){
        Node cuRRnt = last;
        while (cuRRnt != null){
            System.out.println(cuRRnt.data);
            cuRRnt = cuRRnt.prv;
        }
    }
    public boolean insertAfter(int key, int newV){
        Node cuRRnt = first;
        while (cuRRnt.data != key){
            cuRRnt = cuRRnt.next;
        }
        Node newLink = new Node(newV);
        if(cuRRnt == last){
            last = newLink;
        }else{
            newLink.next = cuRRnt.next;
            cuRRnt.next.prv = newLink;
        }
        cuRRnt.next = newLink;
        newLink.prv = cuRRnt;
        return true;
    }
    public Node deleteIt(int key , int newV){
        Node cuRRnt = first;
        while (cuRRnt.data != key){
            cuRRnt = cuRRnt.next;
        }
        if (cuRRnt == null) {
            return null;
        }
        if(cuRRnt == last){
            last = cuRRnt.prv;
        }else{
            cuRRnt.prv.next = cuRRnt.next;
        }
        if(cuRRnt == first){
            first = cuRRnt.next;
        }else{
            cuRRnt.next.prv = cuRRnt.prv;
        }
        return cuRRnt;
    }

    public static void main(String[] args) {
        dlyLinked l = new dlyLinked();
        l.insertFirst(10);
        l.insertFirst(20);
        l.insertFirst(30);
        l.insertFirst(40);
        l.disPlayForward();
        l.insertAfter(20,25);
        l.disPlayForward();
        l.deleteIt(25,25);
        l.disPlayForward();
    }
}
