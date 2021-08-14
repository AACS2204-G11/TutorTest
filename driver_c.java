package src.p6;

import java.util.Scanner;

public class driver_c {
    public static void main(String[] args) {
        Current c1 = new Current("12345",100);

        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        while (userInput !=4){
            System.out.println("1.Print Balance");
            System.out.println("2.Withdraw");
            System.out.println("3.Deposit");
            System.out.println("4.Exit");
            userInput = scanner.nextInt();
            switch (userInput){
                case 1:
                    System.out.println(c1);
                    break;
                case 2:
                    System.out.print("Amount to withdraw:");
                    double amt = scanner.nextDouble();
                    c1.withdrawal(amt);
                    System.out.println(c1);
                    break;
                case 3:
                    System.out.print("Amount to Deposit:");
                    double amtDeposit = scanner.nextDouble();
                    c1.deposit(amtDeposit);
                    System.out.println(c1);
                    break;

            }
        }

    }
}
