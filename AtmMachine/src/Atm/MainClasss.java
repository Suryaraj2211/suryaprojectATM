package Atm;
import java.util.Scanner;

public class MainClasss {

    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();
        int atmnumber = 12345;
        int atmpin = 123;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine");
        System.out.print("Enter the ATM number: ");
        int enteredAtmNumber = sc.nextInt();

        System.out.print("Enter the PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredAtmNumber == atmnumber && enteredPin == atmpin) {
            while (true) {
                System.out.println("1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();
                if (ch == 1) {
                    op.viewBalance();
                } else if (ch == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                } else if (ch == 3) {
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = sc.nextDouble();
                    op.depositAmount(depositAmount);
                } else if (ch == 4) {
                    op.viewMiniStatement();
                } else if (ch == 5) {
                    System.out.println("Collect Your ATM card\nThank you for using the ATM Machine!!");
                    System.exit(0);
                } else {
                    System.out.println("Please Enter correct Choice");
                }
            }
        } else {
            System.out.println("Incorrect ATM Number or PIN");
            System.exit(0);
        }
    }
}
