/**
 * 
 */
package br.com.eduardomelle.springdatamongodbexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.eduardomelle.springdatamongodbexample.document.Arquivo;

/**
 * @author eduardo
 *
 */
@Repository
public interface ArquivoRepository extends MongoRepository<Arquivo, String> {

}
