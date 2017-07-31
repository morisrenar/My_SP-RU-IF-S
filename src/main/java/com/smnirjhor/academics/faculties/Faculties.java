package com.smnirjhor.academics.faculties;

import com.smnirjhor.academics.Academics;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by bmshamsnahid on 7/26/17.
 */
@Entity
public class Faculties {
    @Id
    private String academicsFacultiesId;
    private String academicsFacultiesName;
    @ManyToOne
    private Academics academics;

    public Faculties() {
    }

    public Faculties(String academicsFacultiesId, String academicsFacultiesName, Academics academics) {
        this.academicsFacultiesId = academicsFacultiesId;
        this.academicsFacultiesName = academicsFacultiesName;
        this.academics = academics;
    }

    public String getAcademicsFacultiesId() {
        return academicsFacultiesId;
    }

    public void setAcademicsFacultiesId(String academicsFacultiesId) {
        this.academicsFacultiesId = academicsFacultiesId;
    }

    public String getAcademicsFacultiesName() {
        return academicsFacultiesName;
    }

    public void setAcademicsFacultiesName(String academicsFacultiesName) {
        this.academicsFacultiesName = academicsFacultiesName;
    }

    public Academics getAcademics() {
        return academics;
    }

    public void setAcademics(Academics academics) {
        this.academics = academics;
    }
}
