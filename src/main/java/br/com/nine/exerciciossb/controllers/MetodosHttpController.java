package br.com.nine.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/metodos")
public class MetodosHttpController {

	@GetMapping
	public String get() {
		return "Requisição GET";
	}

	@PostMapping
	public String post() {
		return "Requisição POST";

	}

	@PatchMapping
	public String patch() {
		return "Requisição PATCH";
	}

	@PutMapping
	public String put() {
		return "Requisição PUT";

	}

	@DeleteMapping
	public String delete() {
		return "Requisição DELETE";

	}
}