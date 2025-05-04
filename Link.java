public class Link {
    public  int data;
    public  Link next;

    public Link(int data) {
        this.data = data;
    }
    public String toString(){
        return "data -> "+data;
    }
}
