package com.sas.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	
	@Entity 
	@Table(name = "tb_unidadeEspecificaDeAbordagem")
	public class UnidadeEspecificaDeAbordagem {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;


	public UnidadeEspecificaDeAbordagem(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public UnidadeEspecificaDeAbordagem() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "UnidadeEspecificaDeAbordagem [id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnidadeEspecificaDeAbordagem other = (UnidadeEspecificaDeAbordagem) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}
	
}	
