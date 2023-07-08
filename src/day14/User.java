package day14;

public class User {

    private int sales;

    private String name;

    private double bonus;

    public User(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "User{" +
                "sales=" + sales +
                ", name='" + name + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}

