package com.ifce.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ifce.br.model.Anime;
import com.ifce.br.service.AnimeService;

@Controller
@RequestMapping("/anime")
public class AnimeController {
	
	@Autowired
	private AnimeService animeService;
	
	@GetMapping("/olaMundo")
	public String olaMundo() {
		return "OlaMundo";
	}
	@GetMapping("/formulario")
	public String animeFormulario() {
		
		return "Formulario";
		
	}
	
	@PostMapping("/salvar")
	public String cadastrarAnime(Anime anime){
		animeService.cadastrarAnime(anime);
		
		
		return "redirect:/anime/listar";
	}
	
	@GetMapping("/listar")
	public ModelAndView listarAnimes() {
		List<Anime> animes = animeService.listarAnimes();
		ModelAndView mv = new ModelAndView("listagem-anime");
		mv.addObject("listaAnimes", animes);
		return mv;
	}
	
	@RequestMapping("/excluir/{codigo}")
	public ModelAndView excluirAnimes(@PathVariable Long codigo) {
		animeService.excluirAnime(codigo);
		ModelAndView mv = new ModelAndView ("redirect:/anime/listar");
		
		return mv;
	}
	
	@RequestMapping("/atualizar/{codigo}")
	public ModelAndView atualizarAnimes(@PathVariable Long codigo) {
		Anime anime = animeService.buscarAnimePorId(codigo);
		ModelAndView mv = new ModelAndView("FormularioAtualizar");
		mv.addObject("anime", anime);
		return mv;
	}
	

}
