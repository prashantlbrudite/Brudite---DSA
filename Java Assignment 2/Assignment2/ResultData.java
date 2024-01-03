package Assignment2;

import java.sql.Struct;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;




public class ResultData {
    private List<Result> resultList;

    public ResultData() {
        this.resultList = new ArrayList<>();
    }


    public void addResult(Result result) {
        resultList.add(result);
    }


    public List<Result> getResultsByStudent(Student student) {
        List<Result> resultsByStudent = new ArrayList<>();
        for (Result result : resultList) {
            if (result.getStudent().equals(student)) {
                resultsByStudent.add(result);
            }
        }
        return resultsByStudent;
    }


    public void getBestStudent() {
        Map<Student,List<Integer>> mp = resultList.stream().collect(Collectors.groupingBy(Result::getStudent, Collectors.mapping(Result::getScore, Collectors.toList())));
        Integer maxMarks = 0;
        Student Best = new Student(0, null, null, 0);
        for(Student st : mp.keySet()){
            List<Integer> allMarks = mp.get(st);
            

            Integer marks = allMarks.stream().reduce(0, (x, y) -> x + y) / allMarks.size();

            if (marks > maxMarks) {
                maxMarks = marks;
                Best = st;
            }

        }
        System.out.println("The best student is " + Best.getName());
    }


    public void getSecondBestStudent() {
        Map<Student,List<Integer>> mp = resultList.stream().collect(Collectors.groupingBy(Result::getStudent, Collectors.mapping(Result::getScore, Collectors.toList())));
        Integer maxMarks = 0;
        Integer secondMaxMarks = 0;
        Student Best = new Student(0, null, null, 0);
        Student secondBest = new Student(0, null, null, 0);
        for(Student st : mp.keySet()){
            List<Integer> allMarks = mp.get(st);
            

            Integer marks = allMarks.stream().reduce(0, (x, y) -> x + y) / allMarks.size();

            if (marks > maxMarks) {
                secondMaxMarks = maxMarks;
                maxMarks = marks;
                secondBest = Best;
                Best = st;
            }
            else if(marks > secondMaxMarks){
                secondMaxMarks = marks;
                secondBest = st;
            }
            

        }
        System.out.println("The Second best student is " + secondBest.getName());
    }


    public void studentByRank(){
        Map<Student,List<Integer>> mp = resultList.stream().collect(Collectors.groupingBy(Result::getStudent, Collectors.mapping(Result::getScore, Collectors.toList())));

        TreeMap<Integer,String> tmap = new TreeMap<>();
        

        for(Student st : mp.keySet()){
            List<Integer> allMarks = mp.get(st);
            

            Integer marks = allMarks.stream().reduce(0, (x, y) -> x + y) / allMarks.size();

            tmap.put(marks, st.getName());
        }
        // System.out.println(tmap);
        NavigableMap<Integer, String> reverseMap = tmap.descendingMap();

        int count = 1;
        for(Integer marks :reverseMap.keySet()){
            System.out.println(count++ + ". "+ reverseMap.get(marks) + " with average of " + marks);
        }
    }


    public void getSpecificStudent(String name) {
        Map<Student,List<Result>> mp = resultList.stream().collect(Collectors.groupingBy(Result::getStudent, Collectors.toList()));

        for(Student st : mp.keySet()){
           if(st.getName() == name ){
            System.out.println(mp.get(st).toString());
           }
        }
        
    }


    public void badStudents(){
        Map<Student,List<Integer>> mp = resultList.stream().collect(Collectors.groupingBy(Result::getStudent, Collectors.mapping(Result::getScore, Collectors.toList())));

        List<String> badList = new ArrayList<>(); 

        for(Student st : mp.keySet()){
            List<Integer> allMarks = mp.get(st);
            

            Integer marks = allMarks.stream().reduce(0, (x, y) -> x + y) / allMarks.size();

            if(marks < 60){
                badList.add(st.getName());
            }
            

        }
        if(badList.size() == 0){
            System.out.println("No Student need Improvement");
            return;
        }
        System.out.println(badList);
    }


    public void getAllResults(){
         Map<Student,List<String>> mp = resultList.stream().collect(Collectors.groupingBy(Result::getStudent,Collectors.mapping(Result::toString, Collectors.toList())));

         for(Student st : mp.keySet()){
            System.out.print(st.getName()+" = " + mp.get(st));
         }
    }
    

    public void showResult(){

        for (Result result : resultList) {
      
            System.out.println(result.toString());
            
        }
       
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(resultList);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ResultData other = (ResultData) obj;
        return Objects.equals(resultList, other.resultList);
    }
}