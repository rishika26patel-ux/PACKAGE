class Bank{
    int balance=100;
    synchronized void withdraw(int amt){
        System.out.println(Thread.currentThread().getName()+"checking balance");
        if(balance>=amt){
            System.out.println(Thread.currentThread().getName()+"proceed withdraw");
            balance
        }
    }
}


public class checking_balance {
}
