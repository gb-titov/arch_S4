package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    private int card;
    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCard() {
        return card;
    }

    public int getBalance() {
        return balance;
    }

    public BankAccount() {
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
