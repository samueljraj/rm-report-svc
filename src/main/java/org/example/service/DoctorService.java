package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.entity.DoctorDetails;
import org.example.entity.PatientDetails;
import org.example.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public void save(DoctorDetails doctorDetails){

        try{
            doctorRepository.save(doctorDetails);
            log.info("doctor details saved successfully");
        } catch (Exception e) {
            log.error("error occured while saving {} ", e.getMessage());

        }
    }


}
