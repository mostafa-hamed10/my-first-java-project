public class Tree {
    Nod root;

    public boolean findV(int key) {
        Nod cuRRnt = root;
        while (cuRRnt.data != key) {
            if (key > cuRRnt.data) {
                cuRRnt = cuRRnt.rightChild;
            } else {
                cuRRnt = cuRRnt.liftChild;
            }
            if (cuRRnt == null) {
                return false;
            }
        }
        return true;
    }

    public void insert(int newV) {
          Nod newNode = new Nod(newV);
          if(root == null){
              root = newNode;
          }else{
              Nod cuRRnt = root;
              Nod par ;
              while(true){
                  par = cuRRnt;
                  if(cuRRnt.data > newV){
                      cuRRnt = cuRRnt.liftChild;
                      if(cuRRnt == null ){
                          par.liftChild = newNode;
                          return;
                      }
                  }else {
                      cuRRnt = cuRRnt.rightChild;
                      if (cuRRnt == null) {
                          par.rightChild = newNode;
                          return;
                      }
                  }
              }
          }
    }
    public int getMax(){
        Nod cuRRnt = root;
        while (cuRRnt.rightChild != null){
            cuRRnt = cuRRnt.rightChild;
        }
        return cuRRnt.data;
    }
    public int getMin(){
        Nod cuRRnt = root;
        while (cuRRnt.liftChild != null){
            cuRRnt = cuRRnt.liftChild;
        }
        return cuRRnt.data;
    }
    public void inorder(Nod localRoot){
        if(localRoot != null){
            inorder(localRoot.liftChild);
            System.out.print(localRoot.data+" ");
            inorder(localRoot.rightChild);
        }
    }
    public void perOrder(Nod localRoot){
        if(localRoot != null){
            System.out.print(localRoot.data+" ");
            inorder(localRoot.liftChild);
            inorder(localRoot.rightChild);
        }
    }
    public void postOrder(Nod localRoot){
        if(localRoot != null){
            inorder(localRoot.liftChild);
            inorder(localRoot.rightChild);
            System.out.print(localRoot.data+" ");
        }
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        t.insert(100);
        t.insert(99);
        t.insert(105);
        System.out.println(t.getMax());
        t.inorder(t.root);
        System.out.print("| ");
        t.perOrder(t.root);
        System.out.print("| ");
        t.postOrder(t.root);
    }
}