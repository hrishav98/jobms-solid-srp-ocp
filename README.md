# Job Application System – SOLID Principles (SRP & OCP)

This Spring Boot project demonstrates how to apply the **Single Responsibility Principle (SRP)** and **Open/Closed Principle (OCP)** using a simple Job Application use case.

---

## 💡 About the Project

This application simulates a **Job Application System** where a user submits an application, and the system:
1. Saves the job application to a database.
2. Sends a notification to the recruiter (via Email or SMS).

---

## 🔍 Focused SOLID Principles

### ✅ Single Responsibility Principle (SRP)
- Each class is responsible for one specific task.
- Example: `JobApplicationService` is only responsible for coordinating the saving and notification.
- Notification logic is handled separately in `NotificationService` implementations.

### ✅ Open/Closed Principle (OCP)
- The system is **open for extension** (e.g., adding new notification types) but **closed for modification**.
- You can add new notification services like Push, WhatsApp, etc., without modifying existing logic.

---

## 📁 Project Structure
```
com.example.jobms
├── controller
│   └── JobApplicationController.java
├── model
│   └── JobApplication.java
├── repository
│   └── JobApplicationRepository.java
├── service
│   ├── JobApplicationService.java
│   └── NotificationService.java
├── service.impl
│   ├── EmailNotificationService.java
│   └── SMSNotificationService.java
└── DemoApplication.java
```

---

## 🛠️ Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- Postgres

---

## 🚀 Run the Project
1. Clone the repo:
   ```bash
   git clone https://github.com/hrishav98/jobms-solid-srp-ocp.git
   ```
2. Open in your IDE (IntelliJ, VS Code, etc.)
3. Run the `DemoApplication.java` file
4. Use Postman or curl to hit:
   ```http
   POST /api/applications
   ```

Sample JSON:
```json
{
  "applicantName": "John Doe",
  "email": "john@example.com",
  "resumeLink": "https://example.com/resume/john"
}
```

---

## 📸 Screenshots
See LinkedIn post or `/screenshots` folder (if added) for diagrams and code breakdowns.

---

## 🙌 Contributing
This is a demo project for learning and discussion. Feel free to fork and play with it!

---

## 🔗 Connect
Feel free to connect with me on [LinkedIn](https://www.linkedin.com/in/hrishav98) to discuss clean code, Spring, or backend development!

---

> Made with ❤️ by Hrishav
