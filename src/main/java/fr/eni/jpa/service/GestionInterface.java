package fr.eni.jpa.service;

import java.util.List;

public interface GestionInterface<T> {

	void ajouter(T ele);

	void supprimer(int id);

	void modifier(T ele);

	List<T> lister();
	
	T recuperer(int id);

}
