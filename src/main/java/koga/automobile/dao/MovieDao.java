/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koga.automobile.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import koga.automobile.model.MovieModel;


@Repository
@Transactional
public class MovieDao {

	// An EntityManager will be automatically injected from entityManagerFactory
	// setup on DatabaseConfig class.
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * insert new record
	 *
	 * @param mm
	 */
	public void insertNewMovie(MovieModel mm) {
		entityManager.persist(mm);
		return;
	}

	/**
	 * get data by a condition (not key)
	 *
	 * @param year
	 * @return
	 */
	public MovieModel getByYear(Integer year) {
		MovieModel movieModel = new MovieModel();
		movieModel = (MovieModel) entityManager.createQuery("from MovieModel where year = :year")
				.setParameter("year", year).getSingleResult();
		return movieModel;
	}

	/**
	 * get all data
	 */
	public List<MovieModel> getAllMovie() {
		return entityManager.createQuery("from MovieModel").getResultList();
	}

	/**
	 * delete a item on the database
	 *
	 * @param model
	 */
	public void deleteMovie(MovieModel movieModel) {
		if (entityManager.contains(movieModel)) {
			entityManager.remove(movieModel);
		} else {
			entityManager.remove(entityManager.merge(movieModel));
		}
		return;
	}

	/**
	 * Return the user having the passed id.
	 */
	public MovieModel getById(long id) {
		return entityManager.find(MovieModel.class, id);
	}

	/**
	 * Update the passed user in the database.
	 */
	public void update(MovieModel movieModel) {
		entityManager.merge(movieModel);
		return;
	}
}
