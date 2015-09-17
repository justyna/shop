package pl.allegro.shop.domain;

/**
 * Created by oem1 on 2015-09-15.
 */
public class Price {


    private int price = 0;


    public Price(int price) {
        this.price = price;
    }

    public Price multiply(int amount) {
        return new Price(price * amount);
    }

    public Price add(int amount){
        return new Price(price + amount);
    }
    public int getPrice() {
        return price;
    }

}
