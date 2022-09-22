package com.hibernate.introduction.controlador;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hibernate.introduction.modelo.Servicio;
import com.hibernate.introduction.servicios.ServicioService;

@RestController
@RequestMapping("/servicio")

public class ServicioController {

    private ServicioService service;

    // CONSTRUCTOR
    public ServicioController() {
        service = new ServicioService();
    }

    //metodos

    //consultar servicio
    @GetMapping
    public List<Servicio> getServicios() {
        return service.getServicios();
    }
    
    //consultar servicio x nombre
    @GetMapping("/{nombre_servicio}")
    public List<Servicio> getXNombre(@PathVariable(name = "nombre_servicio") String nombre_servicio) {
        return service.getXNombre(nombre_servicio);
    }
    
}
