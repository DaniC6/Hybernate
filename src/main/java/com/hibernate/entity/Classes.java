package com.hibernate.entity;

import jakarta.persistence.*;


@Entity
@Table(name="classes")
public class Classes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idClasses;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name= "description", nullable = false)
    private String description;

    public Long getIdClasses() {
        return idClasses;
    }

    public void setIdClasses(Long idClasses) {
        this.idClasses = idClasses;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
