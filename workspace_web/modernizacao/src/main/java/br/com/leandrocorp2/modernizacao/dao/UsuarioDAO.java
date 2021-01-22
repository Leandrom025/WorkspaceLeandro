package br.com.leandrocorp2.modernizacao.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.leandrocorp2.modernizacao.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {

	public Usuario findByRacfAndSenha(String racf, String senha);

	public Usuario findByRacfOrEmail(String racf, String email);

}
