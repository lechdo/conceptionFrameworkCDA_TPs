package fr.eni.jpa.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.eni.jpa.bo.Region;


@Repository
public interface IRegionRepository extends JpaRepository<Region, Integer> {

}
