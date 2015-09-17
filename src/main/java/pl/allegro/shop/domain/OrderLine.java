package pl.allegro.shop.domain;

/**
 * Created by oem1 on 2015-09-15.
 */
public class OrderLine {
    private final String productId;
    private final String productName;
    private final Price itemPrice;
    private final Price totalPrice;
    private final int amount;

    public OrderLine(Product product, int amount) {
        this.productId = product.getId();
        this.productName = product.getName();
        this.itemPrice = product.getPrice();
        this.totalPrice = itemPrice.multiply(amount);
        this.amount = amount;
    }

    public int getTotalPrice() {
        return totalPrice.getPrice();
    }
}
