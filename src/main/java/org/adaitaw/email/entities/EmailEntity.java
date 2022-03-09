package org.adaitaw.email.entities;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "validacion_email")

public class EmailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String email;
    private boolean validacion;

    @Column(name = "fecha_validacion")
    @DateTimeFormat(pattern = "yyy/MM/dd")
    private LocalDate fechaValidacion;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValidacion() {
        return validacion;
    }

    public void setValidacion(boolean validacion) {
        this.validacion = validacion;
    }

    public LocalDate getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(LocalDate fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }
}