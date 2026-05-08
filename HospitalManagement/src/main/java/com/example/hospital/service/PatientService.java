package com.example.hospital.service;

import com.example.hospital.dto.PatientResponseDTO;
import com.example.hospital.entity.Patient;

import java.util.List;

public interface PatientService {

    PatientResponseDTO findById(Long id);

    PatientResponseDTO savePatient(Patient patient);

    PatientResponseDTO updatePatient(Patient patient);

    void deletePatient(Patient patient);

    List<PatientResponseDTO> getAllPatients();

    List<PatientResponseDTO> getAllPatientsByName(String name);

    List<PatientResponseDTO> getAllPatientsByDisease(String disease);

    List<PatientResponseDTO> getAllPatientsByDoctorName(String doctorName);
}
