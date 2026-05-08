package com.example.hospital.service.impl;

import com.example.hospital.dto.PatientResponseDTO;
import com.example.hospital.entity.Patient;
import com.example.hospital.repository.PatientRepository;
import com.example.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Override
    public PatientResponseDTO findById(Long id) {
        Optional<Patient> patient = patientRepository.findById(id);
        return mapToDto(patient.get());
    }

    @Override
    public PatientResponseDTO savePatient(Patient patient) {
        Patient savedPatient = patientRepository.save(patient);
        return mapToDto(savedPatient);
    }

    @Override
    public PatientResponseDTO updatePatient(Patient patient) {
        Patient updatedPatient = patientRepository.save(patient);
        return mapToDto(updatedPatient);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public List<PatientResponseDTO> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        List<PatientResponseDTO> patientList = new ArrayList<>();
        for (Patient patient : patients) {
            patientList.add(mapToDto(patient));
        }
        return patientList;
    }

    @Override
    public List<PatientResponseDTO> getAllPatientsByName(String name) {
        // Using Finder Method:   patientRepository.findByName(name);
        // Using JPQL:            patientRepository.findPatientByName(name);
        // Using Native Query:
        List<Patient> patients = patientRepository.findPatByName(name);
        List<PatientResponseDTO> patientList = new ArrayList<>();
        for (Patient patient : patients) {
            patientList.add(mapToDto(patient));
        }
        return patientList;
    }

    @Override
    public List<PatientResponseDTO> getAllPatientsByDisease(String disease) {
        List<Patient> patients = patientRepository.findByDisease(disease);
        List<PatientResponseDTO> patientList = new ArrayList<>();
        for (Patient patient : patients) {
            patientList.add(mapToDto(patient));
        }
        return patientList;
    }

    @Override
    public List<PatientResponseDTO> getAllPatientsByDoctorName(String doctorName) {
        List<Patient> patients = patientRepository.findByDoctorName(doctorName);
        List<PatientResponseDTO> patientList = new ArrayList<>();
        for (Patient patient : patients) {
            patientList.add(mapToDto(patient));
        }
        return patientList;
    }

    private PatientResponseDTO mapToDto(Patient patient) {
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(patient.getId());
        dto.setName(patient.getName());
        dto.setDisease(patient.getDisease());
        dto.setDoctorName(patient.getDoctorName());
        dto.setWard(patient.getWard());
        return dto;
    }
}
