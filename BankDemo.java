import java.util.Scanner;

class Account {
    String name, type;
    int accNo;
    double balance;

    Account(String n, int a, String t, double b) {
        name = n;
        accNo = a;
        type = t;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: ₹" + amt);
    }

    void display() {
        System.out.println("\nName: " + name + "\nAcc No: " + accNo + "\nType: " + type + "\nBalance: ₹" + balance);
    }
}

class SavAcct extends Account {
    SavAcct(String n, int a, double b) { super(n, a, "Savings", b); }

    void interest() {
        double i = balance * 0.05; // 5% interest
        balance += i;
        System.out.println("Interest added: ₹" + i);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: ₹" + amt);
        } else System.out.println("Insufficient balance!");
    }
}

class CurAcct extends Account {
    CurAcct(String n, int a, double b) { super(n, a, "Current", b); }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            if (balance < 1000) {
                balance -= 100;
                System.out.println("Penalty of ₹100 imposed (balance below ₹1000).");
            }
            System.out.println("Withdrawn: ₹" + amt);
        } else System.out.println("Insufficient balance!");
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: "); String name = sc.nextLine();
        System.out.print("Enter acc no: "); int acc = sc.nextInt();
        System.out.print("Type (savings/current): "); String type = sc.next().toLowerCase();
        System.out.print("Enter initial balance: "); double bal = sc.nextDouble();

        if (type.equals("savings")) {
            SavAcct s = new SavAcct(name, acc, bal);
            s.deposit(1000);
            s.interest();
            s.withdraw(500);
            s.display();
        } else {
            CurAcct c = new CurAcct(name, acc, bal);
            c.deposit(2000);
            c.withdraw(2500);
            c.display();
        }
        sc.close();
    }
}
