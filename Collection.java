import com.mysql.cj.x.protobuf.MysqlxExpect;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Collection {
    enum days  {  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  };
    enum key {one , two,three};
    public static void main(String[] args) {
        /// ArrayList ///
       /*
        ArrayList <String> list = new ArrayList<String>();
        list.add("mostafa");
        list.add("mohamed");
        list.add("yasser");

        for(String s : list){
            System.out.println(list);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Iterator it1 = list.iterator();
        it1.forEachRemaining( a ->{
            System.out.println(a);
        });
        list.forEach(a ->{
            System.out.println(a);
        });
        */
        /*
        Student s1 = new Student(19 , "MOSTAFA", "ABO KAB");
        Student s2 = new Student(19,"ALI", "KAF SQR");

        ArrayList<Student> list2 = new ArrayList<Student>();
         list2.add(s1);
        list2.add(s2);
        Iterator it3 = list2.iterator();
        while (it3.hasNext()){
            Student s = (Student) it3.next();
            System.out.println(s.adders +" * "+s.age+" * "+s.name);

        }

         */
        /// LinkedList ///
        /*
        LinkedList<String>list = new LinkedList<String>();
        list.add("mostafa");
        list.add("mohamed");
        list.add("Yasser");

        for (int i = 0; i < list.size() - 2; i++) {
            System.out.println(list);
        }
        for(String s : list){
            System.out.println(s);
        }
        Student s1 = new Student(20, "Mostafa","FQU");
        Student s2 = new Student(20, "Ail","ZGZ");

        LinkedList <Student> l = new LinkedList<>();
        l.add(s1);
        l.add(s2);

        for (Student s : l){
            System.out.println(s.name +" _ "+s.adders+" _ "+s.age);
         }
        Iterator it = l.descendingIterator();
        while (it.hasNext()){
            Student s =(Student)it.next();
            System.out.println(s.name +" _ "+s.adders+" _ "+s.age);
        }

         */
        /// HashSet ///
        /*
        HashSet<String> h = new HashSet<>();
        h.add("Mostafa");
        h.add("Hamed");
        h.add("Awad");
        h.add("Mostafa");

        for (String s: h){
            System.out.println(s);
        }
        for (int i = 0; i < h.size() -2; i++) {
            System.out.println(h);
        }
        System.out.println(h);
        String[] arr = h.toArray(new String[0]);
        for(String s : arr){
            System.out.println(s);
        }
        HashSet<String> h2 = new HashSet<>(h);
        h2.add("Yasser");
        h2.add("Mohamed");

        for(String s : h2){
            System.out.println(s);
        }

        Student s1 = new Student(19,"mostafa","ABo Kbr");
        Student s2 = new Student(19,"mohamed", "Kaf Sqr");

        HashSet<Student> he = new HashSet<>();
        he.add(s1);
        he.add(s2);
        System.out.println(he);
         */
        /*

        LinkedHashSet<String> l = new LinkedHashSet<>();
        l.add("Walid");
        l.add("Esam");
        l.add("Fahd");
        System.out.println(l);
        for(String s:l){
            System.out.println(s);
        }

         */
        /*
        TreeSet<String> t = new TreeSet<>();
        t.add("Mostafa");
        t.add("Hend");
        t.add("Ahmed");
         for(String s: t){
             System.out.println(t);
         }

         */
         /// Queue and Priority Queue///

       // Queue<String> q= new PriorityQueue<>();
        //q.add("Mostafa");
        //q.add("Ahmed");
        //q.add("Mohamed");

        //for(String s : q){
          //  System.out.println(s);
        //}
        /*
        Queue<Student> q = new PriorityQueue<>();
        Student s1 = new Student(19, "Mostafa","Abo kab");
        Student s2 = new Student(19, "M","Abo kab");

        q.add(s1);
        q.add(s2);
        for (Student s : q){
           System.out.println(s.name +" "+s.age+" "+s.adders);
        }

         */
        /// Deque  and ArrayDequeue///
        /*

        Deque<String> d = new ArrayDeque<>();
        d.add("The life");
        d.add(" is ");
        d.add("tired");

        for(String s: d){
            System.out.print(s);
        }
        System.out.println();
        Student s1 = new Student(20," Mostafa","Cairo");
        Student s2 = new Student(20," Omar","Giza");
        ArrayDeque<Student> arr = new ArrayDeque<>();
        arr.add(s1);
        arr.add(s2);

        for(Student s:arr){
            System.out.println(s);
        }

         */
        /// Map ///
        /*
        Map<Integer,String> m = new HashMap<>();
        m.put(1,"mostafa");
        m.put(2,"Ahmed");
        m.put(3,"Mohamed");

        for(Map.Entry<Integer,String>entry : m.entrySet() ){
            System.out.println(m.get(1)+" "+m.get(2)+" "+m.get(3));
        }
        System.out.println(m.replace(3,"yasser"));
        Set s = m.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(m.containsKey(2));

         */
        /// HashMap ///
        /*
        HashMap<Integer,String> h = new HashMap<>();
        h.put(1,"Mostafa");
        h.put(2,"Abdalla");
        h.put(3,"Farid");

        System.out.println(h);
        System.out.println("----------------------");
        for (int i = 0; i < h.size() - 2; i++) {
            System.out.println(h);
        }
        System.out.println("------------------------");
        Set s = h.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Student s1 = new Student(22,"Mostafa","Abo Kbr");

        HashMap<Integer, Student> h2 = new HashMap<>();
        h2.put(1,s1);
        System.out.println(h2);

         */
        /// LinkedHashMap ///
        /*
        LinkedHashMap<Integer, String> l = new LinkedHashMap<>();
        l.put(1,"Hady");
        l.put(2,"Fahd");
        l.put(3,"Mohamed");

        System.out.println(l);
        System.out.println("----------------");
        for (int i = 0; i < l.size() - 2; i++) {
            System.out.println(l);
        }
        System.out.println("-----------------");
        Set s = l.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-------------------");
        for (Map.Entry<Integer, String> e : l.entrySet()){
            System.out.println(e);
        }

        Student s2 = new Student(17, "Kalid", "Alex");
        LinkedHashMap<Integer, Student> l2 = new LinkedHashMap<>();
        l2.put(1,s2);
        System.out.println(l2);

         */
        /// TreeMap ///
        /*
        TreeMap<Integer,String> t = new TreeMap<>();
        t.put(1,"Mostafa");
        t.put(2,"Mohamed");

        for (Map.Entry<Integer, String> e : t.entrySet()){
            System.out.println(e);
        }

         */
        /// HashTable ///
        /*

        Hashtable<Integer, String> h = new Hashtable<>();
        h.put(1,"Mohamed");
        h.put(2,"Mostafa");
        //System.out.println(h);
        for (Map.Entry e : h.entrySet()){
            System.out.println(e.getKey()+" = "+e.getValue());
        }


        Student  s1 = new Student(19,"Mohamed","Abo Kab");
        Student  s2 = new Student(19,"Mostafa","Abo Kab");
        Hashtable<Integer,Student> ht = new Hashtable<>();
        ht.put(1,s1);
        ht.put(2,s2);

        for (Map.Entry e : ht.entrySet()){
            System.out.println(e);
        }
        */
        ///  EnumSet ///
        /*
        Set<days> s = EnumSet.allOf(days.class);
        Iterator<days>it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------");
        Set<days> s1= EnumSet.noneOf(days.class);
            System.out.println(s1);
        System.out.println("----------------");
        Set<days> s2 = EnumSet.of(days.FRIDAY,days.MONDAY);
        System.out.println(s2);

         */
        /// EnumMap ///
        /*
        Map<days,Integer> s1 = new EnumMap<days,Integer>(days.class);
        s1.put(days.FRIDAY, 1);
        s1.put(days.MONDAY, 2);
        s1.put(days.TUESDAY, 3);
        s1.put(days.WEDNESDAY,4);
        s1.put(days.SUNDAY, 5);
        System.out.println(s1);
        System.out.println("--------------");
        Student S1 = new Student(21,"Mostafa","ABuo kab ");
        Student S2 = new Student(21,"Osama","ABuo kab ");
        Student S3 = new Student(21,"Walid","ABuo kab ");
        EnumMap<key,Student> E = new EnumMap<>(key.class);
        E.put(key.one, S1);
        E.put(key.two,S2);
        E.put(key.three,S3);
        System.out.println(E);

         */
        /// Collections ///
        /*
        List<String> l = new ArrayList<>();
        l.add("Ahmed");
        l.add("ZAin");
        l.add("mostafa");
        System.out.println(l);
        Collections.addAll(l,"mohamed","Ali");
        System.out.println(l);
        String[] str = {"Walid","Said"};
        Collections.addAll(l,str);
        System.out.println(l);

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(23);
        l1.add(89);
        l1.add(50);
        System.out.println(Collections.max(l1));
        System.out.println(Collections.min(l1));

         */
        /*
        ArrayList<String> a = new ArrayList<>();
        a.add("Mostafa");
        a.add("Mohamed");
        a.add("Yasser");
        a.add("Asma");
        a.add("Share");
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);

        System.out.println("------------------");

        ArrayList a1 =new ArrayList();
        a1.add(Integer.valueOf(12));
        a1.add(Integer.valueOf(22));
        a1.add(Integer.valueOf(29));
        Collections.sort(a1,Collections.reverseOrder());
        System.out.println(a1);
        Student S1 = new Student("Mostafa");
        Student S2 = new Student("Osama");
        Student S3 = new Student("Walid");
        ArrayList a2 = new ArrayList();
        a2.add(S1);
        a2.add(S2);
        a2.add(S3);
        Collections.sort(a2);

        System.out.println(a2);

         */
        /*
        Employee e1 = new Employee("mostafa",3,20);
        Employee e2 = new Employee("mohamed",1,30);
        Employee e3 = new Employee("yasser",2,29);
        ArrayList<Employee> a = new ArrayList<>();
        a.add(e1);
        a.add(e2);
        a.add(e3);
        Collections.sort(a,new CompAge());
        for(Employee e : a){
            System.out.println(e.name+" "+e.age+" "+e.id);
        }
        System.out.println("After Compare Name");
        Collections.sort(a,new CompName());
        for(Employee e : a){
            System.out.println(e.name+" "+e.age+" "+e.id);
        }

         */
        /// Properties ///
        /*
        Properties p = System.getProperties();

        Set s = p.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println(e.getKey()+" = "+e.getValue());
        }
        System.out.println("--------------------");
        Properties pr = new Properties();
         try {

              pr.setProperty("name", "Mostafa");
              pr.setProperty("email", "Mostafa@gmail.com");

              pr.store(new FileWriter("info.Properties"),"hello my world");

            }catch (Exception e){
             System.out.println(e);
         }
         try{
             FileReader f = new FileReader("info.Properties");
             pr.load(f);
             System.out.println(pr.getProperty("name"));
             System.out.println(pr.getProperty("email"));
         } catch (Exception e) {
             System.out.println(e);
         }

         */
        /*
        Vector<String> v = new Vector<>();
        v.add("mostafa ");
        v.add("Hello ");
        v.add("you can see this is cool");

        for(String s : v){
            System.out.print(s);
        }

         */
        /// Stack ///
        /*
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(30);
        s.push(34);

        System.out.println(s.peek());
        ListIterator<Integer> it = s.listIterator(s.size());
        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println("-------------");
        s.forEach(n->{
            System.out.println(n);
        });
        System.out.println("-----------");

        Iterator<Integer> i= s.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

         */
        ///  Collection ///
        /*
        Set<Integer> s = new HashSet<>();
        s.add(12);
        s.add(13);
        s.add(14);
        System.out.println(s);
        Collections.addAll(s,1,3,5,6,8);
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.contains(12));
        System.out.println("--------");
        Queue<Integer> q = new PriorityQueue<>();
        for (int i = 1; i < 25; i++) {
            int x = i * 2;
            q.add(x);
        }
        System.out.println(q);

         */




    }

}


