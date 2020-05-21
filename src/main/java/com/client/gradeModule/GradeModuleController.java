package com.client.gradeModule;

import com.client.gradeModule.domain.Score;
import com.client.gradeModule.domain.Student;
import com.client.gradeModule.repositories.ScoreRepo;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Response updateScore(Integer id, Integer assessment) {
        Score score = scoreRepo.findById(id).get();
        score.setAssessment(assessment);

        scoreRepo.save(score);

        return Response
                .status(Response.Status.OK)
                .entity(score)
                .build();
    }

//    // for create new students
//    @PostMapping
//    public String add(@RequestParam String assessment, Map<String, Object> model) {
//        Score score = new Score(assessment);
//        scoreRepo.save(score);
//
//        Iterable<Score> score = scoreRepo.findAll();
//        model.put("score", score);
//
//        return "main";
//    }
    // for filter sdut info
//    @PostMapping("filter") // for filter on the form
//    public String filter(@RequestParam String filter, Map<String, Object> model) {
//        List<Student> students = studentRepo.findByName(filter);
//
//        model.put("students", students);
//
//        return "main";
//    }
}
