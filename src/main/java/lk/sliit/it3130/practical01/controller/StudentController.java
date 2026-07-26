package lk.sliit.it3130.practical01.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lk.sliit.it3130.practical01.model.Student;
import lk.sliit.it3130.practical01.service.StudentService;

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/students")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/api/greeting")
    public String greeting(@RequestParam(defaultValue = "Student") String name) {
        return "Hello " + name + ", welcome to Spring Boot!";
    }
   @GetMapping("/api/module")
   public String module() {
    return "IT3130 - Application Development";
}
}