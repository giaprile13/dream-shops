package br.com.deamshops.service.category;

import br.com.deamshops.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryService extends JpaRepository<Category, Long> {
}
