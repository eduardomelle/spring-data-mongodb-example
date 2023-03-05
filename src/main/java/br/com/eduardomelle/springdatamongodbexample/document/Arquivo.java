/**
 * 
 */
package br.com.eduardomelle.springdatamongodbexample.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;

/**
 * @author eduardo
 *
 */
@Document(collection = "arquivo")
@Getter
public class Arquivo {

	@Id
	private String id;

	private String data;

	private String nome;

	private String conteudo;

	public Arquivo(String nome, String conteudo) {
		super();
		this.nome = nome;
		this.conteudo = conteudo;
	}

}
