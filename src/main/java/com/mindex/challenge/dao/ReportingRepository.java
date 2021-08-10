package com.mindex.challenge.dao;

import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.ReportingService;
import org.springframework.data.mongodb.repository.MongoRepository;

/*
 *Interface that extends the Mogo Repository when the Reporting task
 * is called.
 */
public interface ReportingRepository extends MongoRepository<Employee, String> {
    ReportingService reportingService(String employeeId);
}
