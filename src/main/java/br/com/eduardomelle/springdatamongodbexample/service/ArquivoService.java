/**
 * 
 */
package br.com.eduardomelle.springdatamongodbexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eduardomelle.springdatamongodbexample.document.Arquivo;
import br.com.eduardomelle.springdatamongodbexample.repository.ArquivoRepository;

/**
 * @author eduardo
 *
 */
@Service
public class ArquivoService {

	@Autowired
	private ArquivoRepository arquivoRepository;

	public Arquivo save(String nome, String conteudo) {
		return arquivoRepository.save(new Arquivo(nome, conteudo));
	}

	public List<Arquivo> findAll() {
		return arquivoRepository.findAll();
	}

	public long count() {
		return arquivoRepository.count();
	}

	public Optional<Arquivo> findById(String id) {
		return arquivoRepository.findById(id);
	}

	public void deleteById(String id) {
		arquivoRepository.deleteById(id);
	}

}
