# demoThymeleaf

**demoThymeleaf** is a simple Spring Boot web application built with **JDK 21** and the **Thymeleaf** template engine. This app allows users to upload files of any format and view basic file details on the web.

---

## 🚀 Features

- ✅ Built with **Spring Boot 3.4.4** and **JDK 21**
- 🐘 Uses **Gradle** for build and dependency management
- 🌿 Integrates **Thymeleaf** for rendering HTML pages
- 📤 Upload **any file format** via the browser
- 📄 View uploaded file name, type, and size on a result page

---

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3.4.4
- Thymeleaf
- Gradle
- HTML / CSS


---

## 📂 Project Structure

demoThymeleaf/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/demo/
│ │ │ ├── DemoThymeleafApplication.java
│ │ │ └── controller/
│ │ │ └── FileUploadController.java
│ │ └── resources/
│ │ ├── templates/
│ │ │ ├── upload.html
│ │ │ └── view.html
│ │ └── application.properties
├── uploads/ # Directory where uploaded files are saved
├── build.gradle
├── settings.gradle
└── README.md

---

## ▶️ Getting Started

### 📦 Prerequisites

- Java 21
- Gradle 8.x (or use the Gradle wrapper `./gradlew`)
- Git

---

### 🔧 Run the App

1. **Clone the repository**:

   ```bash
   git clone https://github.com/lsherpa-beta/demoThymeleaf.git
   cd demoThymeleaf
2. **Build the project**:
   ```bash
      ./gradlew build
3. **Start the application**:
   ```bash
      ./gradlew bootRun

4. **Visit the application in any browser**:
   ```bash
      http://localhost:8080
---
## 📤 Upload Flow
- Go to the upload page (/).

- Choose any file from your computer.

- Submit the form to upload.

- View the file details (name, size, content type).


---
## 🔮 Future Enhancements

- File preview support (e.g., images, PDFs, plain text)

- Download links for uploaded files

- File size/type restrictions

- File storage in database or cloud (e.g., S3)

- Authentication and user-specific file uploads


