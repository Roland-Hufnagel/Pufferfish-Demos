package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        ProductRepo productRepo = new ProductRepo();
        List<Product> products = productRepo.getAllProducts();
        List<Product> newList = new ArrayList<>();
        for (Product p : products) {
            if (p.brand().equals("Apple")) {
                if (p.price() > 1200) {
                    newList.add(p);
                }
            }
        }

/*        for (Product p : newList) {
            System.out.println(p.name() + " " + p.price());
        }*/
        // --------------------- Stream API:
        // Immer drei Schritte: 1. Stream erstellen, 2. Intermediäre Funktionen, 3. Terminator
        List<Product> products2 = productRepo.getAllProducts();
        List<String> result = products2.stream()
                .filter(Product::priceAbove100)
                .filter(p -> p.brand().equals("Apple"))
                //.map(Product::name)
                .map(Product::name)
                .distinct()
                .sorted()
                .limit(3)
                .toList();
        for (String s : result) {
            System.out.println(s);
        }
    }
}