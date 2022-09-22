package com.hibernate.introduction.modelo;


import java.sql.Date;
import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Indicar que la clase representa una entidad en la BD

@Table(name = "detalles_servicio")// Indicar el nombre de la tabla en BD a la que representa la clase Mascota

public class detalles_servicio {
    // ATRIBUTOS
    @Id// Indica primary key
    private int id_detalles_servicio;

    private String cedula;
    private int id_servicio;
    private Calendar hora_fecha_entrega;

    //metodos
    //constructor 

    public detalles_servicio() { }

    public detalles_servicio(String cedula, int id_servicio) {
        this.cedula = cedula;
        this.id_servicio = id_servicio;
    }

    @Override
    public String toString() {
        String info = "----------------------\n";
        info+= "Cedula: "+ cedula;
        info += "\nId del servicio: " + id_servicio;
        info += "\n----------------------\n";
        return info;
    }

    //getters
    public int getId_detalles_servicio() {
        return id_detalles_servicio;
    }

    public String getCedula() {
        return cedula;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public Calendar getHora_fecha_entrega() {
        return hora_fecha_entrega;
    }

    //setters
    public void setId_detalles_servicio(int id_detalles_servicio) {
        this.id_detalles_servicio = id_detalles_servicio;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public void setHora_fecha_entrega(Calendar hora_fecha_entrega) {
        this.hora_fecha_entrega = hora_fecha_entrega;
    }

    
}
