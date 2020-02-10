package fr.eni.spring.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import fr.eni.spring.bean.type.Typetheque;

@Component("mediathequeBean")
public class Mediatheque {

	@Resource(name = "bibliothequeBean")
	private Typetheque typetheque;
	
	private List<Media> medias = new ArrayList<>();

	public Mediatheque() {
	}

	public Mediatheque(Typetheque typetheque, List<Media> medias) {
		super();
		this.typetheque = typetheque;
		this.medias = medias;
	}

	public Typetheque getTypetheque() {
		return typetheque;
	}

	public void setTypetheque(Typetheque typetheque) {
		this.typetheque = typetheque;
	}

	public List<Media> getMedias() {
		return medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

}
