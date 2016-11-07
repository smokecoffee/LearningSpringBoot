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

import koga.automobile.model.CanDetailDataModel;


@Repository
@Transactional
public class CanDetailDataDao {

	// An EntityManager will be automatically injected from entityManagerFactory
	// setup on DatabaseConfig class.
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * insert new record
	 *
	 * @param mm
	 */
	public void insertNew(CanDetailDataModel mm) {
		entityManager.persist(mm);
		return;
	}

	/**
	 * get data by a condition (not key)
	 *
	 * @param year
	 * @return
	 */
	public CanDetailDataModel doSomething(Integer drivingTime) {
		CanDetailDataModel canDetailDataModel = new CanDetailDataModel();
		canDetailDataModel = (CanDetailDataModel) entityManager.createQuery("from CanDetailDataModel where drivingTime = :drivingTime")
				.setParameter("drivingTime", drivingTime).getSingleResult();
		return canDetailDataModel;
	}

	/**
	 * get all data
	 */
	@SuppressWarnings("unchecked")
	public List<CanDetailDataModel> getAll() {
		return entityManager.createQuery("from CanDetailDataModel").getResultList();
	}

	/**
	 * delete a item on the database
	 *
	 * @param model
	 */
	public void delete(CanDetailDataModel canDetailDataModel) {
		if (entityManager.contains(canDetailDataModel)) {
			entityManager.remove(canDetailDataModel);
		} else {
			entityManager.remove(entityManager.merge(canDetailDataModel));
		}
		return;
	}

	/**
	 * Return the user having the passed id.
	 */
	public CanDetailDataModel getById(long id) {
		return entityManager.find(CanDetailDataModel.class, id);
	}

	/**
	 * Update the passed user in the database.
	 */
	public void update(CanDetailDataModel canDetailDataModel) {
		entityManager.merge(canDetailDataModel);
		return;
	}
}
