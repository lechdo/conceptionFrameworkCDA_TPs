package fr.eni.ecole.demo.dal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DAO<T> extends JpaRepository<T, Integer>{
	

}
