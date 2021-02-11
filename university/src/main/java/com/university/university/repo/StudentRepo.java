package com.university.university.repo;

import java.util.Optional;

import com.university.university.model.StudentModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<StudentModel, Long> {

    Optional<StudentModel> findById(Long id);
}
