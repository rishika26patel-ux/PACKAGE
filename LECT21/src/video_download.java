//import java.util.*;
class Mydownload extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("download file...."+(i*20)+"%");
            try{
                Thread.sleep(1000);

            }catch (Exception e){

            }
        }
    }

}

public class video_download {
    public static void main(String[]args){
    Mydownload t1=new Mydownload();
    t1.start();
    for(int i=1;i<=20;i++){
        System.out.println("Timer"+ +i);
        try{
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }
    }
}
