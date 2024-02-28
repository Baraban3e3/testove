package testove.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import testove.security.services.ReportService;

@Configuration
@EnableScheduling
public class SchedulingConfig {

    @Autowired
    private ReportService reportService;

    @Scheduled(cron = "0 0/10 * * * ?")
    public void updateStatistics() {
        reportService.updateStatistics();
    }

}