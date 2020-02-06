package fr.eni.jpa.tests.dal;

import org.junit.Test;

import fr.eni.jpa.dal.LivreDAO;
import fr.eni.jpa.entity.Livre;
import fr.eni.jpa.exceptions.DAOException;


public class LivreDAOtests {
	

	@Test
	public void testDAOAdd() throws DAOException {
		Livre livre = new Livre("auteur", "titre", 1);
		LivreDAO dao = new LivreDAO();
		dao.add(livre);
	}

	@Test
	public void testDeleteByObject() throws DAOException { 
		
		LivreDAO dao = new LivreDAO();
		Livre livre = dao.findById(1);
		dao.delete(livre);
	}

	@Test
	public void testDeleteByiD() throws DAOException {
		LivreDAO dao = new LivreDAO();
		Livre livre = new Livre("auteur", "titre", 1);
		dao.add(livre);
		dao.delete(livre.getId());
		
	}

}
