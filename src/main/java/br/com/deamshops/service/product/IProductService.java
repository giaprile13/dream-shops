package br.com.deamshops.service.product;

import br.com.deamshops.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductService extends JpaRepository<Product, Long> {
}
