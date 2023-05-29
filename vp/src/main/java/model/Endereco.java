package model;

import java.util.Objects;

import javax.persistence.*;

@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String rua;
	@Column(nullable = false)
	private String bairo;
	@Column(nullable = false)
	private int cep;
	@Column(nullable = false)
	private String estado;
	@Column(nullable = false)
	
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	private Aluguel_produtos aluguel_produtos;
	
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairo=" + bairo + ", cep=" + cep + ", estado=" + estado + "]";
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairo() {
		return bairo;
	}
	public void setBairo(String bairo) {
		this.bairo = bairo;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bairo, cep, estado, rua);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		return Objects.equals(bairo, other.bairo) && cep == other.cep && Objects.equals(estado, other.estado)
				&& Objects.equals(rua, other.rua);
	}
	
	

}
