package cl.praxis.ProyectoHospitalPostPandemia.model.dto;

public class Patient {
    private int id;
    private String name;
    private String lastName;
    private String concurrence;

    public Patient() {
    }

    public Patient(int id, String name, String lastName, String concurrence) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.concurrence = concurrence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getConcurrence() {
        return concurrence;
    }

    public void setConcurrence(String concurrence) {
        this.concurrence = concurrence;
    }
}
