🧠 Task Management Backend System
A powerful, API-driven task management backend with built-in authentication, user management, automation logic, and support for secure, scalable operations.

📌 Purpose
This project provides the backend foundation for building a task management system — useful for SaaS platforms, admin dashboards, internal tools, or integrations with bots and automation agents. It includes authentication, task and user APIs, error handling, and documentation — ready to integrate with a frontend, bot, or automation tool like n8n.

💡 Key Features
🔐 Authentication
Secure login/logout

JWT or session token support

Password reset flow

Email verification support (optional)

📋 Task Management
Create / Update / Delete tasks

Assign tasks to users

Filter by status, priority, or assignee

Track due dates and timestamps

👥 User Management
Edit user profile

Change password securely

View tasks by user

Admin routes for managing users

📑 API Documentation
OpenAPI / Swagger support

Detailed request/response samples

Auth-enabled testing via Swagger UI

⚙️ Dev & Deployment Ready
ENV-based configuration

Error handling and logging

Rate limiting and input validation

Pre-built for use with frontend apps or no-code tools

src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── taskmanagement/
│   │           ├── controller/
│   │           │   ├── AuthController.java
│   │           │   └── TaskController.java
│   │           ├── entity/
│   │           │   ├── ERole.java
│   │           │   ├── Role.java
│   │           │   ├── Task.java
│   │           │   ├── TaskPriority.java
│   │           │   ├── TaskStatus.java
│   │           │   └── User.java
│   │           ├── payload/
│   │           │   └── request/
│   │           │       ├── LoginRequest.java
│   │           │       ├── SignupRequest.java
│   │           │       └── TaskRequest.java
│   │           ├── repository/
│   │           │   ├── RoleRepository.java
│   │           │   ├── TaskRepository.java
│   │           │   └── UserRepository.java
│   │           ├── security/
│   │           │   ├── jwt/
│   │           │   │   ├── AuthEntryPointJwt.java
│   │           │   │   ├── AuthTokenFilter.java
│   │           │   │   └── JwtUtils.java
│   │           │   ├── services/
│   │           │   │   ├── UserDetailsImpl.java
│   │           │   │   └── UserDetailsServiceImpl.java
│   │           │   └── SecurityConfig.java
│   │           └── TaskManagementApplication.java
│   └── resources/
│       └── application.properties
