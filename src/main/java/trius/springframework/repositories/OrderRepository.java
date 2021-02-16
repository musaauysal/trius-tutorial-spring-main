package trius.springframework.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import trius.springframework.domain.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {
}
