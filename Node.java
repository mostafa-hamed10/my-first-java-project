public class Node {
    public int data;
    public Node next, prv;

    public Node(int data) {
        this.data = data;
    }

    public String toString() {
        return "data -> "+data;
    }
}