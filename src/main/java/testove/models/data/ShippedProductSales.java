package testove.models.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShippedProductSales {

    private Integer unitsShipped;
    private Integer ordersShipped;

}
