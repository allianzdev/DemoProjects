package com.aztech.demo.repository;

import com.aztech.demo.model.BatchDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DemoRepository extends JpaRepository<BatchDetails, Integer> {

}
