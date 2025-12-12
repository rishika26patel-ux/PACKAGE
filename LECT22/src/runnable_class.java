class thread implements Runnable{
    public void run(){
        System.out.println("rishika");
    }
}
public class runnable_class {
    public static void main(String[]args){
        thread task= new thread();
        Thread t1= new Thread(task);
        Thread t2=new Thread(task);
        t1.start();
        t2.start();
    }
}
