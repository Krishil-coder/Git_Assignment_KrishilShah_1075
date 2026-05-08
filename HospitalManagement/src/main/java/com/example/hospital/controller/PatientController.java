package com.example.hospital.controller;

import com.example.hospital.dto.PatientResponseDTO;
import com.example.hospital.entity.Patient;
import com.example.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    // GET all patients
    @GetMapping("/list")
    public ResponseEntity<List<PatientResponseDTO>> getAllPatients() {
        try {
            return ResponseEntity.ok(patientService.getAllPatients());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // GET patient by ID
    @GetMapping("/{id}")
    public ResponseEntity<PatientResponseDTO> getPatientById(@PathVariable("id") Long id) {
        try {
            return ResponseEntity.ok(patientService.findById(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // POST - create new patient
    @PostMapping("/")
    public ResponseEntity<PatientResponseDTO> savePatient(@RequestBody Patient patient) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(patientService.savePatient(patient));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // PUT - update patient
    @PutMapping("/")
    public ResponseEntity<PatientResponseDTO> updatePatient(@RequestBody Patient patient) {
        try {
            return ResponseEntity.ok(patientService.updatePatient(patient));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // DELETE - delete patient
    @DeleteMapping("/")
    public ResponseEntity<Void> deletePatient(@RequestBody Patient patient) {
        try {
            patientService.deletePatient(patient);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // GET patients by name
    @GetMapping("/byName")
    public ResponseEntity<List<PatientResponseDTO>> getPatientsByName(@RequestParam(name = "name") String name) {
        try {
            return ResponseEntity.ok(patientService.getAllPatientsByName(name));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // GET patients by disease
    @GetMapping("/byDisease")
    public ResponseEntity<List<PatientResponseDTO>> getPatientsByDisease(@RequestParam(name = "disease") String disease) {
        try {
            return ResponseEntity.ok(patientService.getAllPatientsByDisease(disease));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    // GET patients by doctor name
    @GetMapping("/byDoctor")
    public ResponseEntity<List<PatientResponseDTO>> getPatientsByDoctor(@RequestParam(name = "doctorName") String doctorName) {
        try {
            return ResponseEntity.ok(patientService.getAllPatientsByDoctorName(doctorName));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
