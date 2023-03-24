package student.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import student.demo.Model.Student;
@org.springframework.stereotype.Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
