import sellable.Sellable;

import java.util.ArrayList;

public class Store {

    private String name;
    private ArrayList<Sellable> stock;
    private ArrayList<Sellable> sold;
    private Double money;

    public Store(String name){
        this.name = name;
        this.stock = new ArrayList();
        this.sold = new ArrayList<>();
        this.money = 0.0;
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

    public Double hasCash(){
        return money;
    }

    public void canAddToCash(Double total){
        this.money += total;
    }

    public Double canReduceCash(Double total){
        if (money > total){
            this.money -= total;
            return total;
        }
        return null;
    }

}
