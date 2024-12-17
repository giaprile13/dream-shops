package br.com.deamshops.request;

import br.com.deamshops.model.Category;

import java.math.BigDecimal;

public record AddProductRequest(Long id, String name, String brand, String description, int inventory, BigDecimal price,
                                Category category) {
}
