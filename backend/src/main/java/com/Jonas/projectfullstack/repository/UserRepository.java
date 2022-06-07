package com.Jonas.projectfullstack.repository;

import com.Jonas.projectfullstack.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
