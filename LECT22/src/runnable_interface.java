class thread1 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
            }catch (Exception e){

            }
        }
        //System.out.println("rishika");
    }
}
public class runnable_interface {
    public static void main(String[]args){
        thread1 task= new thread1();
        Thread t1= new Thread(task);
        Thread t2=new Thread(task);
        t1.start();
        t2.start();
    }
}

