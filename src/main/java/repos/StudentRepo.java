/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repos;

import com.client.gradeModule.domain.Student;
import org.springframework.data.repository.CrudRepository;
//import org.springframework.stereotype.Repository;

/**
 *
 * @author dkd
 */
//@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
    
}
