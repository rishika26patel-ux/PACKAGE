import java.io.*;
public class file_creation {
    public static void main(String[] args)
    {
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
}