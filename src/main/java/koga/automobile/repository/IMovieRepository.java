/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koga.automobile.repository;

import koga.automobile.model.MovieModel;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface IMovieRepository extends CrudRepository<MovieModel, Long> {
	List<MovieModel> findByYearLessThan(Integer year);

}
