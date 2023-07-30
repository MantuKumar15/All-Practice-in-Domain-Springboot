package com.Repository;

import com.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Subject,Long> {
}
