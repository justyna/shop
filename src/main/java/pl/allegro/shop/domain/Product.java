package pl.allegro.shop.domain;

import pl.allegro.shop.domain.Price;

/**
 * Created by oem1 on 2015-09-15.
 */
public class Product {
    private String id;
    private String name;
    private Price price;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Price getPrice() {
        return price;
    }
}
