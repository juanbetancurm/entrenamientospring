package com.entrenamientospring.crudapplication.interfaces;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entrenamientospring.models.Cliente;

@Repository
public interface ClienteInterface extends CrudRepository<Cliente, Integer> {
    List<Cliente> findAll();
    List<Cliente> findByNombreContaining(String nombre);
}