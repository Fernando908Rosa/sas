package com.sas.dto;

import java.util.Date;

import javax.persistence.Column;

import com.sas.entity.Pessoa;

public class PessoaResponseDto {
	
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "sobrenome")
	private String sobrenome;
	
	@Column(name = "dataInicial")
	private Date dataInicial;
	
	@Column(name = "cpf")
	private Integer cpf;

	public PessoaResponseDto(Long id, String nome, String sobrenome, Date dataInicial, Integer cpf) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataInicial = dataInicial;
		this.cpf = cpf;
	}

	public static PessoaResponseDto converterPessoaParaPessoaResponseDto(Pessoa pessoa) {
		return new PessoaResponseDto( pessoa.getId(), pessoa.getNome(), pessoa.getSobrenome(), pessoa.getDataInicial(), pessoa.getCpf());
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

}


