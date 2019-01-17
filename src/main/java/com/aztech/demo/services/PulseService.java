package com.aztech.pulse.services;

import com.aztech.pulse.model.BatchDetails;
import com.aztech.pulse.repository.PulseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PulseService {

    @Autowired
    private PulseRepository pulseRepository;

    public Optional<BatchDetails> getBatchDetails(Integer batchId) {
        return pulseRepository.findById(batchId);
    }

}
