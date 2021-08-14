package src.p6;

public class Saving extends Account{
    private static double interestRate = 0.01;
    public Saving(String accountNo, double balance) {
        super(accountNo, balance);
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Saving.interestRate = interestRate;
    }
    public double calculateInterest(){
        return this.getBalance()*Saving.interestRate;
    }
    public void addInterest(){
        this.setBalance(this.getBalance() + this.calculateInterest());
    }

}
