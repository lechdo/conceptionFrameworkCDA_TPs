package fr.eni.jpa.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.jpa.bo.Bouteille;



public interface IBouteilleRepository extends JpaRepository<Bouteille, Integer>{
	
	List<Bouteille> findAllByOrderByNomAsc();
}
