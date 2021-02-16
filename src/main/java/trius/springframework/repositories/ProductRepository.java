package trius.springframework.repositories;

import org.springframework.stereotype.Repository;

import trius.springframework.domain.Product;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface ProductRepository extends CrudRepository<Product, String> {
}
