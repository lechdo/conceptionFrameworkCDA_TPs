package fr.eni.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.mvc.bean.Movie;

public interface MovieDAO extends JpaRepository<Movie, Integer>{

}
