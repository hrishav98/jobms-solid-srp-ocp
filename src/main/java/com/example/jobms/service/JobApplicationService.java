package com.example.jobms.service;

import com.example.jobms.model.JobApplication;
import com.example.jobms.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

/**
 * JobApplicationService handles the core business logic for job applications.
 * It is responsible for:
 * 1. Saving the job application to the database.
 * 2. Triggering a notification after saving.
 *
 * ✅ This follows the **Single Responsibility Principle (SRP)**:
 *    - Saving and notifying are separate concerns, delegated to other components.
 *
 * ✅ This also follows the **Dependency Inversion Principle (DIP)**:
 *    - Depends on abstractions (NotificationService) instead of concrete implementations.
 */
@Service
public class JobApplicationService {
    private final JobApplicationRepository repository;
    private final NotificationService notificationService;

    /**
     * Constructor-based dependency injection promotes testability and flexibility.
     *
     * @param repository            The repository used to persist job applications.
     * @param notificationService   The notification service used to notify recruiters.
     */
    public JobApplicationService(JobApplicationRepository repository, NotificationService notificationService) {
        this.repository = repository;
        this.notificationService = notificationService;
    }

    /**
     * Handles a job application:
     * 1. Persists the application.
     * 2. Sends a notification.
     *
     * @param application The job application submitted by the user.
     */
    public void apply(JobApplication application) {
        repository.save(application); // SRP: Delegated to repository
        notificationService.notify(application); // SRP: Delegated to notification service
    }
}
