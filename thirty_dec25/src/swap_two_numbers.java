public class swap_two_numbers {
    public static void main(String args[]){
        int m=10;
        int n=20;

        System.out.println("before swapping: m="+m+",n="+n);

        int temp=m;
        m=n;
        n=temp;

        System.out.println("after swapping: m="+m+",n="+n);
    }
}
