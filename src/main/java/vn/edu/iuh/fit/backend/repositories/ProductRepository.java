package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backend.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
