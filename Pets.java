interface per {
    boolean check(int x);

}
public class Pets{
    public static per isOdd(){
        return a -> a % 2 == 0;
    }
    public static per isPrim(){
        return a -> {
            if(a <= 1){return false;}
            for(int i = 2; i * i <= a ; i++){
                if(a % i == 0){
                    return false;
                }
            }
            return  true;
        };
    }
    public static void main(String[] args) {

        per b = isOdd();
        per p = isPrim();
        System.out.println(b.check(3) ? "Even":"Odd");
        System.out.println(b.check(4) ? "Even":"Odd");
        System.out.println(p.check(4)? "PRIM":"NOT PRIME");

    }
}
