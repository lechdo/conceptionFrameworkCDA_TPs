package fr.eni.jpa.dao;

import fr.eni.jpa.bean.Actor;
import fr.eni.jpa.bean.Kind;
import fr.eni.jpa.bean.Movie;
import fr.eni.jpa.bean.Producer;

public class DAOFactory {
	
	public static GenericDaoImpl<Actor, Integer> getActorDAO() {
		return new GenericDaoImpl<>(Actor.class);
	}
	
	public static GenericDaoImpl<Kind, Integer> getKindDAO() {
		return new GenericDaoImpl<>(Kind.class);
	}
	
	public static GenericDaoImpl<Producer, Integer> getProducerDAO() {
		return new GenericDaoImpl<>(Producer.class);
	}
	
	public static GenericDaoImpl<Movie, Integer> getMovieDAO() {
		return new GenericDaoImpl<>(Movie.class);
	}
	
	
}
