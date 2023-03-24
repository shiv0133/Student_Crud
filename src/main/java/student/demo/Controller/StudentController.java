package student.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import student.demo.Model.Student;
import student.demo.Services.StudentService;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    // we have to write code for getting list of all student.....
    @RequestMapping("/get")
    public List<Student> PrintStudent(){
    return studentService.PrintStudent();
    }
       // here we have to write code for saving student....
         @RequestMapping("/save")
          public String SaveStudent(@RequestBody Student student){
          return studentService.SaveStudent(student);
    }
    //here we have to write the logic for updating the data....
        @RequestMapping("/update/{id}/{name}")
        public String UpdateStudent(@PathVariable Long id,@PathVariable String name){
        return studentService.UpdateStudent(id,name);
    }
    //here we have to write the logic for deleting the student......
        @RequestMapping("/delete/{id}")
        public String DeleteStudent(@PathVariable Long id){
        return studentService.DeleteStudent(id);
    }

}
