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
            firstStudent.setName("Olexander");
            studentRepo.save(firstStudent);

            secondStudent.setName("Pavel");
            studentRepo.save(secondStudent);
            
            thirdStudent.setName("Diana");
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
            //11
            Score firstStudentElevenScore = new Score();
            firstStudentElevenScore.setAssessment(4);
            firstStudent.getId();
            firstStudentElevenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentElevenScore);
            //12
            Score firstStudentTwelveScore = new Score();
            firstStudentTwelveScore.setAssessment(5);
            firstStudent.getId();
            firstStudentTwelveScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentTwelveScore);
            //13
            Score firstStudentThirteenScore = new Score();
            firstStudentThirteenScore.setAssessment(3);
            firstStudent.getId();
            firstStudentThirteenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentThirteenScore);
            //14
            Score firstStudentFourteenScore = new Score();
            firstStudentFourteenScore.setAssessment(3);
            firstStudent.getId();
            firstStudentFourteenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentFourteenScore);
            //15
            Score firstStudentFifteenScore = new Score();
            firstStudentFifteenScore.setAssessment(3);
            firstStudent.getId();
            firstStudentFifteenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentFifteenScore);
            //16
            Score firstStudentSixteenScore = new Score();
            firstStudentSixteenScore.setAssessment(5);
            firstStudent.getId();
            firstStudentSixteenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentSixteenScore);
            //17
            Score firstStudentSeventeenScore = new Score();
            firstStudentSeventeenScore.setAssessment(4);
            firstStudent.getId();
            firstStudentSeventeenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentSeventeenScore);
            //18
            Score firstStudentEighteenScore = new Score();
            firstStudentEighteenScore.setAssessment(4);
            firstStudent.getId();
            firstStudentEighteenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentEighteenScore);
            //19
            Score firstStudentNineteenScore = new Score();
            firstStudentNineteenScore.setAssessment(5);
            firstStudent.getId();
            firstStudentNineteenScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentNineteenScore);
            //20
            Score firstStudentTwentScore = new Score();
            firstStudentTwentScore.setAssessment(3);
            firstStudent.getId();
            firstStudentTwentScore.setStudent(firstStudent);
            scoreRepo.save(firstStudentTwentScore);

            
            // scores for second student
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
            //11
            Score secondStudentElevenScore = new Score();
            secondStudentElevenScore.setAssessment(5);
            secondStudent.getId();
            secondStudentElevenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentElevenScore);
            //12
            Score secondStudentTwelveScore = new Score();
            secondStudentTwelveScore.setAssessment(5);
            secondStudent.getId();
            secondStudentTwelveScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentTwelveScore);
            //13
            Score secondStudentThirteenScore = new Score();
            secondStudentThirteenScore.setAssessment(5);
            secondStudent.getId();
            secondStudentThirteenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentThirteenScore);
            //14
            Score secondStudentFourteenScore = new Score();
            secondStudentFourteenScore.setAssessment(4);
            secondStudent.getId();
            secondStudentFourteenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentFourteenScore);
            //15
            Score secondStudentFifteenScore = new Score();
            secondStudentFifteenScore.setAssessment(3);
            secondStudent.getId();
            secondStudentFifteenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentFifteenScore);
            //16
            Score secondStudentSixteenScore = new Score();
            secondStudentSixteenScore.setAssessment(4);
            secondStudent.getId();
            secondStudentSixteenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentSixteenScore);
            //17
            Score secondStudentSeventeenScore = new Score();
            secondStudentSeventeenScore.setAssessment(5);
            secondStudent.getId();
            secondStudentSeventeenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentSeventeenScore);
            //18
            Score secondStudentEighteenScore = new Score();
            secondStudentEighteenScore.setAssessment(5);
            secondStudent.getId();
            secondStudentEighteenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentEighteenScore);
            //19
            Score secondStudentNineteenScore = new Score();
            secondStudentNineteenScore.setAssessment(5);
            secondStudent.getId();
            secondStudentNineteenScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentNineteenScore);
            //20
            Score secondStudentTwentyScore = new Score();
            secondStudentTwentyScore.setAssessment(4);
            secondStudent.getId();
            secondStudentTwentyScore.setStudent(secondStudent);
            scoreRepo.save(secondStudentTwentyScore);

            
            // scores for thrird student
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
            thirdStudentTenScore.setAssessment(5);
            thirdStudent.getId();
            thirdStudentTenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentTenScore);
            //11
            Score thirdStudentElevenScore = new Score();
            thirdStudentElevenScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentElevenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentElevenScore);
            //12
            Score thirdStudentTwelveScore = new Score();
            thirdStudentTwelveScore.setAssessment(3);
            thirdStudent.getId();
            thirdStudentTwelveScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentTwelveScore);
            //13
            Score thirdStudentThirteenScore = new Score();
            thirdStudentThirteenScore.setAssessment(5);
            thirdStudent.getId();
            thirdStudentThirteenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentThirteenScore);
            //14
            Score thirdStudentFourteenScore = new Score();
            thirdStudentFourteenScore.setAssessment(5);
            thirdStudent.getId();
            thirdStudentFourteenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentFourteenScore);
            //15
            Score thirdStudentFifteenScore = new Score();
            thirdStudentFifteenScore.setAssessment(3);
            thirdStudent.getId();
            thirdStudentFifteenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentFifteenScore);
            //16
            Score thirdStudentSixteenScore = new Score();
            thirdStudentSixteenScore.setAssessment(4);
            thirdStudent.getId();
            thirdStudentSixteenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentSixteenScore);
            //17
            Score thirdStudentSeventeenScore = new Score();
            thirdStudentSeventeenScore.setAssessment(5);
            thirdStudent.getId();
            thirdStudentSeventeenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentSeventeenScore);
            //18
            Score thirdStudentEighteenScore = new Score();
            thirdStudentEighteenScore.setAssessment(5);
            thirdStudent.getId();
            thirdStudentEighteenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentEighteenScore);
            //19
            Score thirdStudentNineteenScore = new Score();
            thirdStudentNineteenScore.setAssessment(3);
            thirdStudent.getId();
            thirdStudentNineteenScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentNineteenScore);
            //20
            Score thirdStudentTwentyScore = new Score();
            thirdStudentTwentyScore.setAssessment(3);
            thirdStudent.getId();
            thirdStudentTwentyScore.setStudent(thirdStudent);
            scoreRepo.save(thirdStudentTwentyScore);
        }
    }

}
