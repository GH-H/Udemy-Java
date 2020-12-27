package Section8.AutoBox;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("BOA");
        bank.addBranch("1");
        bank.addCustomer("1","james",100);
        bank.addTransaction("1","james",100);
    }
}
