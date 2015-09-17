package pl.allegro.shop.entity;

import pl.allegro.shop.domain.Price;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by oem1 on 2015-09-16.
 */
@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private final String productId;
    private final String productName;
    private final Price itemPrice;
    private final Price totalPrice;
    private final int amount;
}
