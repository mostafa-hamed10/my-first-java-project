public class LinkList {
    Link frIst;

    public void insertFrIst(int newN){
        Link newLink = new Link(newN);
        if(frIst == null){
            frIst = newLink;
        }else{
            newLink.next = frIst;
            frIst = newLink;
        }
    }
    public int deleteFrIst(){
        int data = frIst.data;
        frIst = frIst.next;
        return  data;
    }
    public void disPlay(){
        Link cuRRnt = frIst;
        while (cuRRnt != null){
            System.out.print(cuRRnt.data+" ");
            cuRRnt = cuRRnt.next;
        }
        System.out.println(" ");
    }
    public boolean ser(int key){
        Link cuRRnt = frIst;
        while (cuRRnt != null){
            if(cuRRnt.data == key){
                System.out.println("is found --> "+cuRRnt.data);
                return true;
            }
            cuRRnt = cuRRnt.next;
        }
        return !(cuRRnt == null);
    }
    public Link deleteIt(int key){
        Link cuRRnt = frIst; Link pev = frIst;
        while (cuRRnt.data != key ){
            if(cuRRnt == null){
                return null;
            }
            pev = cuRRnt;
            cuRRnt = cuRRnt.next;
        }
        if(cuRRnt == frIst){
            frIst = frIst.next;
        }else{
            pev.next = cuRRnt.next;
        }
        return cuRRnt;
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insertFrIst(10);
        list.insertFrIst(20);
        list.insertFrIst(40);
        list.insertFrIst(50);
        list.disPlay();
        System.out.println(list.ser(90));
        System.out.println(list.deleteIt(20));
        System.out.println(list.deleteFrIst());

    }

}

