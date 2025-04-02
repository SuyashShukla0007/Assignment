# Binary Search API - Spring Boot

This is a simple Spring Boot application that provides a REST API to perform binary search on a given array of integers.

---

## 🚀 **Run Locally**

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/SuyashShukla0007/Assignment.git
cd Assignment
```

### **2️⃣ Build the Application**
Ensure you have Maven installed. Then, build the project:
```sh
mvn clean package
```

### **3️⃣ Run the Application**
Run the Spring Boot application:
```sh
mvn spring-boot:run
```
The server will start on **`http://localhost:8080`**.

---

## 🐳 **Run with Docker**

### **1️⃣ Build the Docker Image**
```sh
docker build -t binarysearch-app .
```

### **2️⃣ Run the Docker Container**
```sh
docker run -p 8080:8080 binarysearch-app
```

---

## 🎯 **Usage**
Make a **GET request** to the API:

```sh
curl "http://localhost:8080/api/binary-search?arr=1,3,5,7,9&target=5"
```

**Response:**
```json
"Target found at index 2"
```

---

## 📜 **Project Structure**
```
📁 binarySearch
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java/com/example/binarySearch
│   │   │   ├── BinarySearchApplication.java
│   │   │   ├── BinarySearchController.java
│   ├── 📂 test
├── 📄 pom.xml
├── 📄 Dockerfile
└── 📄 README.md
```

---

## 📌 **Tech Stack**
- **Java 17**
- **Spring Boot**
- **Maven**
- **Docker**

Happy Coding! 🚀
