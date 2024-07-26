package cl.praxis.ProyectoHospitalPostPandemia.service;

import cl.praxis.ProyectoHospitalPostPandemia.ProyectoHospitalPostPandemiaApplication;
import cl.praxis.ProyectoHospitalPostPandemia.model.dto.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class PatientServiceImpl implements IPatient{

    private static final Logger logger = LoggerFactory.getLogger(ProyectoHospitalPostPandemiaApplication.class);
    private final List<Patient> patientList;

        public PatientServiceImpl() {
        patientList = new ArrayList<>();
        patientList.add(new Patient(1, "Ronald", "Garcia", "Efermedad1"));
        patientList.add(new Patient(2, "Maribel", "Rojas", "Efermedad2"));
        patientList.add(new Patient(3, "Marcos", "Vidal", "Efermedad3"));
        patientList.add(new Patient(4, "Kamala", "Harris", "Efermedad4"));
    }

    public PatientServiceImpl(List<Patient> patientList) {
        this.patientList = patientList;
    }

    @Override
    public List<Patient> findAll() {
        logger.warn("Ejecutando findAll de PatientServiceImpl");
        return patientList;
    }

    @Override
    public Patient findOne(int id) {
        logger.warn("Ejecutando findOne de PatientServiceImpl");
        return patientList.stream()
                .filter(patient -> patient.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean create(Patient patient) {
        logger.warn("Ejecutando create de PatientServiceImpl");
        patient.setId(newId());
        logger.warn("EjecutandovvvvvvceImpl");
        patientList.add(patient);
        return true;
    }

    @Override
    public boolean update(Patient p) {
        logger.warn("Ejecutando update de PatientServiceImpl");
        Patient patient = findOne(p.getId());
        patient.setName(p.getName());
        patient.setLastName(p.getLastName());
        patient.setConcurrence(p.getConcurrence());

        return true;
    }

    @Override
    public boolean delete(int id) {
        logger.warn("Ejecutando delete de PatientServiceImpl");
        Patient patient = findOne(id);
        if (patient != null){
            patientList.remove(patient);
            return true;
        }

        return false;
    }

    @Override
    public int newId() {
        logger.warn("Ejecutando newID de PatientServiceImpl");

        if (!patientList.isEmpty()){
            Patient p= patientList.stream().max(Comparator.comparing(Patient::getId)).orElseThrow(NoSuchElementException::new);
            logger.warn("verificar2");
             return p.getId()+1;
        }
        return 1;
    }


}
