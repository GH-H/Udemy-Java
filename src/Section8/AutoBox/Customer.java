package Section8.AutoBox;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions ;

    public Customer(String name, double initialValue) {
        this.name = name;
        transactions = new ArrayList<Double>();
        transactions.add(initialValue);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
