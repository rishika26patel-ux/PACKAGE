import java.util.ArrayList;
import java.util.Collections;

//public class sort {
  //  public static void main(String[]args){
    //    ArrayList<Integer>list=new ArrayList();
      //  list.add(1);
        //list.add(2);
        //list.add(5);
        //Collections.sort(list);
        //System.out.println(list);
    //}
//}

class Student implements Comparable<Student>{

    String name;
    int RollN;

    public Student(int RollN,String name){
        this.RollN=RollN;
    }
    public int compareTo(Student s1){
        return this.RollN-s1.RollN;
    }
    public String toString(){
        return "RollN:"+RollN+",name:"+name;
    }
}

class sort{
    public static void main(String[]args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add (new Student(160, "rishika"));
        list.add(new Student(170,"neha"));
        Collections.sort(list);
        System.out.println(list.toString());
    }
}
