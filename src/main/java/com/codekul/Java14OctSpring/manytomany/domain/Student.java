package com.codekul.Java14OctSpring.manytomany.domain;

import com.codekul.Java14OctSpring.manytomany.domain.Courses;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Long contact;

    private String email;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "stud_courses",joinColumns = {@JoinColumn(name = "student_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "course_id",referencedColumnName = "id")})
    private List<Courses> courses;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }
}

/**
 * {
 *     "name": "Rakesh",
 *     "contact": 786768,
 *     "email": "rakesh@gmail.com",
 *     "courses": [
 *         {
 *             "id": 1
 *         },
 *         {
 *             "id": 2
 *         }
 *     ]
 * }
 */