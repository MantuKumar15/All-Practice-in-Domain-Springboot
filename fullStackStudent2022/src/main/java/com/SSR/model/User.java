package com.SSR.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String session_year;
    private String semester;
    private String subject_name;
    private String faculty_name;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getsession_year() {
        return session_year;
    }

    public void setsession_year(String session_year) {
        this.session_year = session_year;
    }

    public String getsemester() {
        return semester;
    }

    public void setsemester(String semester) {
        this.semester = semester;
    }

    public String getsubject_name() {
        return subject_name;
    }

    public void setsubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
    public String getfaculty_name() {
        return faculty_name;
    }

    public void setfaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }
       
}
