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
public class ArquivoSaveReqDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;

	private String conteudo;

}
