package br.com.deamshops.service.product;

import br.com.deamshops.model.Product;
import br.com.deamshops.request.AddProductRequest;
import br.com.deamshops.request.ProductUpdateRequest;

import java.util.List;

public interface ProductInterface {

    Product addProduct(AddProductRequest request);

    Product getProductById(Long id);

    void deleteProductById(Long id);

    Product updateProduct(ProductUpdateRequest product, Long productId);

    List<Product> getAllProducts();

    List<Product> getProductsByCategory(String category);

    List<Product> getProductsByBrand(String brand);

    List<Product> getProductsByCategoryAndBrand(String category, String brand);

    List<Product> getProductsByName(String name);

    List<Product> getProductsByBrandAndName(String brand, String name);

    List<Product> getProductsByCategoryAndName(String category, String name);

    Long countProductsByBrandAndName(String brand, String name);
}
