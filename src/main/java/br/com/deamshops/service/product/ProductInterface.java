package br.com.deamshops.service.product;

import br.com.deamshops.model.Category;
import br.com.deamshops.model.Product;

import java.util.List;

public interface ProductInterface {

    Product getProductById(Long id);

    void deleteProductById(Long id);

    void updateProduct(Product product, Long productId);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(Category category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(Category category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByBrandAndName(String brand, String name);

    List<Product> getProductsByCategoryAndName(Category category, String name);

    Long countProductsByBrandAndName(String brand, String name);
}
