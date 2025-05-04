public class Engin {
    public static void main(String[] args) {
        System.out.println("hello");
    }

    private String type;
    private int power;

    public Engin(String type, int power) {
        this.type = type;
        this.power = power;
    }

    public Engin(){}

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
