import java.util.Scanner;

class BankAccount {

    String name;
    String userName;
    String password;
    String accountNo;
    float balance = 0.0f;
    int transactions = 0;
    String transactionHistory = "";

    public boolean login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Username : ");
        String enteredUsername = sc.nextLine();

        if (enteredUsername.equals(userName)) {
            System.out.println("Enter Your Password : ");
            String enteredPassword = sc.nextLine();

            if (enteredPassword.equals(password)) {
                System.out.println("Login successful...");
                return true;
            } else {
                System.out.println("Incorrect Password!! \n Please Enter Correct Password and Try Again ");
            }
        } else {
            System.out.println("Username not found !!");
        }

        return false;
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw : ");
        float amount = sc.nextFloat();

        if (amount <= 0) {
            System.out.println("Invalid amount entered.");
            return;
        }

        if (balance >= amount) {
            transactions++;
            balance -= amount;
            System.out.println("\nWithdraw Successful....");
            String str = amount + " Rs Withdrawn\n";
            transactionHistory = transactionHistory.concat(str);
        } else {
            System.out.println("\nInsufficient Balance");
        }
    }

    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Your Name : ");
        this.name = sc.nextLine();
        System.out.print("\nEnter Your Username : ");
        this.userName = sc.nextLine();
        System.out.print("\nEnter Your Password : ");
        this.password = sc.nextLine();
        System.out.print("\nEnter Your Account Number : ");
        this.accountNo = sc.nextLine();
        System.out.println("\nRegistration completed..kindly login");
    }

    public void transfer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Recipient's Name : ");
        String recipient = sc.nextLine();
        System.out.print("\nEnter amount to transfer : ");
        float amount = sc.nextFloat();

        if (amount <= 0) {
            System.out.println("Invalid amount entered.");
            return;
        }

        if (balance >= amount) {
            if (amount <= 80000f) {
                transactions++;
                balance -= amount;
                System.out.println("\nSuccessfully Transferred to " + recipient);
                String str = amount + " Rs transferred to " + recipient + "\n";
                transactionHistory = transactionHistory.concat(str);
            } else {
                System.out.println("\nSorry...Limit is 80000.00");
            }
        } else {
            System.out.println("\nInsufficient Balance");
        }
    }

    public void checkBalance() {
        System.out.println("\nBalance: " + balance + " Rs");
    }

    public void transHistory() {
        if (transactions == 0) {
            System.out.println("\nEmpty");
        } else {
            System.out.println("\nTransaction History:\n" + transactionHistory);
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter amount to deposit : ");
        float amount = sc.nextFloat();

        if (amount <= 0) {
            System.out.println("Invalid amount entered.");
            return;
        }

        if (amount <= 200000f) {
            transactions++;
            balance += amount;
            System.out.println("\nSuccessfully Deposited...");
            String str = amount + " Rs deposited\n";
            transactionHistory = transactionHistory.concat(str);
        } else {
            System.out.println("\nSorry...Limit is 200000.00");
        }
    }
}

public class AtmInterface {

    public static int takeIntegerInput(int limit) {
        int input = 0;
        boolean flag = false;

        while (!flag) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                flag = true;

                if (flag && (input > limit || input < 1)) {
                    System.out.println("Choose a number between 1 and " + limit);
                    flag = false;
                }
            } catch (Exception e) {
                System.out.println("Enter only an integer value");
                flag = false;
            }
        }

        return input;
    }

    public static void main(String[] args) {
        System.out.println("\nWELCOME TO ATM SYSTEM\n");
        System.out.println("1. Register");
        System.out.println("2. Quit");
        System.out.print("Enter Your Choice : ");
        int choice = takeIntegerInput(2);

        if (choice == 1) {
            BankAccount b = new BankAccount();
            b.register();
            while (true) {
                System.out.println("\n1. Login\n2. Quit");
                System.out.print("Enter Your Choice : ");
                int n = takeIntegerInput(2);
                if (n == 1) {
                    if (b.login()) {
                        System.out.println("\n\nWELCOME BACK " + b.name + "\n");
                        boolean isFinished = false;
                        while (!isFinished) {
                            System.out.println(
                                    "\n1. Withdraw\n2. Deposit\n3. Transfer\n4. Check Balance\n5. Transaction History\n6. Exit");
                            System.out.print("\nEnter Your Choice : ");
                            int c = takeIntegerInput(6);
                            switch (c) {
                                case 1:
                                    b.withdraw();
                                    break;
                                case 2:
                                    b.deposit();
                                    break;
                                case 3:
                                    b.transfer();
                                    break;
                                case 4:
                                    b.checkBalance();
                                    break;
                                case 5:
                                    b.transHistory();
                                    break;
                                case 6:
                                    isFinished = true;
                                    break;
                            }
                        }
                    }
                } else {
                    System.exit(0);
                }
            }
        } else {
            System.exit(0);
        }
    }
}

