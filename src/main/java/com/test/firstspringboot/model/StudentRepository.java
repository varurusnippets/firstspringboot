package com.test.firstspringboot.model;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {

}

//public interface StudentRepository extends MongoRepository<Student,Integer>{
//	
//}
