package pl.allegro.shop.dao;

import org.springframework.data.repository.CrudRepository;
import pl.allegro.shop.entity.Order;

/**
 * Created by oem1 on 2015-09-19.
 */
public interface OrderDao extends CrudRepository<Order, Long> {
}
