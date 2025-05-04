public class UnOrderArray {
    private int [] data;
    private int nElm;

    public UnOrderArray(int cap) {
        data = new int [cap];
        nElm = 0;
    }
    public void insert(int newV){
        data[nElm] = newV;
        nElm++;
    }
    public boolean serUndAB(int key){
        for (int i = 0; i < nElm; i++) {
            if(data[i] == nElm){
                return true;
            }
        }
        return false;
    }
    public int serDab(int key){
        int count = 0;
        for (int i = 0; i < nElm; i++) {
            if(data[i] == key){
                count++;
            }
        }
        return count;
    }
    public void disPlay(){
        for (int i = 0; i < nElm; i++) {
            System.out.print(data[i]+", ");
        }
        System.out.println("");
    }
    public boolean isFull(){
        return nElm == data.length;
    }
    public boolean isEmpty() {
        return nElm != data.length;
    }
    public int delete(int key){
        int oldV = -1;
        int i;
        for ( i = 0; i < nElm; i++) {
            if (data[i] == key) {
                oldV = data[i];
                break;
            }
        }
        if (i < nElm) {
            for (int j = i; j < nElm; j++) {
                data[j] = data[j + 1];
            }
            nElm--;
        }
        return oldV;
    }



    public static void main(String[] args) {
        UnOrderArray au = new UnOrderArray(6);
            au.insert(11);
            au.insert(15);
            au.insert(11);
            au.insert(10);
            //au.insert(11);
            au.insert(18);

        au.disPlay();
        //System.out.println(au.serDab(11));
        System.out.println(au.delete(10));

    }
}
