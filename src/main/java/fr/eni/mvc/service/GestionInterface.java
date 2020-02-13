package fr.eni.mvc.service;

import java.util.List;

public interface GestionInterface<T> {

	void ajouter(T ele);

	void supprimer(T ele);

	void modifier(T ele);

	List<T> lister();

	T trouver(int id);
}
