package fr.eni.spring.bean.type;

import org.springframework.stereotype.Component;

@Component("bluraythequeBean")
public class Bluraytheque extends Typetheque {

	public Bluraytheque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bluraytheque(String nom, String media) {
		super(nom, media);
		// TODO Auto-generated constructor stub
	}

}
