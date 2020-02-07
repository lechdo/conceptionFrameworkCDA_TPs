package fr.eni.jpa.dao;

import java.util.ArrayList;
import java.util.List;

import fr.eni.jpa.bean.Actor;
import fr.eni.jpa.bean.Kind;
import fr.eni.jpa.bean.Movie;
import fr.eni.jpa.bean.Producer;
import fr.eni.jpa.exceptions.DAOException;

public class TestDAO {

	
	public static void main(String[] args) throws DAOException {
		
		GenericDao<Actor, Integer> adao = DAOFactory.getActorDAO();
		GenericDao<Producer, Integer> pdao = DAOFactory.getProducerDAO();
		GenericDao<Movie, Integer> mdao = DAOFactory.getMovieDAO();
		GenericDao<Kind, Integer> kdao = DAOFactory.getKindDAO();

		Actor a1 = new Actor("super", "man");
		
		adao.add(a1);
		
		
		
		System.out.println(adao.findAll().toString());
		System.out.println(adao.findById(1));
		
		Producer p1 = new Producer("albert", "Dupontel");
		pdao.add(p1);
		
		Kind k1 = new Kind("Action");
		
		kdao.add(k1);
		
		List<Actor> liste = new ArrayList<>();
		liste.add(a1);
		
		Movie m1 = new Movie("titre", 1988, 120, k1, p1, liste, "un film.", false);
		
		mdao.add(m1);
		
		
		
		
		
		
		
		System.out.println(mdao.findAll());
		
		mdao.closeConnection();
		
	}
}
