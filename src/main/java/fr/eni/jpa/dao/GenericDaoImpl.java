package fr.eni.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.eni.jpa.exceptions.DAOException;

public class GenericDaoImpl<T> implements GenericDao<T> {
	protected Class<T> entityClass;

	@Override
	public void add(T obj) throws DAOException {
		EntityManager em = DAOUtil.getEm();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			em.persist(obj);
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
		et.commit();
	}

	@Override
	public void update(T obj) throws DAOException {
		EntityManager em = DAOUtil.getEm();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			em.merge(obj);
		} catch (Exception e) {
			et.rollback();
			throw e;
		}

		et.commit();
	}

	@Override
	public T findById(int id) throws DAOException {
		return DAOUtil.getEm().find(entityClass, id);
	}

	@Override
	public List<T> findAll() throws DAOException {
		StringBuffer sb = new StringBuffer();
		sb.append("select from ");
		sb.append(entityClass.getName());
		sb.append(" o");
		String request = sb.toString();
		return DAOUtil.getEm().createQuery(request, entityClass).getResultList();
	}

	@Override
	public void delete(T obj) throws DAOException {
		EntityManager em = DAOUtil.getEm();
		EntityTransaction et = em.getTransaction();

		try {
			et.begin();
			em.remove(obj);
		} catch (Exception e) {
			et.rollback();
			throw e;
		}
		et.commit();
	}

}
