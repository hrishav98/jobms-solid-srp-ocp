package com.example.jobms.service;

import com.example.jobms.model.JobApplication;

/**
 * NotificationService defines the contract for sending notifications
 * whenever a new job application is received.
 *
 * This interface follows the Dependency Inversion Principle (DIP),
 * allowing us to decouple the high-level business logic (e.g., saving
 * applications) from low-level notification mechanisms (email, SMS, etc.).
 *
 * It also makes the application easily extensible (Open/Closed Principle),
 * as new notification types can be added without modifying existing logic.
 */
public interface NotificationService {

    /**
     * Sends a notification related to the submitted job application.
     *
     * @param application The job application that triggers the notification.
     */
    void notify(JobApplication application);
}


