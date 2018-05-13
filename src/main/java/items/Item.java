package items;

import sellable.Sellable;

public abstract class Item implements Sellable {

    private String name;
    private String description;
    private double cost;
    private double retail;

    public Item(String name, String description, double cost, double retail) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.retail = retail;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public double getRetail() {
        return retail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setRetail(double retail) {
        this.retail = retail;
    }

    public double calculateMarkup() {
        return retail - cost;
    }
}