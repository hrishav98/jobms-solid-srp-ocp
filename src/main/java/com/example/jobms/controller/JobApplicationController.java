package com.example.jobms.controller;

import com.example.jobms.model.JobApplication;
import com.example.jobms.service.JobApplicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller to handle HTTP requests related to job applications.
 *
 * ✅ This layer is responsible **only** for receiving requests and sending responses —
 *    it delegates business logic to the service layer, keeping it aligned with the
 *    **Single Responsibility Principle (SRP)**.
 */
@RestController
@RequestMapping("/api/applications")
public class JobApplicationController {

    private final JobApplicationService service;

    /**
     * Constructor injection for JobApplicationService ensures loose coupling
     * and supports testing and flexibility.
     *
     * @param service the service that handles business logic for job applications
     */
    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    /**
     * Endpoint to handle POST requests for job applications.
     *
     * @param application the job application data from the client
     * @return a confirmation response
     */
    @PostMapping
    public ResponseEntity<String> apply(@RequestBody JobApplication application) {
        service.apply(application); // Delegates business logic to service
        return ResponseEntity.ok("Application submitted!"); // Responds with success message
    }
}
