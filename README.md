# Kafka Learning App

A full-stack **Kafka learning and experimentation platform** built to understand real-world, enterprise-style Kafka integration using **Spring Boot** on the backend and **Angular (standalone)** on the frontend.

This project is intentionally structured to reflect **production-grade architecture**, not just demos.

---

## 📌 Project Goals

* Learn Apache Kafka concepts through hands-on implementation
* Build Kafka **Producer** and **Consumer** APIs using Spring Boot
* Integrate Kafka operations with a modern Angular frontend
* Follow clean architecture, separation of concerns, and Git best practices
* Prepare an interview-ready Kafka + Java + Angular project

---

## 🏗️ High-Level Architecture

```
┌────────────┐        HTTP/REST        ┌────────────────────┐
│  Angular   │  ───────────────────▶  │  Spring Boot API   │
│ Frontend  │                         │  (Kafka Backend)   │
└────────────┘                         └─────────┬──────────┘
                                                    │
                                                    ▼
                                            ┌──────────────┐
                                            │ Apache Kafka │
                                            │ (Broker)     │
                                            └──────────────┘
```

---

## 📂 Repository Structure

```
kafka-learning-app/
│
├── backend/
│   └── kafka-backend/
│       ├── src/main/java/com/vishvas/kafka/kafka_backend/
│       │   ├── controller/      # REST APIs (Kafka endpoints)
│       │   ├── service/         # Kafka producer / consumer logic
│       │   └── KafkaBackendApplication.java
│       ├── src/main/resources/
│       │   └── application.yaml
│       ├── pom.xml
│       └── mvnw
│
├── frontend/
│   └── kafka-frontend/
│       ├── src/
│       │   ├── app/
│       │   │   ├── services/    # API communication layer
│       │   │   ├── app.ts
│       │   │   ├── app.html
│       │   │   └── app.routes.ts
│       │   ├── main.ts
│       │   └── styles.scss
│       └── package.json
│
└── README.md
```

---

## ⚙️ Technology Stack

### Backend

* Java 17+
* Spring Boot 3.x
* Spring Web
* Spring for Apache Kafka
* Maven

### Frontend

* Angular (Standalone Components)
* TypeScript
* RxJS
* Angular HttpClient

### Messaging

* Apache Kafka
* Zookeeper (or KRaft mode)

---

## 🚀 Getting Started

### Prerequisites

* Java 17+
* Node.js 18+
* Apache Kafka (local or Docker)
* Git

---

## ▶️ Running the Backend

```bash
cd backend/kafka-backend
./mvnw spring-boot:run
```

Backend runs at:

```
http://localhost:8080
```

---

## ▶️ Running the Frontend

```bash
cd frontend/kafka-frontend
npm install
ng serve
```

Frontend runs at:

```
http://localhost:4200
```

---

## 🔌 API Overview (Sample)

| Method | Endpoint     | Description       |
| ------ | ------------ | ----------------- |
| GET    | /api/topics  | List Kafka topics |
| POST   | /api/topics  | Create new topic  |
| POST   | /api/produce | Produce message   |
| GET    | /api/consume | Consume messages  |

(Endpoints will evolve as learning progresses.)

---

## 🔐 CORS Configuration

CORS is enabled in the backend to allow:

```
http://localhost:4200
```

This allows seamless Angular → Spring Boot communication during development.

---

## 📈 Planned Enhancements

* Kafka Producer UI (message publishing)
* Kafka Consumer UI (polling / streaming)
* Consumer groups visualization
* Error handling & retry strategies
* JWT-based authentication
* Dockerized Kafka + App setup
* Monitoring (lag, offsets)

---

## 🧠 Learning Focus Areas

* Kafka topic management
* Producer acknowledgements & retries
* Consumer groups & offsets
* Idempotent producers
* Backpressure handling
* Real-world Kafka patterns

---

## 🧑‍💻 Author

**Vishvas Gohil**
Java Developer | Spring Boot | Angular | Kafka Learner

GitHub: [https://github.com/vishvasg14](https://github.com/vishvasg14)

---

## 📜 License

This project is for **learning and educational purposes**.
