package fr.eni.jpa.main;

import fr.eni.jpa.dal.LivreDAO;
import fr.eni.jpa.entity.Livre;
import fr.eni.jpa.exceptions.DAOException;

public class TestLivre {

	public static void main(String[] args) {

		Livre l1 = new Livre("la bete humaine", "emile zola", 450);
		Livre l2 = new Livre("huit clos", "JP Sartres", 350);
		Livre l3 = new Livre("l'étranger", "albert camus", 476);
		Livre l4 = new Livre("la peste", "albert camus", 276);

		LivreDAO ldao = new LivreDAO();

		try {
			ldao.add(l1);
			ldao.add(l2);
			ldao.add(l3);
			ldao.add(l4);

			System.out.println("Liste des Livres : ");
			System.out.println(ldao.findAll());
			System.out.println("Ordre ascendant :");
			System.out.println(ldao.findAllOrderByTitreAsc());
			System.out.println("Ordre descendant :");
			System.out.println(ldao.findAllOrderByTitreDesc());

			System.out.println("Max id : " + ldao.getMaxId());
			System.out.println("Min id : " + ldao.getMinId());
			
			ldao.delete(1);
			ldao.delete(l2);
			
			System.out.println("Suppression id et objet :");
			System.out.println(ldao.findAll());
			
			System.out.println("Id 22 (non existant) : " + ldao.findById(22));

		} catch (DAOException e) {
			e.printStackTrace();
		}
	}
}
