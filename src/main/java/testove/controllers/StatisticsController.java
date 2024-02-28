package testove.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testove.repository.ReportRepository;

@RestController
@RequestMapping("/api/statistics")
public class StatisticsController {

    @Autowired
    private ReportRepository reportRepository;



}
