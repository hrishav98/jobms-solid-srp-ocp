package com.example.jobms.service.impl;

import com.example.jobms.model.JobApplication;
import com.example.jobms.service.NotificationService;

/**
 * EmailNotificationService is a concrete implementation of the NotificationService interface.
 * It is responsible for sending email notifications when a job application is submitted.
 *
 * This class demonstrates the Open/Closed Principle (OCP) by extending functionality
 * (email notifications) without modifying the core application logic.
 */
public class EmailNotificationService implements NotificationService {

    /**
     * Sends an email notification for the given job application.
     *
     * @param application The job application for which the email should be sent.
     */
    @Override
    public void notify(JobApplication application) {
        // In a real-world scenario, you would integrate with an email service provider here
        System.out.println("Sending EMAIL to recruiter for: " + application.getApplicantName());
    }
}
