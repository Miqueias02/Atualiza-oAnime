package com.ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Anime {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String nome;
	private String Individualidade;
	private String Fraqueza;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIndividualidade() {
		return Individualidade;
	}
	public void setIndividualidade(String individualidade) {
		Individualidade = individualidade;
	}
	public String getFraqueza() {
		return Fraqueza;
	}
	public void setFraqueza(String fraqueza) {
		Fraqueza = fraqueza;
	}
	
	}


