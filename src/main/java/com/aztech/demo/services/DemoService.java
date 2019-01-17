package com.aztech.demo.services;

import com.aztech.demo.model.BatchDetails;
import com.aztech.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public Optional<BatchDetails> getBatchDetails(Integer batchId) {
        return demoRepository.findById(batchId);
    }

}
