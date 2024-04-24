package com.alloymobile.restapi.service;

import com.alloymobile.restapi.persistence.DepartamentRepository;
import com.alloymobile.restapi.persistence.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    DepartamentRepository repository;

    public DepartmentService(DepartamentRepository repository) {
        this.repository = repository;
    }

    public List<Department> getAll(){
        return this.repository.findAll();
    }

    public Department getById(Long id){
        return this.repository.findById(id).get();
    }

    public Department add(Department department){
        return this.repository.save(department);
    }

    public Department update(Long id, Department department){
        Optional<Department> dept = this.repository.findById(id);
        if(dept.isPresent()){
            dept.get().setName(department.getName());
            return this.repository.save(dept.get());
        }
        throw new RuntimeException();
    }

    public void delete(Long id){
        this.repository.deleteById(id);
    }

}
