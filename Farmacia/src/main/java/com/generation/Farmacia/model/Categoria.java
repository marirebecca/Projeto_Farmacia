package com.generation.Farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Nome da Categoria é Obrigatório!")
	@Size(min = 5, max = 300, message = "O Nome deve conter no minimo 5 e no maximo 300 caracteres")
	private String nome;
	
	@NotBlank(message = "A Descrição da Categoria é Obrigatória!")
	@Size(min = 5, max = 300, message = "A Descrição deve conter no minimo 5 e no maximo 300 caracteres")
	private String descricao;
	
	@NotBlank(message = "O Departamento da Categoria é Obrigatório!")
	@Size(min = 5, max = 300, message = "O Departamento deve conter no minimo 5 e no maximo 300 caracteres")
	private String departamentos;
	
	@Size(min = 5, max = 300, message = "A Oferta deve conter no minimo 5 e no maximo 300 caracteres")
	private String ofertas;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(String departamentos) {
		this.departamentos = departamentos;
	}

	public String getOfertas() {
		return ofertas;
	}

	public void setOfertas(String ofertas) {
		this.ofertas = ofertas;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}
