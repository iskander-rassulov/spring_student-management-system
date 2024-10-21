package repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iskander.student.domain.Student;


@Repository
public interface studRepository extends JpaRepository<Student, Long> {

}