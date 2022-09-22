package com.hibernate.introduction.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Indicar que la clase representa una entidad en la BD

@Table(name = "servicio")// Indicar el nombre de la tabla en BD a la que representa la clase Mascota
public class Servicio {
    //atributos 
    @Id
    private int id_servicio;

    private String nombre_servicio;
    private int costo_servicio;
    private String detalles_servicio;

    //metodos 
    // CONSTRUCTORES
    public Servicio() { 
    }

    public Servicio(String nombre_servicio, int costo_servicio, String detalles_servicio) {
        this.nombre_servicio = nombre_servicio;
        this.costo_servicio = costo_servicio;
        this.detalles_servicio = detalles_servicio;
    }

    @Override
    public String toString() {
        String info = "----------------------\n";
        info+= "Nombre del servicio: "+ nombre_servicio;
        info += "\nCosto del servicio: " + costo_servicio;
        info += "\nDetalles del servicio " + detalles_servicio;
        info += "\n----------------------\n";
        return info;
    }

    //getters
    public int getId_servicio() {
        return id_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public int getCosto_servicio() {
        return costo_servicio;
    }

    public String getDetalles_servicio() {
        return detalles_servicio;
    }

    //setters - modificadores
    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public void setCosto_servicio(int costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public void setDetalles_servicio(String detalles_servicio) {
        this.detalles_servicio = detalles_servicio;
    }




}
