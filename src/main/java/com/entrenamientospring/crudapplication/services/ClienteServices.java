package com.entrenamientospring.crudapplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entrenamientospring.crudapplication.interfaceServices.InterfaceClienteServices;
import com.entrenamientospring.crudapplication.interfaces.ClienteInterface;
import com.entrenamientospring.crudapplication.models.Cliente;

@Service
public class ClienteServices implements InterfaceClienteServices {

	@Autowired
	private ClienteInterface datos;

	@Override
	public List<Cliente> listar() {
		return (List<Cliente>) datos.findAll();
	}

	@Override
	public int guardar(Cliente c) {
		int resultado = 0;
		Cliente cliente = datos.save(c);
		if(!cliente.equals(null)) {
			resultado = 1;
		}
		return resultado;
	}

	@Override
	public void borrar(int id) {
		datos.deleteById(id);
	}

	@Override
	public Optional<Cliente> consultarUnCliente(int id) {
		return datos.findById(id);
	}
}