//import java.util.*;
//public class replace_absolute_value {
  //  public static void main(String[]args){
    //    ArrayList<Integer> list = new ArrayList<>();
      //  list.add(10);
       // list.add(20);
        //list.add(30);
        //list.add(40);
        //list.add(50);
        //list.add(60);
        //list.add(70);
      // int  a=list.size();
        // int m=a;
        //ListIterator<Integer> it = list.listIterator();
        //while(it.hasNext()){
          //  Integer b= it.next();
            //if(a<0){
              //  int value=a*(-1);
                //it.set(value);
                //System.out.println(m);
           // }
       // }
    //}
//}
import java.util.*;

public class replace_absolute_value {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-2);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            Integer b = it.next();
            if (b < 0) {
                int value = Math.abs(b);
                it.set(value);
            }
        }
        System.out.println("Modified List: " + list);
    }
}
