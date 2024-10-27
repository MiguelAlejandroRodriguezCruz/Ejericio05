package com.upiiz.ORM.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.upiiz.ORM.Models.ClienteEntity;
import com.upiiz.ORM.Services.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping()
    public ResponseEntity<List<ClienteEntity>> getClientes() {
        return ResponseEntity.ok(clienteService.obtenerTodos());
    }

    @PostMapping()
    public ResponseEntity<ClienteEntity> guardar(@RequestBody ClienteEntity clienteEntity) {
        return ResponseEntity.ok(clienteService.guardarCLiente(clienteEntity));
    }

}
