package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.PatientDetails;
import org.example.entity.Report;
import org.example.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public void save(PatientDetails patientDetails) {

        try {
            patientRepository.save(patientDetails);
            log.info("patient details saved successfully");
        } catch (Exception e) {
            log.error("error occured while saving {} ", e.getMessage());
        }
    }

    public PatientDetails get(long id) {

        try {
            log.info("fetching details for id {}",id);
            return patientRepository.getById(id);
        } catch (Exception e) {
            log.error("error occured while saving {} ", e.getMessage());
        }
        return null;
    }

    public void delete(long id) {
        try {
            log.info("deleting details for id {}",id);
             patientRepository.deleteById(id);
        } catch (Exception e) {
            log.error("error occured while deleting {} ", e.getMessage());
        }
    }
}
