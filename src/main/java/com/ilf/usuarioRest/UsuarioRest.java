package com.ilf.usuarioRest;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ilf.entitys.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioRest {
	
	@GetMapping
	public ResponseEntity<Usuario> getUsuario(){
		Usuario user = new Usuario();
		user.setId(1);
		user.setNombre("Ivan");
		
		return ResponseEntity.ok(user);
	}
	
	@GetMapping("/saludo")
	//@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String saludo() {
		
		return "Hello World";
	}
}
