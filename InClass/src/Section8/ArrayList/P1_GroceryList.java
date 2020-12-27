package Section8.ArrayList;

import java.util.ArrayList;

public class P1_GroceryList {
    private ArrayList<String> groceryList= new ArrayList<String>();
    public void addItem(String item){
        groceryList.add(item);
        for(int i=0;i<groceryList.size();i++){
            System.out.println(groceryList.get(i));
        }
    }

    public void modify(int position,String item){
        groceryList.set(position, item);
    }

    public void remove(int position){
        groceryList.get(position);
        groceryList.remove(position);
    }

    public String find(String item){
        boolean exist = groceryList.contains(item);
        int index = groceryList.indexOf(item);
        if(index >= 0){
            return groceryList.get(index);
        }
        return null;
    }

    public ArrayList<String> get(){
        return groceryList;
    }
}
