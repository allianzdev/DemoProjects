package com.aztech.pulse.repository;

import com.aztech.pulse.model.BatchDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PulseRepository extends JpaRepository<BatchDetails, Integer> {

}
