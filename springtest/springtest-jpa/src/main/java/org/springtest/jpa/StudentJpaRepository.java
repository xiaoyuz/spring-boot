package org.springtest.jpa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springtest.domain.Student;

public interface StudentJpaRepository extends CrudRepository<Student, Long>{

}
