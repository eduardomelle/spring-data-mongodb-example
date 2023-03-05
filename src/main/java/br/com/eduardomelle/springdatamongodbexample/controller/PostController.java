/**
 * 
 */
package br.com.eduardomelle.springdatamongodbexample.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.eduardomelle.springdatamongodbexample.dto.PostDTO;

/**
 * @author eduardo
 *
 */
@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

	@GetMapping
	public ResponseEntity<List<PostDTO>> listAll() {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<PostDTO[]> posts = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/posts",
				PostDTO[].class);
		return ResponseEntity.ok(Arrays.asList(posts.getBody()));
	}

}
