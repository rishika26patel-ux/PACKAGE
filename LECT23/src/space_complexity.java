import java.util.HashMap;

//
//public class space_complexity {
//    public static void main(String[]args){
//
//    }
//}
//int main(){
//    majority_element (1,2,3,4,2,2,3,3,3,4,4);
//}

public int majority_element (int[]nums){
    HashMap<Integer, Integer> map=new HashMap<>();
   for (int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
        if (map.get(i)>nums.length/2){
            return 1;
        }
    }
    return -1;
}