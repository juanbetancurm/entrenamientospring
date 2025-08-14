package com.entrenamientospring.crudapplication.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entrenamientospring.crudapplication.models.Usuario;

@Repository
public interface UsuarioInterface extends CrudRepository<Usuario, Integer> {
}