package testove.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import testove.models.Report;

import java.util.Date;
import java.util.List;

public interface ReportRepository extends MongoRepository<Report, String> {

    List<Report> findByDateBetween(Date startDate, Date endDate);

    List<Report> findByAsinIn(List<String> asins);

    Report findSummaryReport();

    List<Report> findSummaryReportsByAsin();

}
