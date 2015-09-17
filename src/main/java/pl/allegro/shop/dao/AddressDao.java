package pl.allegro.shop.dao;

import org.springframework.data.repository.CrudRepository;
import pl.allegro.shop.entity.Address;

/**
 * Created by oem1 on 2015-09-17.
 */
public interface AddressDao extends CrudRepository<Address, Long> {
}
