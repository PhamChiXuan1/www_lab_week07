package vn.edu.iuh.fit.backend.pks;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.backend.models.Product;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class ProductPricePK implements Serializable {
    private Product product;
    private LocalDateTime price_date_time;
}
