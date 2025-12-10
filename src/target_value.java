import java.util.*;
public class target_value {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        int a = list.size();
        int m = a / 2;
        int n=m;

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext() && it.nextIndex() <= m) {
            Integer x = it.next();
            System.out.println(n);
        }
        while (it.hasPrevious()) {
            Integer y = it.previous();
            System.out.println(m);
        }
    }
}

