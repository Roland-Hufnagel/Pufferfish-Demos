package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P1", "P1", 100.00);
        Product p2 = new Product("P2", "P2", 200.00);
        p2 = p2.withOnStock(true);
/*
        System.out.println(p1.isFree());
        System.out.println(p2);
        System.out.println(p1.equals(p2));*/

        // BigDecimal:

        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("3.0");
        BigDecimal result = b1.divide(b2, 5, RoundingMode.HALF_UP);
        //result.setScale(5, RoundingMode.HALF_UP);
        //System.out.println(result);
        BigDecimal c1 = new BigDecimal("2.0");
        BigDecimal c2 = new BigDecimal("2.000");
        c2 = c2.add(c1);
        System.out.println(p1);
        System.out.println(p2);
    }
}
