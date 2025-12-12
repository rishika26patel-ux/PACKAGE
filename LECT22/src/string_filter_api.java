import java.util.*;
public class string_filter_api {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(50);
        list.add(70);
        list.add(60);
        list.add(80);
        list.add(90);
        list.add(100);
       List<Integer> res= list.stream().filter(n->n>60).toList();
       //System.out.println(res);
       List<Integer> skip= list.stream().skip(2).toList();
       List<Integer> limit= list.stream().limit(2).toList();
       List<Integer> sort= list.stream().sorted((a,b)->a-b).toList();
       System.out.println(sort);
    }
}
