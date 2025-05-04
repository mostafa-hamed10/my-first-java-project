public class inOrderArray {
    private int []data;
    private int nElm;

    public inOrderArray(int cap) {
        data = new int [cap];
        nElm = 0;
    }
    public void insert(int newV){
        int i;
        for (i = 0; i < nElm; i++) {
            if(data[i] > newV){
                break;
            }
        }if(i < nElm) {
            for (int j = nElm; j > i; j--) {
                data[j] = data[j - 1];
            }
        }
        data[i] = newV;
        nElm++;
    }
    public int delete(int key){
        int oldV = -1;
        int i;
        for ( i = 0; i < nElm; i++) {
            if (data[i] == key){
                oldV = data[i];
                break;
            }
        }if(nElm > i) {
            for (int j = i; j < nElm; j++) {
                data[j] = data[j + 1];
            }
            nElm--;
        }
        return oldV;
    }
    public boolean linearSer(int key){
        for (int i = 0; i < nElm; i++) {
            if(data[i] == key){
                return true;
            }
        }
        return false;
    }
    public boolean binarySer(int key) {
        int min = 0;
        int max = nElm;
        int mid;
        while (true) {
            mid = (min + max) / 2;
            for (int i = 0; i < nElm; i++) {
                if (data[mid] == key) {
                    return true;
                } else {
                    if (data[mid] < key) {
                        min = mid + 1;
                    } else {
                        max = mid - 1;
                    }
                }
                if (min > max) {
                    return false;
                }
            }
        }
    }
    public void disPlay(){
        for (int i = 0; i < nElm; i++) {
            System.out.print(data[i]+", ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        inOrderArray I = new inOrderArray(5);
        I.insert(12);
        I.insert(3);
        I.insert(13);
        I.insert(4);
        System.out.println(I.delete(3));
        I.disPlay();
        System.out.println(I.linearSer(12));
        System.out.println(I.binarySer(12));
     }
}
