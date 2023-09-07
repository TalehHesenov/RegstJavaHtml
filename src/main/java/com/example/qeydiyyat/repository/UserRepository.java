package com.example.qeydiyyat.repository;

import com.example.qeydiyyat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User ,Integer> {
}
