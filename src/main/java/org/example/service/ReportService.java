package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.Report;
import org.example.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ReportService {

    @Autowired
    private ReportRepository reportRepository;

    public void save(long bp){
        Report report =new Report();
        report.setBp(bp);
        try{
            reportRepository.save(report);
        }catch (Exception e){
            log.error("error occured while saving {} ",e.getMessage());
        }
    }

    public Report get(long id){

        try{
           return reportRepository.getById(id);
        }catch (Exception e){
            log.error("error occured while saving {} ",e.getMessage());
        }
        return null;
    }
}
