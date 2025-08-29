package com.krub.hosp_manager.repository;

import com.krub.hosp_manager.enums.EmployeeStatus;
import com.krub.hosp_manager.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByDateOfBirthBetween(LocalDate start, LocalDate end);
    List<Patient> findByAdmittedBy_Department(String department);
    List<Patient> findByAdmittedBy_Status(EmployeeStatus status);
}