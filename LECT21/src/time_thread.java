class timethread extends  Thread{
    public void run(){
        System.out.println("rishiii!!");
        System.out.println(Thread.currentThread().getName());
        for(int i=0; i<20;i++){
            System.out.println(i+"t1");
            try{
                Thread.sleep(2000);

            }catch (Exception e){

            }
        }
    }
}
public class time_thread {
    public static void main(String[]args) {
        System.out.println(Thread.currentThread().getName());
        MyThread t1 = new MyThread();
        t1.setName("anshuu!");//Namechange
        t1.start();

        try{
            t1.join();
        }catch (Exception e){
        }
        for(int i=0; i<20;i++){
            System.out.println(i+"tannnu!!");
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }
}


