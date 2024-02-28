package testove.models.data;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesByDate {

    private Date date;
    private Integer unitsOrdered;
    private Integer totalOrderItems;
    private Double averageSalesPerOrderItem;
    private Double averageUnitsPerOrderItem;
    private Double averageSellingPrice;
    private Integer unitsRefunded;
    private Double refundRate;
    private Integer claimsGranted;
    private Double claimsAmount;

}
