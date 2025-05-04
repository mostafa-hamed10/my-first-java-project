public class StackL {
    LinkList list = new LinkList();

    public void push(int newV){
        list.insertFrIst(newV);
    }
    public int pop(){
        return list.deleteFrIst();
    }
    public int peek(){
        return list.frIst.data;
    }

    public static void main(String[] args) {
        StackL l = new StackL();
        l.push(19);
        l.push(18);
        l.push(12);
        System.out.println(l.peek());
        System.out.println(l.pop());
    }
}
