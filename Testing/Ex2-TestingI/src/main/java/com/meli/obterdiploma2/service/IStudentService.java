package com.meli.obterdiploma2.service;

import com.meli.obterdiploma2.model.StudentDTO;

import java.util.Set;

public interface IStudentService {
    void create(StudentDTO stu);
    StudentDTO read(Long id);
    void update(StudentDTO stu);
    void delete(Long id);
    Set<StudentDTO> getAll();
}