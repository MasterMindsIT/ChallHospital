package cl.praxis.ProyectoHospitalPostPandemia.service;

import cl.praxis.ProyectoHospitalPostPandemia.model.dto.Patient;

import java.util.List;

public interface IPatient {
    List<Patient> findAll();
    Patient findOne(int id);
    boolean create(Patient patient);
    boolean update(Patient patient);
    boolean delete(int id);
    int newId();
}
