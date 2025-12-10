public class exception_vote_check {

public static void main(String[]args) {
    try{
        voteAge(20);
    }catch(Exception e){
        System.out.println(e);
    }
    try{
        voteAge(19);
    }catch (Exception e){

    }
}
static void voteAge(int age){
    System.out.println("check for vote");
    if(age<18);
    throw new IllegalArgumentException("Aap vote nii de sakte hain...");
}
    }