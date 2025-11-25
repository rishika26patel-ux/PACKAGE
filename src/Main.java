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
        //list.add(15);
        list.add(1,30);
        list.add(2,20);
        list1.add(1);
        list1.add(3);
        list1.add(1,2);
        //Access Elements
       // int first =list.get(1);
        //int last=list.get(list.size()-1);
       //list.set(2,99);//Update value
        //list.remove(0);//remove index value
        //list.remove(Integer.valueOf(15));//remove select number
        //boolean exist =list.contains(30); //Search operation
        //int idx1 =list.indexOf(20);
        //int idx2 =list.lastIndexOf(15);
        //SIZE&EMPTY
       // int size =list.size();
        //boolean isEmpyty=list.isEmpty();
        //for(int i=0;i<list.size();i++);
        //System.out.println(list.get(2));
        //ENHANCE FOR LOOP
        for(int num:list){
            System.out.println(num);
        }
        //System.out.println();
    }
}
