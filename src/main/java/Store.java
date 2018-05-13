import sellable.Sellable;

import java.util.ArrayList;

public class Store {

    private String name;
    private ArrayList<Sellable> stock;
    private ArrayList<Sellable> sold;

    public Store(String name){
        this.name = name;
        stock = new ArrayList<>();
        sold = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int stockCount(){
        return stock.size();
    }

    public void addStock(Sellable item){
        stock.add(item);
    }

    public void removeStock(Sellable item){
        stock.remove(item);
    }

    public Double calculateProfit(){
        Double profit = 0.0;
        for (Sellable item : stock) {
            profit += item.calculateMarkup();
        }
        return profit;
    }

    public Double calculateTotalProfit(){
        Double profit = 0.0;
        for (Sellable item : sold) {
            profit += item.calculateMarkup();
        }
        return profit;
    }

    public int soldCount(){
        return sold.size();
    }

    public void sellItem(Sellable item){
        stock.remove(item);
        sold.add(item);
    }
}
