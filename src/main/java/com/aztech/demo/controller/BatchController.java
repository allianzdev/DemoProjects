package com.aztech.demo.controller;

import com.aztech.demo.model.BatchDetails;
import com.aztech.demo.services.DemoService ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping(value = "/")
public class BatchController {

    @Autowired
    private DemoService demoService;


@GetMapping("batch/{batchid}/status")
    public String getBatchDetails(@PathVariable("batchid") Integer batchId) {
        Optional<BatchDetails> batchDetails = demoService.getBatchDetails(batchId);
        return "<b>" + batchDetails.get().getStatus() + "</b>";
    }

@GetMapping("healthcheck")
    public String getBatchDetails() {
        return "<b>The container is healthy!!</b>";
    }

}
