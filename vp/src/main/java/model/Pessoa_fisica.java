package model;

import java.util.Objects;

import javax.persistence.*;

@Entity

public class Pessoa_fisica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int code;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private int telefone;
	@Column(nullable = false)
	private int nascimento;
	@Column(nullable = false)
	private String endereco;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private int cpf;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Aluguel_produtos aluguel_produtos;

	@Override
	public String toString() {
		return "Pessoa_fisica [code=" + code + ", nome=" + nome + ", telefone=" + telefone + ", nascimento="
				+ nascimento + ", endereco=" + endereco + ", email=" + email + ", cpf=" + cpf + ", getCode()="
				+ getCode() + ", getNome()=" + getNome() + ", getTelefone()=" + getTelefone() + ", getNascimento()="
				+ getNascimento() + ", getEndereco()=" + getEndereco() + ", getEmail()=" + getEmail() + ", getCpf()="
				+ getCpf() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()="
				+ super.toString() + "]";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getNascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, cpf, email, endereco, nascimento, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa_fisica other = (Pessoa_fisica) obj;
		return code == other.code && cpf == other.cpf && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && nascimento == other.nascimento
				&& Objects.equals(nome, other.nome) && telefone == other.telefone;
	}

}
