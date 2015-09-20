package pl.allegro.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by oem1 on 2015-09-16.
 */
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String street;
    private Integer number;
    private  String city;

    public Address(long id, String street, Integer number, String city) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
    }

    protected Address(){

    }
}
