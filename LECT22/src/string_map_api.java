import java.util.*;
public class string_map_api {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        List<Integer> mapRes= list.stream().map(n->n*2).toList();
        System.out.println(mapRes);
    }
}

