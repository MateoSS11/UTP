package com.hibernate.introduction.servicios;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.hibernate.introduction.modelo.Servicio;

public class ServicioService {
        //atributos
        private SessionFactory factory;

        //metodos 
        public ServicioService() {
            // Crear objeto que permita fabricar sesiones
            factory = new Configuration().configure("cfg.xml").addAnnotatedClass(Servicio.class).buildSessionFactory();
        }
    
        public Session openSession() {
            Session session = factory.openSession();
            session.beginTransaction();
            return session;
        }
    //consultar servicios
    public List<Servicio> getServicios() {
        List<Servicio> servicio = new ArrayList<>();
        Session session = openSession();
        try {
            servicio = session.createQuery("from Servicio", Servicio.class).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return servicio;
    }
    
    //consultar servicio x nombre 
    public List<Servicio> getXNombre(String nombre_servicio) {
        List<Servicio> servicio = new ArrayList<>();
        Session session = openSession();
        try {
            servicio = session.createQuery("from Servicio where nombre_servicio = :parametro_nombre_servicio", Servicio.class).setParameter("parametro_nombre_servicio", nombre_servicio).list();
        } catch (Exception e) {
            e.printStackTrace();
        }
        session.close();
        return servicio;
    }
}
