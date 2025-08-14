package com.entrenamientospring.crudapplication.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.entrenamientospring.crudapplication.models.Cliente;

@Repository
public interface ClienteInterface extends CrudRepository<Cliente, Integer> {
}