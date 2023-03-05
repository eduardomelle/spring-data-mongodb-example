/**
 * 
 */
package br.com.eduardomelle.springdatamongodbexample.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.eduardomelle.springdatamongodbexample.document.Arquivo;
import br.com.eduardomelle.springdatamongodbexample.dto.ArquivoSaveReqDTO;
import br.com.eduardomelle.springdatamongodbexample.dto.ArquivoSaveResDTO;
import br.com.eduardomelle.springdatamongodbexample.service.ArquivoService;

/**
 * @author eduardo
 *
 */
@RestController
@RequestMapping("/api/v1/arquivos")
public class ArquivoController {

	@Autowired
	private ArquivoService arquivoService;

	@PostMapping
	public ResponseEntity<ArquivoSaveResDTO> salvar(@RequestBody ArquivoSaveReqDTO request) {
		Arquivo arquivo = this.arquivoService.save(request.getNome(), request.getConteudo());
		ArquivoSaveResDTO response = new ArquivoSaveResDTO();
		BeanUtils.copyProperties(arquivo, response);
		return ResponseEntity.ok(response);
	}

}
