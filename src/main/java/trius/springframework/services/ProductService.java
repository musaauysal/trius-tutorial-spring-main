package trius.springframework.services;

import org.springframework.stereotype.Service;
import trius.springframework.commands.ProductForm;
import trius.springframework.domain.Product;

import java.util.List;

/**
 * Created by jt on 1/10/17.
 */
@Service
public interface ProductService {

    List<Product> listAll();

    Product getById(String id);

    Product saveOrUpdate(Product product);

    void delete(String id);

    Product saveOrUpdateProductForm(ProductForm productForm);
}
