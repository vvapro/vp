package model;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Form_pagamentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int code;
	@Column(nullable = false)
	private int cartao_credito_debito;
	@Column(nullable = false)
	private int transferencias_ted;
	@Column(nullable = false)
	private int pix;
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Aluguel_produtos aluguel_produtos;
	
	@Override
	public String toString() {
		return "Form_pagamentos [code=" + code + ", cartao_credito_debito=" + cartao_credito_debito
				+ ", transferencias_ted=" + transferencias_ted + ", pix=" + pix + ", getCode()=" + getCode()
				+ ", getCartao_credito_debito()=" + getCartao_credito_debito() + ", getTransferencias_ted()="
				+ getTransferencias_ted() + ", getPix()=" + getPix() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public int getCartao_credito_debito() {
		return cartao_credito_debito;
	}
	public void setCartao_credito_debito(int cartao_credito_debito) {
		this.cartao_credito_debito = cartao_credito_debito;
	}
	public int getTransferencias_ted() {
		return transferencias_ted;
	}
	public void setTransferencias_ted(int transferencias_ted) {
		this.transferencias_ted = transferencias_ted;
	}
	public int getPix() {
		return pix;
	}
	public void setPix(int pix) {
		this.pix = pix;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cartao_credito_debito, code, pix, transferencias_ted);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Form_pagamentos other = (Form_pagamentos) obj;
		return cartao_credito_debito == other.cartao_credito_debito && code == other.code && pix == other.pix
				&& transferencias_ted == other.transferencias_ted;
	}	
	

}
