package pl.allegro.shop.entity;

import pl.allegro.shop.domain.*;
import pl.allegro.shop.domain.Address;
import pl.allegro.shop.domain.Customer;
import pl.allegro.shop.entity.OrderLine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by oem1 on 2015-09-16.
 */
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private final List<OrderLine> orderLines = new ArrayList<OrderLine>();
    private final Customer customer;
    private Address shippingAddress;
    private Price totalAmount;
}
