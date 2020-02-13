package fr.eni.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/film")
public class FilmController {
	
	
	@RequestMapping(value = "/afficher", method = RequestMethod.GET)
	public String getAfficherFilm() {
		return "ajouterFilm";
	}
	
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.GET)
	public String getAjouterFilm() {
		return "ajouterFilm";
	}
	
	
	@RequestMapping(value = "/editer", method = RequestMethod.GET)
	public String getEditerFilm() {
		return "editerFilm";
	}
	
	
	@RequestMapping(value = "/liste", method = RequestMethod.GET)
	public String getListeFilm() {
		return "listeFilm";
	}
	
	
	
	

	
	
}
