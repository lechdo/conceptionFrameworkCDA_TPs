package fr.eni.spring.bean.type;

public abstract class Typetheque {

	private String nom = "biblio";
	private String media = "films";

	public Typetheque(String nom, String media) {
		super();
		this.nom = nom;
		this.media = media;
	}

	public Typetheque() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

}
