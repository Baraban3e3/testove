package testove.repository.impl;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import org.springframework.stereotype.Component;
import testove.models.Report;
import testove.repository.ReportRepository;

import java.util.Date;
import java.util.List;

@Component
public abstract class ReportRepositoryImpl implements ReportRepository {

    private final MongoTemplate mongoTemplate;

    public ReportRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Report> findByDateBetween(Date startDate, Date endDate) {
        Query query = new Query();
        query.addCriteria(Criteria.where("date").gte(startDate).lte(endDate));
        return mongoTemplate.find(query, Report.class);
    }

    // ...

    @Override
    public Report findSummaryReport() {
        Query query = new Query();
        query.addCriteria(Criteria.where("date").exists(true));
        return mongoTemplate.findOne(query, Report.class);
    }

    @Override
    public List<Report> findSummaryReportsByAsin() {
        Query query = new Query();
        query.addCriteria(Criteria.where("asin").exists(true));
        return mongoTemplate.find(query, Report.class);
    }

}
