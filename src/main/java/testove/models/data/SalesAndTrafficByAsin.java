package testove.models.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesAndTrafficByAsin {

    private String asin;
    private Integer sales;
    private Integer traffic;

}

