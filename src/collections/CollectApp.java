package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectApp {
    public static void main(String[] args) {
        List<Goods> list = new ArrayList<>();

        Goods bread = new Goods("Хлеб", 1,5, "02.02.2022");
        Goods milk = new Goods("Молоко", 1, "30.01.2022");
        Goods meat = new Goods("Мясо", 1, "01.02.2022");


    }
}
