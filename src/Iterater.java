import java.util.*;
public class Iterater {
    public static void main(String[]args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(15);
        list.add(18);
        list.add(16);
        list.add(17);
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            if(it.next()==8){
                it.remove();
            }
        }
    }
}
