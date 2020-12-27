package Section8.AutoBox;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean addCustomer(String branchName,String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(findBranch(branchName) == null){
            branch.newCustomer(customerName,initialAmount);
            return true;
        }

        return false;
    }

    public boolean addTransaction(String branchName,String customerName,double amount){
        Branch branch = findBranch(branchName);
        if(findBranch(branchName) == null){
            branch.addTransaction(customerName,amount);
            return true;
        }

        return false;
    }

    public Branch findBranch(String name){
        for(int i=0; i < branches.size();i++){
            Branch check = branches.get(i);
            if(check.getName().equals(name)){
                return check;
            }
        }
        return null;
    }
}
