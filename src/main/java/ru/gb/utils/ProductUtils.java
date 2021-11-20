package ru.gb.utils;

import ru.gb.dto.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProductUtils {
    public static List<Product> generateList(int count) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            products.add(Product.builder()
                    .id((long) i)
                    .title("Title" + i)
                    .cost(new Random().nextDouble())
                    .build());
        }
        return products;
    }
}
