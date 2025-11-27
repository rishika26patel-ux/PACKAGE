import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



class student{
    String name;
    int RollN;
    public student(int  RollN,String name){
        this.name=name;
        this.RollN=RollN;
    }
    public String toString(){
        return "RollN:"+RollN+",name:"+name;
}
class NameSorted implements Comparator<student>{
    public int compare(student s1,student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class comparitive {
    public static void main(String[]args){
        ArrayList<student>list=new ArrayList<>();
        list.add(new student(270,"rishika"));
        list.add(new student(151,"neha"));
        Collections.sort(list,new NameSorted());
        for(student s:list){
            System.out.println(s.RollN+""+s.name);
        }
    }
}
