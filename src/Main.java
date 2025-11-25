//import P1.A;
//import P1.B;


//public class Main{
  //  public static void main(String[]args){
    //    A s1=new A();
      //  s1.show();

        //B s2=new B();
        //s2.show();
    //}
//}

import java.util.ArrayList;
class main{
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList();
        ArrayList<Integer> list1=new ArrayList();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(1,30);
        list.add(2,20);
        list1.add(1);
        list1.add(3);
        list1.add(1,2);
        System.out.println(list);
        System.out.println(list1);
    }
}
