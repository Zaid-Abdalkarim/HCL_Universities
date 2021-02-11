package com.university.university.repo;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.university.university.model.StudentModel;
import com.university.university.model.UniversityModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepo extends CrudRepository<UniversityModel, Long> {

    Optional<UniversityModel> findById(Long id);

}
