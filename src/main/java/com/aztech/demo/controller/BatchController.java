package com.aztech.pulse.controller;

import com.aztech.pulse.model.BatchDetails;
import com.aztech.pulse.services.PulseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/batch")
public class BatchController {

    @Autowired
    private PulseService pulseService;


@GetMapping("{batchid}/status")
    public String getBatchDetails(@PathVariable("batchid") Integer batchId) {
        Optional<BatchDetails> batchDetails = pulseService.getBatchDetails(batchId);
        return "<b>" + batchDetails.get().getStatus() + "</b>";
    }

}
