package testove.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import testove.models.data.*;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {

    @Id
    private String id;

    private Date date;
    private String asin;

    // Sales and Traffic Data
    private List<SalesAndTrafficByDate> salesAndTrafficByDate;
    private List<SalesAndTrafficByAsin> salesAndTrafficByAsin;

    // Sales Data
    private List<SalesByDate> salesByDate;
    private List<ShippedProductSales> shippedProductSales;

    // Traffic Data
    private List<TrafficByDate> trafficByDate;

    // Other Data
    private Double buyBoxPercentage;
    private Double orderItemSessionPercentage;
    private Double unitSessionPercentage;
    private Integer averageOfferCount;
    private Integer averageParentItems;
    private Integer feedbackReceived;
    private Integer negativeFeedbackReceived;
    private Double receivedNegativeFeedbackRate;
    private String parentAsin;


}
