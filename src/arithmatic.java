public class arithmatic {
    public static void main(String[]args){
        try{
            riskyMethod();
        }catch (Exception e){
            System.out.println("me handle hua:"+e);
        }
        System.out.println("program continue..");
    }
    static void riskyMethod() throws ArithmeticException{
        System.out.println("riskyMethod start");
        int result =10/0;
        System.out.println("Result:"+result);
        System.out.println("riskyMethod end");
    }
}
