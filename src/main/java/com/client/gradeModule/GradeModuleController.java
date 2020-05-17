package com.client.gradeModule;

import com.client.gradeModule.domain.Score;
import com.client.gradeModule.domain.Student;
import com.client.gradeModule.repositories.ScoreRepo;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.client.gradeModule.repositories.StudentRepo;
import java.util.HashMap;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        
        model.put("students", students);
        
        return "main";
    }
    
    // update assessment
//    @RequestMapping(method=RequestMethod.PUT, value="/{id}")
//    public void updateScore(@RequestBody Score score, @PathVariable String id) {
//        Iterable<Score> score = scoreRepo.findById(Integer id);
//        
//        model.put("score", score);
//        
//        return "main";
//    }
    
    
//    @GetMapping("/")
//    public String get(Map<String, Object> model) {
//        Iterable<Score> score = studentRepo.findAll();
//        
//        model.put("students", students);
//        
//        return "main";
//    }
    
    
    // get all assessment with students
//    @GetMapping("/")
//    public String main(Map<String, Object> model) {
//        Iterable<Score> scores = scoreRepo.findAll();
//        
//        model.put("scores", scores);
//        
//
//        return "main";
//    }
    
    
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




