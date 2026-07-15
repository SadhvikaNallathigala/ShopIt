# 🛒 ShopIt

> A Production-Ready Microservices-Based E-Commerce Backend built using Spring Boot, Spring Cloud, Docker, MySQL, JWT Authentication, and REST APIs.

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Spring Cloud](https://img.shields.io/badge/Spring%20Cloud-Microservices-blue)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![Docker](https://img.shields.io/badge/Docker-Enabled-2496ED)
![Swagger](https://img.shields.io/badge/API-Swagger-success)
![License](https://img.shields.io/badge/License-MIT-yellow)

---

## 📌 Overview

ShopIt is a scalable backend system for an E-Commerce platform built using a Microservices Architecture.

Instead of developing one large application, the platform is divided into multiple independent services that communicate through REST APIs. This architecture improves scalability, maintainability, deployment flexibility, and fault isolation.

The project demonstrates modern backend development practices including secure authentication, API Gateway routing, service discovery, centralized configuration, containerization, and distributed service communication.

---

## 🚀 Features

- 🔐 JWT Authentication & Authorization
- 👤 User Registration & Login
- 🛍️ Product Management
- 💳 Payment Service
- 📦 Order Processing
- 📋 CRM Service
- 🌐 API Gateway
- 🔍 Service Discovery (Eureka)
- ⚙️ Centralized Configuration
- 📄 RESTful APIs
- 📚 Swagger API Documentation
- 🐳 Docker Support
- 🗄️ MySQL Database
- ☁️ Production Ready Architecture

---

# 🏗️ Architecture

```
                    Client
                       │
                       ▼
                 API Gateway
                       │
      ┌────────┬─────────────┬──────────┐
      ▼        ▼             ▼          ▼
 Authentication Product   Payment     CRM
     Service     Service   Service   Service
      │
      ▼
     MySQL
```

Each service is independently deployable and communicates through REST APIs.

---

# 🛠️ Tech Stack

### Backend

- Java 17
- Spring Boot
- Spring Security
- Spring Cloud
- Spring Data JPA
- Hibernate

### Database

- MySQL

### Security

- JWT Authentication
- Spring Security

### API

- REST APIs
- Swagger/OpenAPI

### DevOps

- Docker
- Docker Compose
- Maven

### Tools

- IntelliJ IDEA
- Postman
- Git
- GitHub

---

# 📂 Project Structure

```
ShopIt
│
├── api-gateway
├── authentication-service
├── product-service
├── payment-service
├── crm-service
├── eureka-server
├── config-server
├── docker-compose.yml
├── pom.xml
└── README.md
```

> *(Update this section according to the actual folders in your repository.)*

---

# ⚙️ Installation

## Clone Repository

```bash
git clone https://github.com/SadhvikaNallathigala/ShopIt.git

cd ShopIt
```

---

## Build Project

```bash
mvn clean install
```

---

## Run Services

Start each microservice individually

or

```bash
docker-compose up
```

---

# 🗄️ Database Configuration

Configure MySQL in:

```
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/shopit

spring.datasource.username=root

spring.datasource.password=your_password
```

---

# 🔐 Authentication

The application uses JWT Authentication.

Workflow:

1. Register User
2. Login
3. Receive JWT Token
4. Include token in Authorization Header

```
Authorization: Bearer <JWT_TOKEN>
```

---

# 📖 API Documentation

Swagger UI is available after starting the services.

```
http://localhost:8080/swagger-ui/index.html
```

*(Update the port if different.)*

---

# 🐳 Docker

Run all services using Docker Compose.

```bash
docker-compose up --build
```

Stop containers

```bash
docker-compose down
```

---

# 📬 API Testing

The repository includes a Postman Collection.

Import:

```
ShopIt.postman_collection.json
```

into Postman to test all APIs.

---

# 📈 Future Enhancements

- Email Notifications
- Inventory Management
- Order Tracking
- Redis Caching
- Kafka Event Streaming
- Kubernetes Deployment
- CI/CD Pipeline
- Monitoring with Prometheus & Grafana

---

# 🤝 Contributing

Contributions are welcome.

1. Fork the repository

2. Create a feature branch

3. Commit your changes

4. Push to your branch

5. Create a Pull Request

---

# 👩‍💻 Author

**Sadhvika Nallathigala**

Computer Science Engineering (AI)

ICFAI Tech, Hyderabad

GitHub:
https://github.com/SadhvikaNallathigala

LinkedIn:
https://www.linkedin.com/in/sadhvika-nallathigala/

---

# ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.
