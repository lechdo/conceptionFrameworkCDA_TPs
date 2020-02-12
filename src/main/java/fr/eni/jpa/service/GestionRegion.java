package fr.eni.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.eni.jpa.bo.Region;
import fr.eni.jpa.dal.IRegionRepository;

@Service(value = "gestionRegion")
public class GestionRegion implements GestionInterface<Region> {

	@Autowired
	private IRegionRepository irep;

	@Override
	public void ajouter(Region ele) {
		irep.save(ele);

	}

	@Override
	public void supprimer(int id) {
		irep.delete(irep.findOne(id));

	}

	@Override
	public void modifier(Region ele) {
		irep.save(ele);

	}

	@Override
	public List<Region> lister() {
		return irep.findAll();
	}

	@Override
	public Region recuperer(int id) {
		return irep.findOne(id);
	}

}
