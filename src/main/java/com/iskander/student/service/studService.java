package com.iskander.student.service;

import java.util.List;

import com.iskander.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.studRepository;

@Service
public class studService {

    @Autowired
    private studRepository repo;

    public List<Student> listAll() {
        return repo.findAll();
    }

    public void save(Student std) {
        repo.save(std);
    }

    public Student get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }

}
