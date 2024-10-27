package com.upiiz.ORM.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.upiiz.ORM.Models.ClienteEntity;
import com.upiiz.ORM.Repository.ClienteRepositoyry;

@Service
public class ClienteService {

    // Inyectar una dependecia - Conectar
    @Autowired
    ClienteRepositoyry clienteRepositoyry;

    // Listar todos
    public List<ClienteEntity> obtenerTodos() {
        return clienteRepositoyry.findAll();
    }

    public ClienteEntity guardarCLiente(ClienteEntity clienteEntity) {
        return clienteRepositoyry.save(clienteEntity);
    }
    // Guardar un cliente
}
