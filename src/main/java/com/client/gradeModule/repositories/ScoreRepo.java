/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.gradeModule.repositories;

import com.client.gradeModule.domain.Score;
import com.client.gradeModule.domain.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;

/**
 *
 * @author dkd
 */
//@Repository
public interface ScoreRepo extends CrudRepository<Score, Integer> {
//    Score getById(Long id);
    @Query("from Score a where a.student.id=:id")
    public Iterable<Score> findByStudentId(@Param("id") int id);
}
