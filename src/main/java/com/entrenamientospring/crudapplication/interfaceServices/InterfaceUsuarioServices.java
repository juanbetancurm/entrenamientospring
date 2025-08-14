package com.entrenamientospring.crudapplication.interfaceServices;

import java.util.List;
import java.util.Optional;
import com.entrenamientospring.crudapplication.models.Usuario;

public interface InterfaceUsuarioServices {
    public List<Usuario> listar();
    public int guardar(Usuario u);
    public void borrar(int id);
    public Optional<Usuario> consultarUnCliente(int id);
}