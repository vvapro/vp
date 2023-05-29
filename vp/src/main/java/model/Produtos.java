package model;

import java.util.Objects;

import javax.persistence.*;

@Entity

public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int code;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String tipo;
	@Column(nullable = false)
	private String descricao;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Aluguel_produtos aluguel_produtos;

	@Override
	public String toString() {
		return "Produtos [code=" + code + ", nome=" + nome + ", tipo=" + tipo + ", descricao=" + descricao
				+ ", getCode()=" + getCode() + ", getNome()=" + getNome() + ", getTipo()=" + getTipo()
				+ ", getDescricao()=" + getDescricao() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, descricao, nome, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		return code == other.code && Objects.equals(descricao, other.descricao) && Objects.equals(nome, other.nome)
				&& Objects.equals(tipo, other.tipo);
	}

}
