package testove.models.data;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesAndTrafficByDate {

    private Date date;
    private Integer sales;
    private Integer traffic;

}