package br.com.leandrocorp2.modernizacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="itmn_comunidade")
public class Comunidade {
	
	@Id  // indica que é chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // é um auto-increment (o IDENTITY é a estratégia q o Mysql usa)
	@Column(name="id_comunidade") // defino o nome da coluna
	private int id;
	
	@Column(name="nome_comunidade", length = 100, nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	@JsonIgnoreProperties("comunidades")
	private Usuario teamLeader;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario getTeamLeader() {
		return teamLeader;
	}

	public void setTeamLeader(Usuario teamLeader) {
		this.teamLeader = teamLeader;
	}
}