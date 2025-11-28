import java.util.HashSet;

class Set{
public static void  main(String[]args){
    int arr[]={1,2};
    HashSet<Integer>set=new HashSet<>();
    for(int x:arr){
        if(set.contains(x)){
            System.out.println("true");
        }
        set.add(x);
        System.out.println("false");
    }
    set.add(10);
    set.add(10);
    set.add(20);
    set.add(20);
    System.out.println(set);
}
}
