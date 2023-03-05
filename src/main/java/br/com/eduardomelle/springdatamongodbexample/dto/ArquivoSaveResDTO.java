/**
 * 
 */
package br.com.eduardomelle.springdatamongodbexample.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * @author eduardo
 *
 */
@Data
public class ArquivoSaveResDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String data;

	private String nome;

	private String conteudo;

}
