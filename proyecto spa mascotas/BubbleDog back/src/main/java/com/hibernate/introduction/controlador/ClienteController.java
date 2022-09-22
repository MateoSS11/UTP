package com.hibernate.introduction.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.introduction.modelo.Cliente;
import com.hibernate.introduction.servicios.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService service;

    // CONSTRUCTOR
    public ClienteController() {
        service = new ClienteService();
    }

    //metodos

    //crear cliente
    @PostMapping
    public String create(@RequestBody Cliente cliente) {
        return service.create(cliente);
    }

    //consultar cliente
    @GetMapping
    public List<Cliente> getClientes() {
        return service.getClientes();
    }

    //consultar cliente x cedula
    @GetMapping("/{cedula}")
    public List<Cliente> getXCedula(@PathVariable(name = "cedula") String cedula) {
        return service.getXCedula(cedula);
    }


}
