import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    String name;
    int RollN;

    public Student(int RollN,String name){
        this.name=name;
        this.RollN=RollN;

    }
    public int compareTo(Student s1){
        return this.RollN-s1.RollN;
    }
    public String toString(){
        return "RollN:"+RollN+",name:"+name;
    }
}

class compararble{
    public static void main(String[]args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add (new Student(270, "rishika!!"));
        list.add(new Student(151,"neha!!"));
        list.add(new Student(174,"riya!!"));
        Collections.sort(list);
        System.out.println(list.toString());
    }
}

