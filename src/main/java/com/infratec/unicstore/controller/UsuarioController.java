package com.infratec.unicstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infratec.unicstore.model.UsuarioModel;
import com.infratec.unicstore.repository.UsuarioRepository;




@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping(path = "/api/usuario/{id}")
	public ResponseEntity<?> consultar (@PathVariable("id") Integer id) {
		return repository.findById(id)
				.map(record -> ResponseEntity.ok().body(record))
				.orElse(ResponseEntity.notFound().build());				
	}
	
	@PostMapping(path = "/api/usuario/salvar")
	public UsuarioModel salvar(@RequestBody UsuarioModel usuario){
		return repository.save(usuario);
	}
}
