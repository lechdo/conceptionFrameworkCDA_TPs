package fr.eni.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.jpa.bo.Couleur;
import fr.eni.jpa.dal.ICouleurRepository;

@Service("gestionCouleur")
public class GestionCouleur implements GestionInterface<Couleur> {

	@Autowired
	private ICouleurRepository irep;

	@Override
	public void ajouter(Couleur ele) {
		irep.save(ele);

	}

	@Override
	public void supprimer(int id) {
		irep.delete(irep.findOne(id));

	}

	@Override
	public void modifier(Couleur ele) {
		irep.save(ele);

	}

	@Override
	public List<Couleur> lister() {
		return irep.findAll();
	}

	@Override
	public Couleur recuperer(int id) {
		return irep.findOne(id);
	}

}
