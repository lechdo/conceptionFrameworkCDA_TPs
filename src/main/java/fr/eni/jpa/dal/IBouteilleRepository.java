package fr.eni.jpa.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.jpa.bo.Bouteille;



public interface IBouteilleRepository extends JpaRepository<Bouteille, Integer>{
	

}
