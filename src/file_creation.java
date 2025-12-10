 import java.io.*;
//import java.io.IDException;
//public class file_creation {
    //public static void main(String[] args)
    void main(){
        createData();
        try {
            File file=new File("index.html");
            if(file.createNewFile())
            {
                System.out.println("---done!! file created---");
            }
            else {
                System.out.println("---sorry!! file of this name is already created---");
            }
        } catch (IOException e) {
            //  throw new RuntimeException(e);
            System.out.println(e);
        }
    }
//}
static void createData(){
    try{
        FileWriter writer=new FileWriter("index.html");
        writer.write("hello hii");
        writer.close();
    }catch (Exception e){
        System.out.println(e);
    }
}
