package lk.sliit.it3130.practical01.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lk.sliit.it3130.practical01.model.Student;

@Service
public class StudentService {

    public List<Student> getAllStudents() {
        return List.of(
                new Student("IT24103953", "Sivaganka Sivaneswaran", "Information Technology", "Year 3"),
                new Student("IT22106353", "Karunika Sivaneswaren", "Software Engineering", "Year 3"),
                new Student("IT241004048", "Dilani Kapilan", "Data Science", "Year 3")
        );
    }
}