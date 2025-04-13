package com.example.jobms.service.impl;

import com.example.jobms.model.JobApplication;
import com.example.jobms.service.NotificationService;

/**
 * SMSNotificationService is a concrete implementation of the NotificationService interface.
 * It handles sending SMS notifications when a job application is submitted.
 *
 * This class also supports the Open/Closed Principle (OCP) — we can add this new type
 * of notification without changing any existing code, just by implementing the interface.
 */
public class SMSNotificationService implements NotificationService {

    /**
     * Sends an SMS notification for the given job application.
     *
     * @param application The job application for which the SMS should be sent.
     */
    @Override
    public void notify(JobApplication application) {
        // In a real application, you'd call an SMS API like Twilio here
        System.out.println("Sending SMS to recruiter for: " + application.getApplicantName());
    }
}
