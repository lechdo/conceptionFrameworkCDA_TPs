package fr.eni.jpa.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.jpa.bo.Couleur;



public interface ICouleurRepository extends JpaRepository<Couleur, Integer> {	

}
