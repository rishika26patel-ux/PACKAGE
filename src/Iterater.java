//import java.util.*;
//public class Iterater {
  //  public static void main(String[]args){
    //    ArrayList<Integer>list=new ArrayList<>();
      //  list.add(15);
        //list.add(18);
        //list.add(16);
        //list.add(17);
        //ListIterator<Integer>it=list.listIterator();
        //while(it.hasPrevious()){
          //  Integer x=it.previous();
           // System.out.println(x);
        //}
        //Iterator<Integer> it=list.iterator();
        //while(it.hasNext()){
          //  System.out.println(it.next());
            //if(it.next()==8){
              //  it.remove();
            //}
        //}
    //}
//}
import java.util.*;
public class Iterater {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        ListIterator<Integer> it = list.listIterator();
        System.out.println("---sequence wise--");
        while (it.hasNext()) {
            // System.out.println(it.next());
            Integer x = it.next();

            System.out.println(x);
        }
        System.out.println("---reverse order--");
        while (it.hasPrevious()) {
            // System.out.println(it.next());
            Integer y = it.previous();

            System.out.println(y);
        }
    }
}