import java.io.*;
//import java.io.IDException;
//public class file_creation {
//public static void main(String[] args)
void main(){
    //createData();
    readFileData();
    deleteFile();
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
        static void readFileData(){
            try{
                FileReader reader=new FileReader("index.html");
                int ch;
                while((ch=reader.read())!=-1){
                    System.out.println((char)ch);
                }
            }catch (Exception e){
                System.out.println(e);
            }
        }
        static void deleteFile(){
    try{
        File file=new File("index.html");
        if(file.delete()){
            System.out.println("deleteddd");
        }else{
            System.out.println("not deletedd");
        }
    }catch (Exception e){
     System.out.println(e);
    }
        }



