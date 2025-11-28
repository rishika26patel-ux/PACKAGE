import java.util.HashSet;

public class intersectionarray {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int arr1[]={2,4,6,8,9};
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();
        for(int x:arr){
            set1.add(x);
        }
        for(int y:arr){
            if(set1.contains(y)){
                result.add(y);
                System.out.println(y);
            }
        }
    }
}
