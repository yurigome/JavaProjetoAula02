package entities;

import java.util.UUID;

public class Pessoa {

	/*
	 * atributos da classe (dados)
	 * 
	 */

	private UUID id;
	private String nome;
	/*
	 * metodo para retornar o valor do id
	 */
	public UUID getId() {
		return id;
	}
/*
 * meteodo para receber o valor da id
 */
	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}