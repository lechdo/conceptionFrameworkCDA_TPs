package fr.eni.jpa.dao;

import java.util.List;

import fr.eni.jpa.exceptions.DAOException;

public interface GenericDao<T> {

	public void add(T obj) throws DAOException;

	public void update(T obj) throws DAOException;

	public T findById(int id) throws DAOException;

	public List<T> findAll() throws DAOException;

	public void delete(T obj) throws DAOException;
}
