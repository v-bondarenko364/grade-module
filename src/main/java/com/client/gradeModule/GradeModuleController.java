package com.client.gradeModule;

import com.client.gradeModule.domain.Student;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repos.StudentRepo;

@Controller
public class GradeModuleController {
    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/")
    public String main(Map<String, Object> model) {
        Iterable<Student> students = studentRepo.findAll();
        
        model.put("students", students);
        
        return "main";
    }
    
    // for edit and post new info to table
    @PostMapping
    public String add(@RequestParam String name, Map<String, Object> model) {
        Student student = new Student(name);
        studentRepo.save(student);
        
        Iterable<Student> students = studentRepo.findAll();
        model.put("students", students);
        
        return "main";
    }

}




