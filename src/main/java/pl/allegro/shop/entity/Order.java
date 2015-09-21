package pl.allegro.shop.entity;

import pl.allegro.shop.domain.*;
import pl.allegro.shop.entity.Address;
import pl.allegro.shop.entity.Customer;
import pl.allegro.shop.entity.OrderLine;

import javax.persistence.*;
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
    //private final List<OrderLine> orderLines = new ArrayList<OrderLine>();
   // private final Customer customer;
    @OneToOne
    private Address shippingAddress;
    //private Price totalAmount;
}
