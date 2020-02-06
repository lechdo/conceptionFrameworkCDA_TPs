package fr.eni.jpa.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import fr.eni.jpa.entity.Livre;
import fr.eni.jpa.exceptions.DAOException;

public class LivreDAO {
	private EntityManager em = DAOUtil.getEm();

	public void add(Livre livre) throws DAOException {
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.persist(livre);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
	}

	public void delete(Livre livre) throws DAOException {
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.remove(livre);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
	}

	public void update(Livre livre) throws DAOException {
		EntityTransaction et = em.getTransaction();
		et.begin();

		try {
			em.merge(livre);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
	}

	public void delete(int id) throws DAOException {
		Livre livre = findById(id);
		delete(livre);

	}

	public Livre findById(int id) {
		return DAOUtil.getEm().find(Livre.class, id);
	}

	public List<Livre> findAll() {
		// select non obligatoire, info dev pour insister sur le fait qu'on retourne un
		// object java
		String request = "select Object(l) from Livre l";
		return DAOUtil.getEm().createQuery(request, Livre.class).getResultList();
	}

	public List<Livre> findAllOrderByTitreDesc() {
		TypedQuery<Livre> query = DAOUtil.getEm().createQuery("select Object(l) from Livre l order by l.id desc",
				Livre.class);
		return query.getResultList();
	}

	public List<Livre> findAllOrderByTitreAsc() {
		TypedQuery<Livre> query = DAOUtil.getEm().createQuery("select Object(l) from Livre l order by l.id asc",
				Livre.class);
		return query.getResultList();
	}

	public int getMaxId() {
		// TODO Auto-generated method stub
		TypedQuery<Integer> query = DAOUtil.getEm().createQuery("select max(l.id) from Livre l", Integer.class);
		return query.getSingleResult();
	}
	
	public int getMinId() {
		// TODO Auto-generated method stub
		TypedQuery<Integer> query = DAOUtil.getEm().createQuery("select min(l.id) from Livre l", Integer.class);
		return query.getSingleResult();
	}
}
