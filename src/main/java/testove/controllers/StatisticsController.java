package testove.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import testove.models.Report;
import testove.repository.ReportRepository;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/statistics")
public class StatisticsController {

    @Autowired
    private ReportRepository reportRepository;

    // 3) Вивід статистики по вказаній даті (або проміжку дат)
    @GetMapping("/by-date")
    public List<Report> getReportsByDate(@RequestParam Date startDate, @RequestParam Date endDate) {
        return reportRepository.findByDateBetween(startDate, endDate);
    }

    // 4) Вивід статистики по вказаному ASIN (або списку ASINs)
    @GetMapping("/by-asin")
    public List<Report> getReportsByAsin(@RequestParam List<String> asins) {
        return reportRepository.findByAsinIn(asins);
    }

    // 5) Вивід сумарної статистика по всім датам
    @GetMapping("/summary")
    public Report getSummaryReport() {
        return reportRepository.findSummaryReport();
    }

    // 6) Вивід сумарної статистики по всім ASIN
    @GetMapping("/summary/by-asin")
    public List<Report> getSummaryReportsByAsin() {
        return reportRepository.findSummaryReportsByAsin();
    }

}
