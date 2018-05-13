import sellable.Sellable;

import java.util.ArrayList;

public class Store {

    private String name;
    private ArrayList<Sellable> stock;

    public Store(String name){
        this.name = name;
        stock = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
}