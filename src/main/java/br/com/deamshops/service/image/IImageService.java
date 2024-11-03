package br.com.deamshops.service.image;

import br.com.deamshops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IImageService extends JpaRepository<Image, Long> {
}
