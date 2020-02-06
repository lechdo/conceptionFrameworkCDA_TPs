package fr.eni.jpa.dao;

import java.util.List;

import fr.eni.jpa.exceptions.DAOException;

public interface GenericDao<T, U> {

	public void add(T obj) throws DAOException;

	public void update(T obj) throws DAOException;

	public T findById(U identifier) throws DAOException;

	public List<T> findAll() throws DAOException;

	public void delete(T obj) throws DAOException;
}
