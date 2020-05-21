package com.client.gradeModule;

import com.client.gradeModule.domain.Score;
import com.client.gradeModule.domain.Student;
import com.client.gradeModule.repositories.ScoreRepo;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.client.gradeModule.repositories.StudentRepo;
import javax.ws.rs.core.Response;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GradeModuleController {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private ScoreRepo scoreRepo;

    // get all students
    @GetMapping("/")
    public String main(Map<String, Object> model) {
        Iterable<Student> students = studentRepo.findAll();
        for (Student student : students) {
            student.getScore().sort((c1, c2) -> {
                return c2.getId() - c1.getId();
            });
        }

        model.put("students", students);

        return "main";
    }

    // update assessment
    @RequestMapping("/score/")
    public ResponseEntity<String> updateScore(Integer id, Integer assessment) {
        Score score = scoreRepo.findById(id).get();
        score.setAssessment(assessment);

        scoreRepo.save(score);

        return ResponseEntity.status(204).body("Updated");
    }
}
