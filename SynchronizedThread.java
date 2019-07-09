package algorithms;

/**
 *
 * @author Gökhan DAĞTEKİN
 *
 * 2016
 */
public class SynchronizedThread {

    private double balance;

    public SynchronizedThread(double balance) {
        this.balance = balance;
    }

    //Delete synchronized and run it
    synchronized public void withdrawMoney(String who, double amount) {
        if (amount > this.balance) {
            System.out.print(who + " account does not have the desired amount of money ");
            System.out.print("Amount of withdrawal: " + amount);
            System.out.println(" Balance " + this.balance);
        } else {
            balance -= amount;
            System.out.println(who + " " + amount + " Withdraw money. Available balance " + this.balance);
        }
        System.out.println();

    }
}

class WithdrawThread extends Thread {

    private SynchronizedThread account;
    private String threadName;
    private double amount;

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        account.withdrawMoney(threadName, this.amount);
    }

    public WithdrawThread(SynchronizedThread account, String threadName, int amount) {
        this.account = account;
        this.threadName = threadName;
        this.amount = amount;
    }
}

class ParaCek {
    public static void main(String[] args) {
        SynchronizedThread account = new SynchronizedThread(1000);
        WithdrawThread t1 = new WithdrawThread(account, "thread 1", 600);
        WithdrawThread t2 = new WithdrawThread(account, "thread 2", 600);
        WithdrawThread t3 = new WithdrawThread(account, "thread 3", 300);
        t1.start();
        t2.start();
        t3.start();
    }
}
