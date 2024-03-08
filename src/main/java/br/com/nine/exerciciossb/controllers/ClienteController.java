package br.com.nine.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.nine.exerciciossb.model.entities.Cliente;

@RestController()
@RequestMapping(path = "/clientes")
public class ClienteController {

	
	@GetMapping(path = "/qualquer")
	public Cliente ObterCliente() {
		return new Cliente(21, "Théo", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente ObterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Neymar", "987.654.321-00");
	}
	
	@GetMapping
	public Cliente ObterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Ronaldinho", "111.222.333-44");
	}
}
