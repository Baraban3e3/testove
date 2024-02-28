package testove.models.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrafficByDate {

    private Date date;
    private Integer browserPageViews;
    private Integer mobileAppPageViews;
    private Integer pageViews;
    private Integer browserSessions;
    private Integer mobileAppSessions;
    private Integer sessions;

}