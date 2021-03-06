package br.usjt.arqsw.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * 
 * @author 81612332 - Gabrielle Nascimento - SIN3AN MCA1
 */


@Entity
@Table
public class Chamado implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="id_chamado")
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull(message="A descri�ão não pode ser vazia")
	@Size(min=5, max=100, message="A descri��o deve estar entre 5 e 100 caracteres.")
	@Column
	private String descricao;
	@NotNull
	@Column
	private String status;
	@NotNull
	@Column
	private Date dt_abertura;
	@Column
	private Date dt_fechamento;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_fila")
	private Fila fila;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDt_abertura() {
		return dt_abertura;
	}

	public void setDt_abertura(Date dt_abertura) {
		this.dt_abertura =dt_abertura;
	}

	public Date getDt_fechamento() {
		return dt_fechamento;
	}

	public void setDt_fechamento(Date dt_fechamento) {
		this.dt_fechamento = dt_fechamento;
	}

	public Fila getFila() {
		return fila;
	}

	public void setFila(Fila fila) {
		this.fila = fila;
	}

}
