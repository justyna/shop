package pl.allegro.shop.dao;

import org.springframework.data.repository.CrudRepository;
import pl.allegro.shop.entity.OrderLine;

/**
 * Created by oem1 on 2015-09-19.
 */
public interface OrderLineDao extends CrudRepository<OrderLine, Long> {
}
