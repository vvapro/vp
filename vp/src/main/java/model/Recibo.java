package model;

import java.util.Objects;

import javax.persistence.*;

@Entity

public class Recibo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cod;
	@Column(nullable = false)
	private String produto;
	@Column(nullable = false)
	private int cont_produto;
	@Column(nullable = false)
	private String descricao;
	@Column(nullable = false)
	private String enviar_email;
	@Column(nullable = false)
	private int valor;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Aluguel_produtos aluguel_produtos;
		
	@Override
	public String toString() {
		return "Recibo [cod=" + cod + ", produto=" + produto + ", cont_produto=" + cont_produto + ", descricao="
				+ descricao + ", enviar_email=" + enviar_email + ", valor=" + valor + ", getCod()=" + getCod()
				+ ", getProduto()=" + getProduto() + ", getCont_produto()=" + getCont_produto() + ", getDescricao()="
				+ getDescricao() + ", getEnviar_email()=" + getEnviar_email() + ", getValor()=" + getValor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getCont_produto() {
		return cont_produto;
	}
	public void setCont_produto(int cont_produto) {
		this.cont_produto = cont_produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEnviar_email() {
		return enviar_email;
	}
	public void setEnviar_email(String enviar_email) {
		this.enviar_email = enviar_email;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cod, cont_produto, descricao, enviar_email, produto, valor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recibo other = (Recibo) obj;
		return cod == other.cod && cont_produto == other.cont_produto && Objects.equals(descricao, other.descricao)
				&& Objects.equals(enviar_email, other.enviar_email) && Objects.equals(produto, other.produto)
				&& valor == other.valor;
	}
	
	
}
