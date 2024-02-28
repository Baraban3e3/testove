package testove.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import testove.models.Report;

import java.util.List;

public interface ReportRepository extends MongoRepository<Report, String> {

    List<Report> findByAsin(String asin);

}
