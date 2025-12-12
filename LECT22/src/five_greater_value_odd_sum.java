import java.util.*;
public class five_greater_value_odd_sum {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);
        List<Integer> res= list.stream().filter(n->n>5).toList();
        List<Integer> mapRes= list.stream().map(n->n*2).toList();
        int data= list.stream().reduce(0,(a,b)->a+b);
        System.out.println(data);
        //System.out.println(res);
    }
}

