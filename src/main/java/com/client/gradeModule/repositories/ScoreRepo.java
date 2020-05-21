/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client.gradeModule.repositories;

import com.client.gradeModule.domain.Score;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author dkd
 */
public interface ScoreRepo extends CrudRepository<Score, Integer> {
}
