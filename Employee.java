import java.io.Serializable;
import java.util.Comparator;

class Employee{
    private static final long SerialVersionUID = 1L;
    String name;
    int id ;
    transient int age ;

    public Employee(String name , int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

}
