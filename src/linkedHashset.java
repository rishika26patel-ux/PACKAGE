import java.util.*;
//ORDERED MAINTAIN
public class linkedHashset {
    public static  void main(String[]args){
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(120);
        set.remove(120);
        System.out.println(set);
    }
}
