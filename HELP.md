# Spring AI + Ollama Demo

A simple Spring Boot application demonstrating how to integrate **Spring AI** with a locally running **Ollama** model.

## Prerequisites

- Java 21
- Maven 3.9+
- Ollama installed and running

## Technology Stack

| Component | Version |
|----------|---------|
| Spring Boot | 3.5.16 |
| JDK | 21 |
| AI Framework | Spring AI |
| LLM | `llama3.2:3b` |
| Request Type | GET |

---

## Install Ollama

Download Ollama from:

https://ollama.com/download

Pull the required model:

```bash
ollama pull llama3.2:3b
```

Verify the model:

```bash
ollama list
```

Start chatting with the model (optional):

```bash
ollama run llama3.2:3b
```

By default, Ollama runs on:

```
http://localhost:11434
```

---

## Running the Application

Clone the repository and start the application:

```bash
mvn spring-boot:run
```

or

```bash
./mvnw spring-boot:run
```

The application starts on:

```
http://localhost:8080
```

---

## API Endpoint

### Ask a Question

**Request**

```
GET /ask/ollama/{your-question}
```

**Example**

```
GET http://localhost:8080/ask/ollama/What is Spring AI?
```

or

```
http://localhost:8080/ask/ollama/Explain Java Streams
```

---

## Sample Response

```text
Spring AI is a framework that simplifies integrating AI models into Spring applications...
```

---

## Project Structure

```
src
├── main
│   ├── java
│   └── resources
│       └── application.properties
└── test
```

---

## Configuration

Example `application.properties`:

```properties
spring.ai.ollama.base-url=http://localhost:11434
spring.ai.ollama.chat.model=llama3.2:3b
```

---

## Verify Ollama

To verify that Ollama is running:

```bash
curl http://localhost:11434/api/tags
```

You should see the `llama3.2:3b` model in the response.

---

## Requirements

- Java 21
- Spring Boot 3.5.16
- Ollama running locally
- `llama3.2:3b` model downloaded

---

## Notes

- Ensure Ollama is running before starting the application.
- The application communicates with Ollama using Spring AI.
- The model executes locally, so no external AI API key is required.