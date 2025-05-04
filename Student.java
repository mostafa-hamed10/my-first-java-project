public class Student implements Comparable<Student>{

    //int age ;
    String name;
    //String adders;

    public Student(String name){
      //  this.age = age;
        this.name = name;
        //this.adders = adders;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name ;
    }
    @Override
    public int compareTo(Student o) {
     return name.compareTo(o.name);

    }




}

