package com.entrenamientospring.crudapplication.interfaces;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entrenamientospring.models.Usuario;

@Repository
public interface UsuarioInterface extends CrudRepository<Usuario, Integer> {
    List<Usuario> findAll();
}