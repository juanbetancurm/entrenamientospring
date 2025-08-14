package com.entrenamientospring.crudapplication.interfaceServices;

import java.util.List;
import java.util.Optional;
import com.entrenamientospring.models.Usuario;

public interface InterfaceUsuarioServices {
    public List<Usuario> listar();
    public int guardar(Usuario usuario);
    public void borrar(int id);
    public Optional<Usuario> consultarUnCliente(int id);
}