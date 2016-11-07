/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koga.automobile.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import koga.automobile.model.CanDetailDataModel;

public interface ICanDetailDataRepository extends CrudRepository<CanDetailDataModel, Long> {
	
	List<CanDetailDataModel> findByDrivingTimeLessThan(Integer drivingTime);
	List<CanDetailDataModel> findByTestId(String testId);

}
