package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.dto.TopicoDto;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;

@RestController
public class TopicosController {
	
	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos")
	public List<TopicoDto> list(){
		List<Topico> topicos = topicoRepository.findAll();	
		return TopicoDto.converter(topicos);
	}
}
