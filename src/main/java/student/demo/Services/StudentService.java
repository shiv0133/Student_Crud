package student.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import student.demo.Model.Student;
import student.demo.Repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
   // here the logic for getting list from repo...using service
        public List<Student> PrintStudent(){
        return studentRepository.findAll();
    }
  // business logic for saving data in to table....
        public String SaveStudent(Student student){
        studentRepository.save(student);
        return "Student has been saved sucessfully....";
    }
    // logic for updating the data.....
      public String UpdateStudent(Long id,String name){
      Student student= studentRepository.getById(id);
      student.setName(name);
      studentRepository.save(student);
      return "data has been updated save successfully.....";
    }
  // logic for deleting the data.....
     public String DeleteStudent(Long id){
     studentRepository.deleteById(id);
     return "Student has been deleted succesfully.....";
    }

}
