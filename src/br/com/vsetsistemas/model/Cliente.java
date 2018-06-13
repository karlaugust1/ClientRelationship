package br.com.vsetsistemas.model;

import java.util.Date;

public class Cliente {
	 
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String endereco;
    private String descricao;
    private String profissao;
    private Date dataNascimento;
    private float salario;
    
    public Cliente() {}
    
	public Cliente(String nome, String cpf, String rg, String telefone, String endereco, String descricao,
			String profissao, Date dataNascimento, float salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.telefone = telefone;
		this.endereco = endereco;
		this.descricao = descricao;
		this.profissao = profissao;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
     
    
}
