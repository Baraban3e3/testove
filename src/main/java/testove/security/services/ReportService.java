package testove.security.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testove.models.Report;
import testove.repository.ReportRepository;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public void updateStatistics() {
        // Зчитати дані з файлу
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Report> reports = mapper.readValue(new File("C:\\Users\\g1293\\Downloads\\test_report.json"), List.class);

            // Оновити дані в БД
            for (Report report : reports) {
                Report existingReport = (Report) reportRepository.findByAsinIn(Collections.singletonList(report.getAsin()));
                if (existingReport != null) {
                    existingReport.setDate(report.getDate());
                    existingReport.setSalesByDate(report.getSalesByDate());
                    existingReport.setTrafficByDate(report.getTrafficByDate());
                    reportRepository.save(existingReport);
                } else {
                    reportRepository.save(report);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
