package collections;

import java.util.ArrayList;
import java.util.List;

public interface CollectApp {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();

        Goods bread = new Goods("Хлеб", 0.4, "02.02.2022");
        Goods milk = new Goods("Молоко", 0.9, "30.01.2022");
        Goods meat = new Goods("Мясо", 1, "01.02.2022");

        list.add(bread);
        list.add(milk);
        list.add(meat);

        System.out.println(list);
    }
}
