package Assignment2;

import java.time.LocalDate;
import java.util.*;

class Main {
    public static void main(String[] args) {

        // 10 Student Objects.
        Student prahant = new Student(1, "Prashant", "prashantlalwani8289@gmail.com", 8383485);

        Student rohan = new Student(2, "Rohan", "rohan@gmail.com", 1234567);

        Student student3 = new Student(3, "Name3", "email3@example.com", 2345678);

        Student student4 = new Student(4, "Name4", "email4@example.com", 3456789);

        Student student5 = new Student(5, "Name5", "email5@example.com", 4567890);

        Student student6 = new Student(6, "Name6", "email6@example.com", 5678901);

        Student student7 = new Student(7, "Name7", "email7@example.com", 6789012);

        Student student8 = new Student(8, "Name8", "email8@example.com", 7890123);

        Student student9 = new Student(9, "Name9", "email9@example.com", 8901234);

        Student student10 = new Student(10, "Name10", "email10@example.com", 9876543);

        // 5 Techstacks Objects

        TechStack java = new TechStack(1, "Java", "A widely used programming language");

        TechStack python = new TechStack(2, "Python", "Known for its simplicity and readability");

        TechStack javascript = new TechStack(3, "JavaScript", "Used for web development");

        TechStack cpp = new TechStack(4, "C++", "Commonly used in system software");

        TechStack swift = new TechStack(5, "Swift", "Developed by Apple for iOS/macOS apps");

        // 3 Trainer Objects

        List<TechStack> trainer1TechStacks = new ArrayList<>();
        trainer1TechStacks.add(java);
        trainer1TechStacks.add(python);

        Trainer rituMam = new Trainer(1, "Ritu Mam", "ritumam@gmail.com", 1234567890L, trainer1TechStacks);

        List<TechStack> trainer2TechStacks = new ArrayList<>();
        trainer2TechStacks.add(python);
        trainer2TechStacks.add(javascript);

        Trainer hrideshSir = new Trainer(2, "Hridesh Sir", "hrideshsir@gmail.com", 9876543210L, trainer2TechStacks);

        List<TechStack> trainer3TechStacks = new ArrayList<>();
        trainer3TechStacks.add(swift);

        Trainer namanSir = new Trainer(3, "Naman Sir", "namamsir@gmail.com", 5555555555L, trainer3TechStacks);

        // 16 answer objects.

        Answer answer1 = new Answer(1, "Option A");

        Answer answer2 = new Answer(2, "Option B");

        Answer answer3 = new Answer(3, "Option C");

        Answer answer4 = new Answer(4, "Option D");

        Answer answer5 = new Answer(5, "Option A");

        Answer answer6 = new Answer(6, "Option A");

        Answer answer7 = new Answer(7, "Option A");

        Answer answer8 = new Answer(8, "Option A");

        Answer answer9 = new Answer(9, "Option A");

        Answer answer10 = new Answer(10, "Option A");

        Answer answer11 = new Answer(11, "Option A");

        Answer answer12 = new Answer(12, "Option A");

        Answer answer13 = new Answer(13, "Option A");

        Answer answer14 = new Answer(14, "Option A");

        Answer answer15 = new Answer(15, "Option A");

        Answer answer16 = new Answer(16, "Option A");

        // String AnswerKey
        String[] anskey = { "1. Options A", "2. Options B", "3. Options C", "4. Options D", "5. Options A",
                "6. Options A", "7. Options A", "8. Options A", "9. Options A", "10. Options A", "11. Options A",
                "12. Options A", "13. Options A", "14. Options A", "15. Options A", "16. Options A" };

        // 16 Question Objects

        Question q1 = new Question(1, answer1, anskey, 1, 1, 1);

        Question q2 = new Question(1, answer2, anskey, 1, 2, 1);

        Question q3 = new Question(3, answer3, anskey, 1, 3, 1);

        Question q4 = new Question(4, answer4, anskey, 1, 4, 1);

        Question q5 = new Question(5, answer5, anskey, 1, 5, 2);

        Question q6 = new Question(6, answer6, anskey, 1, 1, 2);

        Question q7 = new Question(7, answer7, anskey, 1, 2, 2);

        Question q8 = new Question(8, answer8, anskey, 1, 3, 2);

        Question q9 = new Question(9, answer9, anskey, 1, 4, 3);

        Question q10 = new Question(10, answer10, anskey, 1, 5, 3);

        Question q11 = new Question(11, answer11, anskey, 1, 1, 3);

        Question q12 = new Question(12, answer12, anskey, 1, 2, 3);

        Question q13 = new Question(13, answer13, anskey, 1, 3, 4);

        Question q14 = new Question(14, answer14, anskey, 1, 4, 4);

        Question q15 = new Question(15, answer15, anskey, 1, 5, 4);

        Question q16 = new Question(16, answer16, anskey, 1, 1, 4);


        // Creating the question list

        List<Question> questionList1 = Arrays.asList(q1, q2, q3, q4);
        List<Question> questionList2 = Arrays.asList(q5, q6, q7, q8);
        List<Question> questionList3 = Arrays.asList(q9, q10, q11, q12);
        List<Question> questionList4 = Arrays.asList(q13, q14, q15, q16);


        // Assigning these question list to 4 Assignment Objects


        Assignment assignment1 = new Assignment(1, "Assignment1", "For improving programming Skills",LocalDate.of(2024, 1, 14), questionList1);
        Assignment assignment2 = new Assignment(2, "Assignment2", "For improving programming Skills",LocalDate.of(2024, 1, 14), questionList2);
        Assignment assignment3 = new Assignment(3, "Assignment3", "For improving programming Skills",LocalDate.of(2024, 1, 14), questionList3);
        Assignment assignment4 = new Assignment(4, "Assignment4", "For improving programming Skills",LocalDate.of(2024, 1, 14), questionList4);


        // Creating the results and assigning them the assignment for the students for Rohan and Prashant.


        Result prashantResult = new Result(1, prahant, assignment1, rituMam, 90, "Nice", LocalDate.of(2024, 1, 11));

        Result prashantResult2 = new Result(2, prahant, assignment3, namanSir, 80, "Good", LocalDate.of(2024, 1, 12));

        Result rohanResult = new Result(2, rohan, assignment2, rituMam, 100, "Great", LocalDate.of(2024, 1, 10));

        Result rohanResult2 = new Result(2, rohan, assignment4, hrideshSir, 100, "Great", LocalDate.of(2024, 1, 9));


        // Creating the ResultData for performing the operations.


        ResultData resultData = new ResultData();

        resultData.addResult(rohanResult2);
        resultData.addResult(prashantResult);
        resultData.addResult(prashantResult2);
        resultData.addResult(rohanResult);

        // printing the result data.
        // resultData.showResult();




        // Methods to be performed given in the Jira Ticket.


        // 1. Method to find the highest performing student.
        // resultData.getBestStudent();

        // 2. Method to find the second highest performing Student
        // resultData.getSecondBestStudent();

        // 3. Method to find the overall ranking of Students by Score:
        // resultData.studentByRank();

        // 4. Get all the Students who need improvement and scored less than 60%.
        // resultData.badStudents();

        // 5. Get Specific Student by name
        // resultData.getSpecificStudent("Prashant"); // for Rohan Type Rohan

        // 6. Get Student Result in Group
        // resultData.getAllResults();


       List<String> str = resultData.getResultsByStudent(prahant);
       System.out.println(str);
    





















    }
}