package java_basic.oop.ex;

public class Account {
    int balance = 0;

    void deposit(int money) {
        balance += money;
        System.out.println("현재 잔액 : " + balance);
    }

    void withdraw(int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println("현재 잔액 : " + balance);
        } else {
            System.out.println("잔액 부족");
            System.out.println("현재 잔액 : " + balance);
        }
    }

    void printBalance() {
        System.out.println("현재 잔액 : " + balance);
    }
}
