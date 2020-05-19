package com.client.gradeModule;

import com.client.gradeModule.domain.Student;
import com.client.gradeModule.domain.Score;
import com.client.gradeModule.repositories.ScoreRepo;
import com.client.gradeModule.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class GradeModuleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradeModuleApplication.class, args);
    }

}

@Component
class DemoCommandLineRunner  implements CommandLineRunner {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private ScoreRepo scoreRepo;

    @Override
    public void run(String... args) throws Exception {

        // insert students
        Student firstStudent = new Student();
        firstStudent.setId(1);
        firstStudent.setName("Sanya");
        studentRepo.save(firstStudent);

        Student secondStudent = new Student();
        secondStudent.setId(2);
        secondStudent.setName("Pasha");
        studentRepo.save(secondStudent);

        Student thirdStudent = new Student();
        thirdStudent.setId(3);
        thirdStudent.setName("Olya");
        studentRepo.save(thirdStudent);

        // insert scores
//        Score firstScore = new Score();
//        firstScore.setId(1);
//        firstScore.setAssessment(3);
//        firstScore.setStudent(firstStudent);
//        scoreRepo.save(firstScore);
//
//        Score secondScore = new Score();
//        secondScore.setId(2);
//        secondScore.setAssessment(4);
//        firstStudent.getScore().add(secondScore);
//        secondScore.setStudent(secondStudent);
//        scoreRepo.save(secondScore);
//
//        Score thirdScore = new Score();
//        thirdScore.setId(3);
//        thirdScore.setAssessment(5);
//        firstStudent.getScore().add(thirdScore);
//        thirdScore.setStudent(thirdStudent);
//        scoreRepo.save(thirdScore);
    }
    
}
