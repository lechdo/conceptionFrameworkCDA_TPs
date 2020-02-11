package fr.eni.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.jpa.bo.Bouteille;
import fr.eni.jpa.dal.IBouteilleRepository;

@Service("gestionBouteille")
public class GestionBouteille implements GestionInterface<Bouteille> {

	@Autowired
	private IBouteilleRepository irep;

	@Override
	public void ajouter(Bouteille ele) {
		irep.save(ele);

	}

	@Override
	public void supprimer(int id) {
		irep.delete(irep.findOne(id));

	}

	@Override
	public void modifier(Bouteille ele) {
		irep.save(ele);

	}

	@Override
	public List<Bouteille> lister() {
		return irep.findAll();
	}

}
