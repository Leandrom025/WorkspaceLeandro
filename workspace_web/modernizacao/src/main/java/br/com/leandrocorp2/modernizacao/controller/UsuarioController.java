package br.com.leandrocorp2.modernizacao.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.leandrocorp2.modernizacao.dao.UsuarioDAO;
import br.com.leandrocorp2.modernizacao.model.Usuario;

@RestController
@CrossOrigin("*")

public class UsuarioController {

	@Autowired
	UsuarioDAO dao;

	@GetMapping("/usuarios")
	public ArrayList<Usuario> recuperarTodos() {
		ArrayList<Usuario> lista;

		lista = (ArrayList<Usuario>) dao.findAll();
		return lista;
	}

	@PostMapping("/login")
	public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario dadosLogin) {
		Usuario resultado;

		resultado = dao.findByRacfOrEmail(dadosLogin.getRacf(), dadosLogin.getEmail());

		if (resultado != null) {
			if (dadosLogin.getSenha().equals(resultado.getSenha())) {
				return ResponseEntity.ok(resultado);
			} else {
				return ResponseEntity.status(403).build();
			}
		} else {
			return ResponseEntity.notFound().build();
		}

	}

}
