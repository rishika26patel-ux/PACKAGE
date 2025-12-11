class pausethread extends Thread{
    public void run(){
        System.out.println("rishiii!!");
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<5;i++){
            System.out.println(i+"t1");
        }
    }
}
public class pause_thread {
    public static void main(String[]args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.setName("anshuu!");//Namechange
        t1.start();

        try{
        t1.join();
        }catch (Exception e){
        }
        for(int i=0; i<5;i++){
            System.out.println(i+"tannnu!!");
        }
    }
}

