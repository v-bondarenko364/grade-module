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
//    public String add(@RequestParam String name, Map<String, Object> model) {
//        Student student = new Student(name);
//        studentRepo.save(student);
//        
//        Iterable<Student> students = studentRepo.findAll();
//        model.put("students", students);
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




