package pl.allegro.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import pl.allegro.shop.dao.AddressDao;
import pl.allegro.shop.dao.CustomerDao;

/**
 * Created by oem1 on 2015-09-16.
 */

@EnableAutoConfiguration
public class App implements CommandLineRunner {
    @Autowired
    CustomerDao customerDao;
    @Autowired
    AddressDao addressDao;

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
