package com.entrenamientospring.crudapplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entrenamientospring.crudapplication.interfaceServices.InterfaceUsuarioServices;
import com.entrenamientospring.crudapplication.models.Usuario;

@Controller
@RequestMapping
public class UsuarioController {

	@Autowired
	private InterfaceUsuarioServices service;

	@GetMapping("/Usuario/listar")
	public String listar(Model model) {
		List<Usuario> usuario = service.listar();
		model.addAttribute("usuario", usuario);
		return "Usuario/listar";
	}

	@GetMapping("/Usuario/insertar")
	public String vistaGuardar(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "Usuario/insertar";
	}

	@PostMapping("/Usuario/guardar")
	public String guardar(@Validated Usuario u, Model model) {
		service.guardar(u);
		return "redirect:/Usuario/listar";
	}

	@GetMapping("/Usuario/actualizar/{id}")
	public String actualizar(@PathVariable int id, Model model) {
		Optional<Usuario> usuario = service.consultarUnUsuario(id);
		model.addAttribute("usuario", usuario);
		return "Usuario/actualizar";
	}

	@GetMapping("/Usuario/borrar/{id}")
	public String borrar(@PathVariable int id, Model model) {
		service.borrar(id);
		return "redirect:/Usuario/listar";
	}
}