package fr.eni.jpa.bo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Bouteille")
public class Bouteille {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nom;
	private boolean petillant;
	private String millesime;
	private int quantite;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	Couleur couleur;

	@OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	Region region;

	public Bouteille(String nom, boolean petillant, String millesime, int quantite, Couleur couleur, Region region) {
		super();
		this.nom = nom;
		this.petillant = petillant;
		this.millesime = millesime;
		this.quantite = quantite;
		this.couleur = couleur;
		this.region = region;
	}

	public Bouteille() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean isPetillant() {
		return petillant;
	}

	public void setPetillant(boolean petillant) {
		this.petillant = petillant;
	}

	public String getMillesime() {
		return millesime;
	}

	public void setMillesime(String millesime) {
		this.millesime = millesime;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bouteille [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", petillant=");
		builder.append(petillant);
		builder.append(", millesime=");
		builder.append(millesime);
		builder.append(", quantite=");
		builder.append(quantite);
		builder.append(", couleur=");
		builder.append(couleur);
		builder.append(", region=");
		builder.append(region);
		builder.append("]");
		return builder.toString();
	}

}
