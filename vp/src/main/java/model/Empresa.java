package model;

import java.util.Objects;
import javax.persistence.*;

@Entity

public class Empresa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cod;
	@Column(nullable = false)
	private String nome_empresa;
	@Column(nullable = false)
	private String endereco;
	@Column(nullable = false)
	private int cnpj;
	@Column(nullable = false)
	private int email;
	@Column(nullable = false)
	private int telefone;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Aluguel_produtos aluguel_produtos;
	
		
	@Override
	public String toString() {
		return "Empresa [cod=" + cod + ", cnpj=" + cnpj + ", email=" + email + ", telefone=" + telefone + "]";
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getEmail() {
		return email;
	}
	public void setEmail(int email) {
		this.email = email;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cnpj, cod, email, telefone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return cnpj == other.cnpj && cod == other.cod && email == other.email && telefone == other.telefone;
	}	
	

}
