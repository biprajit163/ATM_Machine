import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ATM machine do you want to make an account with us?");
        System.out.print("Select (a) to make an account: ");
        String makeAcct = sc.next();

        if(makeAcct.equals("a")) {
            System.out.println("Welcome to the magic bank thank you for making an account with us please enter your name and your balance");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Balance: ");
            int balance = sc.nextInt();

            while(true) {
                System.out.println("Welcome to the ATM Machine, how can we help you today?");
                System.out.println("Choose 1 for withdrawl");
                System.out.println("Choose 2 for Deposit");
                System.out.println("Choose 3 for check balance");
                System.out.println("Choose 0 for Exit");

                int userChoice = sc.nextInt();
                switch(userChoice) {
                    case 0:
                        System.exit(0);
                    case 1:
                        boolean checkWithdrawl = true;

                        while(checkWithdrawl) {
                            System.out.println("How much would you like to withdraw?");
                            System.out.print("Withdraw: ");
                            int withdraw = sc.nextInt();

                            if(balance < withdraw) {
                                System.out.println("You can't withdraw more than what you have in your account");
                            } else {
                                balance -= withdraw;
                                System.out.println("you withdrew "+"$"+withdraw);

                                checkWithdrawl = false;
                            }
                        }

                        break;
                    case 2:
                        System.out.println("How much would you like to deposit?");
                        System.out.print("Deposit: ");
                        int deposit = sc.nextInt();

                        balance += deposit;
                        System.out.println("You deposited "+"$"+deposit);
                        break;
                    case 3:
                        if(balance <= 0) {
                            System.out.println("You have a negative bank balance");
                        } else {
                            System.out.println(name+" your balance is: "+"$"+balance);
                        }

                        break;
                }
            }
        } else {
            System.out.println("Have a good day");
        }
    }
}
