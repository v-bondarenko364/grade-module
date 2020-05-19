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
class DemoCommandLineRunner implements CommandLineRunner {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private ScoreRepo scoreRepo;

    @Override
    public void run(String... args) throws Exception {

        Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();

        if (studentRepo.count() == 0) {
            // insert students
//            Student firstStudent = new Student();
            firstStudent.setName("Sanya");
            studentRepo.save(firstStudent);

//            Student secondStudent = new Student();
            secondStudent.setName("Pasha");
            studentRepo.save(secondStudent);

//            Student thirdStudent = new Student();
            thirdStudent.setName("Olya");
            studentRepo.save(thirdStudent);
        }

        if (scoreRepo.count() == 0) {
            // insert scores
            Score firstStudentFirstScore = new Score();
            firstStudentFirstScore.setAssessment(4);
            firstStudent.getId();
            firstStudentFirstScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentFirstScore);
            //2
            Score firstStudentSecondScore = new Score();
            firstStudentSecondScore.setAssessment(3);
            firstStudent.getId();
            firstStudentSecondScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentSecondScore);
            //3
            Score firstStudentThirdScore = new Score();
            firstStudentThirdScore.setAssessment(5);
            firstStudent.getId();
            firstStudentThirdScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentThirdScore);
            //4
            Score firstStudentFourScore = new Score();
            firstStudentFourScore.setAssessment(3);
            firstStudent.getId();
            firstStudentFourScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentFourScore);
            //5
            Score firstStudentFiveScore = new Score();
            firstStudentFiveScore.setAssessment(4);
            firstStudent.getId();
            firstStudentFiveScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentFiveScore);
            //6
            Score firstStudentSixScore = new Score();
            firstStudentSixScore.setAssessment(5);
            firstStudent.getId();
            firstStudentSixScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentSixScore);
            //7
            Score firstStudentSevenScore = new Score();
            firstStudentSevenScore.setAssessment(4);
            firstStudent.getId();
            firstStudentSevenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentSevenScore);
            //8
            Score firstStudentEightScore = new Score();
            firstStudentEightScore.setAssessment(3);
            firstStudent.getId();
            firstStudentEightScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentEightScore);
            //9
            Score firstStudentNineScore = new Score();
            firstStudentNineScore.setAssessment(2);
            firstStudent.getId();
            firstStudentNineScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentNineScore);
            //10
            Score firstStudentTenScore = new Score();
            firstStudentTenScore.setAssessment(5);
            firstStudent.getId();
            firstStudentTenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentTenScore);

            // second scores
            Score secondStudentFirstScore = new Score();
            secondStudentFirstScore.setAssessment(4);
            secondStudent.getId();
            secondStudentFirstScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentFirstScore);
            //2
            Score secondStudentSecondScore = new Score();
            secondStudentSecondScore.setAssessment(2);
            secondStudent.getId();
            secondStudentSecondScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentSecondScore);
            //3
            Score secondStudentThirdScore = new Score();
            secondStudentThirdScore.setAssessment(5);
            secondStudent.getId();
            secondStudentThirdScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentThirdScore);
            //4
            Score secondStudentFourScore = new Score();
            secondStudentFourScore.setAssessment(3);
            secondStudent.getId();
            secondStudentFourScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentFourScore);
            //5
            Score secondStudentFiveScore = new Score();
            secondStudentFiveScore.setAssessment(4);
            secondStudent.getId();
            secondStudentFiveScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentFiveScore);
            //6
            Score secondStudentSixScore = new Score();
            secondStudentSixScore.setAssessment(5);
            secondStudent.getId();
            secondStudentSixScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentSixScore);
            //7
            Score secondStudentSevenScore = new Score();
            secondStudentSevenScore.setAssessment(3);
            secondStudent.getId();
            secondStudentSevenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentSevenScore);
            //8
            Score secondStudentEightScore = new Score();
            secondStudentEightScore.setAssessment(5);
            secondStudent.getId();
            secondStudentEightScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentEightScore);
            //9
            Score secondStudentNineScore = new Score();
            secondStudentNineScore.setAssessment(5);
            secondStudent.getId();
            secondStudentNineScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentNineScore);
            //10
            Score secondStudentTenScore = new Score();
            secondStudentTenScore.setAssessment(4);
            secondStudent.getId();
            secondStudentTenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentTenScore);

            // third scores
            Score thirdStudentFirstScore = new Score();
            thirdStudentFirstScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentFirstScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentFirstScore);
            //2
            Score thirdStudentSecondScore = new Score();
            thirdStudentSecondScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentSecondScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentSecondScore);
            //3
            Score thirdStudentThirdScore = new Score();
            thirdStudentThirdScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentThirdScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentThirdScore);
            //4
            Score thirdStudentFourScore = new Score();
            thirdStudentFourScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentFourScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentFourScore);
            //5
            Score thirdStudentFiveScore = new Score();
            thirdStudentFiveScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentFiveScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentFiveScore);
            //6
            Score thirdStudentSixScore = new Score();
            thirdStudentSixScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentSixScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentSixScore);
            //7
            Score thirdStudentSevenScore = new Score();
            thirdStudentSevenScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentSevenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentSevenScore);
            //8
            Score thirdStudentEightScore = new Score();
            thirdStudentEightScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentEightScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentEightScore);
            //9
            Score thirdStudentNineScore = new Score();
            thirdStudentNineScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentNineScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentNineScore);
            //10
            Score thirdStudentTenScore = new Score();
            thirdStudentTenScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentTenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentTenScore);
        }
    }

}
