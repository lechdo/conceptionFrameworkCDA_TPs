package fr.eni.spring.bean.type;

import org.springframework.stereotype.Component;

@Component("bibliothequeBean")
public class Bibliotheque extends Typetheque {

	public Bibliotheque() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bibliotheque(String nom, String media) {
		super(nom, media);
		// TODO Auto-generated constructor stub
	}

}
