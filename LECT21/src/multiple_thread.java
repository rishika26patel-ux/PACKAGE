class MyThread extends Thread{
    public void run(){
        System.out.println("rishi");
        //System.out.println(Thread.currentThread().getName());
        for(int i=0; i<5;i++){
            System.out.println(i+"t1");
        }
    }
}
public class multiple_thread {
    public static void main(String[]args){
        System.out.println(Thread.currentThread().getName());
        MyThread t1=new MyThread();
        t1.start();
        for(int i=0; i<5;i++){
            System.out.println(i+"main");
        }
    }
}
