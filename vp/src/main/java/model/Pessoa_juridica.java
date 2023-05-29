package model;

import java.util.Objects;
import javax.persistence.*;

@Entity

public class Pessoa_juridica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int code;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private int telefone;
	@Column(nullable = false)
	private String endereco;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private int cnpj;
	@Column(nullable = false)
	private String login;
	@Column(nullable = false)
	private String senha;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Aluguel_produtos aluguel_produtos;
		
	@Override
	public String toString() {
		return "Pessoa_juridica [code=" + code + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", email=" + email + ", cnpj=" + cnpj + ", login=" + login + ", senha=" + senha + ", getCode()="
				+ getCode() + ", getNome()=" + getNome() + ", getTelefone()=" + getTelefone() + ", getEndereco()="
				+ getEndereco() + ", getEmail()=" + getEmail() + ", getCnpj()=" + getCnpj() + ", getLogin()="
				+ getLogin() + ", getSenha()=" + getSenha() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
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
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cnpj, code, email, endereco, login, nome, senha, telefone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa_juridica other = (Pessoa_juridica) obj;
		return cnpj == other.cnpj && code == other.code && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(login, other.login)
				&& Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha) && telefone == other.telefone;
	}
	
	
}
