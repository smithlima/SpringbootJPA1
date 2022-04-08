package com.springboot.controller;

import java.util.List;

import com.springboot.model.Cliente;
import com.springboot.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/clientes")

public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
    @GetMapping
    public List<Cliente> listar(){
        return clienteRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente add(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }
}