package com.aztech.demo.controller;

import com.aztech.demo.model.BatchDetails;
import com.aztech.demo.services.DemoService ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/batch")
public class BatchController {

    @Autowired
    private DemoService demoService;


@GetMapping("{batchid}/status")
    public String getBatchDetails(@PathVariable("batchid") Integer batchId) {
        Optional<BatchDetails> batchDetails = demoService.getBatchDetails(batchId);
        return "<b>" + batchDetails.get().getStatus() + "</b>";
    }

}
