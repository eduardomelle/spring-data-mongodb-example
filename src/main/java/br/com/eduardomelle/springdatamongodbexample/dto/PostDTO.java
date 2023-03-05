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
public class PostDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long userId;

	private Long id;

	private String title;

	private String body;

}
