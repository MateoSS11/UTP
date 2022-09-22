package com.hibernate.introduction.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Indicar que la clase representa una entidad en la BD

@Table(name = "cliente")// Indicar el nombre de la tabla en BD a la que representa la clase Mascota

public class Cliente {
    // ATRIBUTOS
    @Id// Indica primary key
    private String cedula;

    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private String nombre_mascota;
    private String raza;
    private boolean vacunas;
    private String observacion; 

    // CONSTRUCTORES
    public Cliente() { 
    }

    public Cliente(String cedula, String nombre, String apellido, String telefono, String email, String nombre_mascota,
            String raza, boolean vacunas, String observacion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.vacunas = vacunas;
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        String info = "----------------------\n";
        info+= "Cedula: "+ cedula;
        info += "\nNombre: " + nombre;
        info += "\nApellido: " + apellido;
        info += "\nTelefono: " + telefono;
        info += "\nEmail: " + email;
        info += "\nNombre_mascota: " + nombre_mascota;
        info += "\nRaza: " + raza;
        info += "\nVacunas: " + vacunas;
        info += "\nObservación: " + observacion;
        info += "\n----------------------\n";
        return info;
    }

    //getters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public String getObservacion() {
        return observacion;
    }


    //setters
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }


    

}
