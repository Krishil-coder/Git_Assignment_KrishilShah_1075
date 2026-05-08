package com.example.hospital.repository;

import com.example.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    // Custom Finder Method
    List<Patient> findByName(String name);

    // JPQL
    @Query("select p from Patient p where p.name = :n")
    List<Patient> findPatientByName(@Param("n") String name);

    // Native Query
    @Query(value = "select * from patient where patient_name = :n", nativeQuery = true)
    List<Patient> findPatByName(@Param("n") String name);

    List<Patient> findByDisease(String disease);

    List<Patient> findByDoctorName(String doctorName);

    // Find by disease (JPQL)
//    @Query("select p from Patient p where p.disease = :disease")
//    List<Patient> findByDisease(@Param("disease") String disease);

    // Find by doctor name (Native Query)
//    @Query(value = "select * from patient where doctor_name = :doctorName", nativeQuery = true)
//    List<Patient> findByDoctorName(@Param("doctorName") String doctorName);
}
