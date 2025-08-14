package com.entrenamientospring.crudapplication.interfaceServices;

import java.util.List;
import java.util.Optional;
import com.entrenamientospring.models.Cliente;

public interface InterfaceClienteServices {
    public List<Cliente> listar();
    public int guardar(Cliente cliente);
    public void borrar(int id);
    public Optional<Cliente> consultarUnCliente(int id);
}