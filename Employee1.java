import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee1 implements Externalizable {
    private static final long SerialVersionUID = 1L;
    String name;
    int id ;
    transient int age ;
    public Employee1(){}

    public Employee1(String name , int id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(id);
        out.writeObject(age);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        id =  (int)in.readObject();
        age = (int) in.readObject();

    }
}
