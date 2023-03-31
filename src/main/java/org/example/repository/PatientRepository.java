package org.example.repository;

import org.example.entity.PatientDetails;
import org.example.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<PatientDetails, Long> {
}
