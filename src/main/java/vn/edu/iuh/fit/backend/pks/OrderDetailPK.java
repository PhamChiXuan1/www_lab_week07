package vn.edu.iuh.fit.backend.pks;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.backend.models.Order;
import vn.edu.iuh.fit.backend.models.Product;

import java.io.Serializable;
@Getter
@Setter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
