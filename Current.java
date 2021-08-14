package src.p6;

import java.util.Objects;

public class Current extends Account{
    private static int freeTransaction = 3;
    private static double transactionFee = 2.00;

    public int getTransactionCount() {
        return transactionCount;
    }

    public void setTransactionCount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    private  int transactionCount;
    public static int getFreeTransaction() {
        return freeTransaction;
    }

    public static void setFreeTransaction(int freeTransaction) {
        Current.freeTransaction = freeTransaction;
    }

    public static double getTransactionFee() {
        return transactionFee;
    }

    public static void setTransactionFee(double transactionFee) {
        Current.transactionFee = transactionFee;
    }



    public Current(String accountNo, double balance) {
        super(accountNo, balance);
        this.transactionCount = 0;

    }

    private void checkTransaction(){
        this.transactionCount++;
        if(this.transactionCount > Current.getFreeTransaction()){
            this.setBalance(this.getBalance() - Current.getTransactionFee());
        }
    }
    @Override
    public void deposit(double amt) {
        this.checkTransaction();

        super.deposit(amt);
    }

    @Override
    public void withdrawal(double amt) {
        this.checkTransaction();

        super.withdrawal(amt);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo='" + super.getAccountNo() + '\'' +
                ", balance=" + this.getBalance() +
                ", date=" + this.getDate() +
                ", Transaction Count=" + this.getTransactionCount() +
                ", Free Transaction Count=" + (Current.getFreeTransaction() - this.getTransactionCount()) +
                '}';
    }


}
