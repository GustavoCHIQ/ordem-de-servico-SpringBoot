package br.edu.ifms.ordem.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.ordem.entities.Tecnico;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {
	@GetMapping
	public ResponseEntity<List<Tecnico>> findAll() {
		List<Tecnico> list = new ArrayList<>();
		list.add(new Tecnico(1L, "Luis Gustavo", "6734615952", "luis@gmail.com", "123456"));
		list.add(new Tecnico(2L, "Jose da Silva", "34618748", "josesilva@hotmail.com", "jose471436"));
		return ResponseEntity.ok().body(list);
	}
}
