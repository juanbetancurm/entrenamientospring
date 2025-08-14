package com.entrenamientospring.crudapplication.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entrenamientospring.crudapplication.interfaceServices.InterfaceUsuarioServices;
import com.entrenamientospring.crudapplication.interfaces.UsuarioInterface;
import com.entrenamientospring.crudapplication.models.Usuario;

@Service
public class UsuarioServices implements InterfaceUsuarioServices {

	@Autowired
	private UsuarioInterface datos;

	@Override
	public List<Usuario> listar() {
		return (List<Usuario>) datos.findAll();
	}

	@Override
	public int guardar(Usuario u) {
		int resultado = 0;
		Usuario usuario = datos.save(u);
		if(!usuario.equals(null)) {
			resultado = 1;
		}
		return resultado;
	}

	@Override
	public void borrar(int id) {
		datos.deleteById(id);
	}

	@Override
	public Optional<Usuario> consultarUnCliente(int id) {
		return datos.findById(id);
	}
}