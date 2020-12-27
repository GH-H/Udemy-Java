package Section8.AutoBox;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String Name, double initialAmount){
        if(find(name) == null){
            customers.add(new Customer(name,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String name,double amount){
        Customer exist = find(name);
        if(exist != null){
            exist.getTransactions().add(amount);
            return true;
        }
        return false;
    }

    public Customer find(String name){
        for(int i=0; i < customers.size();i++){
            Customer check = customers.get(i);
            if(check.getName().equals(name)){
                return check;
            }
        }
        return null;
    }
}
