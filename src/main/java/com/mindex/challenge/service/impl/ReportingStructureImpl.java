package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.ReportingRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.data.ReportingStructure;
import com.mindex.challenge.service.ReportingService;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class ReportingStructureImpl implements ReportingService {
    private static final Logger LOG = LoggerFactory.getLogger(ReportingStructureImpl.class);

    @Autowired
    private ReportingRepository reportingRepository;

    /*
     * This is a meethod to report the integer value for the
     * employee. It checks to make sure a valid employee is
     * given. Then if the employee is valid it should return
     * the count of the reports thet the desired employee has.
     * I think I passed in everything properly, but I am
     * struggling with the actual implementation.
     */
    public ReportingStructure report(Employee employee) {

    if(employee == null) {
        throw new RuntimeException("There is no employee with an ID number of:" +employee.getEmployeeId());
    }
    //
    else {
        LOG.debug("Reporting on Employee with id {()}", employee.getEmployeeId());
        return employee.getDirectReports()[];
        }
    }
}
