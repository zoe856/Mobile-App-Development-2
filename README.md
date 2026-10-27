# CampusCart — Android Application

CampusCart is a student-focused Android application developed using **Java and XML in Android Studio**. It provides a simple interface for accessing campus-related services and demonstrates common Android application features, including user authentication, form validation, screen navigation, and profile management.

## Project Overview

CampusCart is designed as a basic campus services application. Users can register an account, log in, recover or reset their password through a simulated process, explore campus service categories, and view their profile.

The project was developed as part of an Android Application Development assignment to demonstrate the practical use of Android Activities, XML layouts, Intents, input controls, and resource management.

## Features

- **Login:** Enter an email address or username and password to access the application.
- **User Registration:** Create an account by entering a name, email address, password, and password confirmation.
- **Input Validation:** Validate required fields, email format, password length, and matching passwords.
- **Forgot Password:** Enter an email address to demonstrate a simulated password recovery process.
- **Reset Password:** Enter and confirm a new password with validation.
- **Dashboard:** View campus service categories in a grid-based layout.
- **Profile:** View user information and access the Logout option.
- **Screen Navigation:** Move between Activities using explicit Intents.
- **Night Mode Resources:** Provide alternative colors and styles for dark appearance settings.
- **Reusable Resources:** Store application text and styling in Android resource files.

## Campus Services

The Dashboard presents campus-related categories such as:

- Food Court
- Book Store
- Stationery
- Transport
- Activities
- Student Help

These categories provide a foundation for expanding CampusCart into a more complete campus services application.

## Technologies Used

| Technology | Purpose |
|---|---|
| Java | Application logic and Activity functionality |
| XML | Screen layouts and interface design |
| Android Studio | Development environment |
| Android SDK | Android application development |
| Android Activities | Individual application screens |
| Explicit Intents | Navigation between Activities |
| LinearLayout | Organizing interface elements vertically or horizontally |
| GridLayout | Arranging dashboard service categories in a grid |
| ConstraintLayout | Creating flexible screen layouts |
| Android Resources | Managing strings, colors, and styles |
| Night Mode Resources | Supporting alternative dark-theme styling |

## Application Screens

The application includes the following screens:

1. **Login Screen** — Allows existing users to enter their credentials.
2. **Registration Screen** — Provides a form for creating a new account.
3. **Forgot Password Screen** — Demonstrates the password recovery process.
4. **Reset Password Screen** — Allows users to enter and confirm a new password.
5. **Dashboard Screen** — Displays campus service categories.
6. **Profile Screen** — Displays user information and provides a Logout option.

## Project Structure

The project is organized into Java source files and Android resource files.

```text
CampusCart_Java_XML/
├── app/
│   ├── build.gradle
│   └── src/
│       └── main/
│           ├── java/
│           │   └── .../
│           │       ├── AuthData.java
│           │       ├── LoginActivity.java
│           │       ├── RegisterActivity.java
│           │       ├── ForgotPasswordActivity.java
│           │       ├── ResetPasswordActivity.java
│           │       ├── DashboardActivity.java
│           │       └── ProfileActivity.java
│           ├── res/
│           │   ├── layout/
│           │   ├── values/
│           │   └── values-night/
│           └── AndroidManifest.xml
├── build.gradle
├── settings.gradle
└── README.md
```

*Note: The package directory and individual resource filenames may vary depending on the final project version.*

## Requirements

Before running the project, make sure you have:

- Android Studio installed.
- A compatible Android SDK.
- A computer capable of running Android Studio.
- An Android emulator or a physical Android device for testing.

## How to Run the Project

1. Clone or download this repository from GitHub.
2. Open Android Studio.
3. Select **Open** and choose the project folder containing the root `settings.gradle` file.
4. Allow Android Studio to sync the Gradle files and download any required dependencies.
5. If prompted, install the required Android SDK components.
6. Start an Android emulator or connect a physical Android device with USB debugging enabled.
7. Click **Run ▶** in Android Studio to build and launch the application.

If Gradle synchronization fails, check your internet connection, SDK installation, and Android Studio build messages.

## Authentication and Data Handling

CampusCart uses a local demonstration approach for authentication rather than a remote server.

- Login credentials are checked locally.
- Registration information is stored temporarily in application memory.
- Password recovery is simulated and does not send a real email.
- No remote authentication service or backend database is included.

**Important:** This implementation is intended for educational purposes. It is not suitable for production use without secure authentication, persistent data storage, and appropriate password protection.

## Android Resources

The project uses Android resource directories to organize the interface:

- `res/layout/` — XML layouts for the application screens.
- `res/values/strings.xml` — Reusable text resources.
- `res/values/colors.xml` — Default color definitions.
- `res/values/styles.xml` — Default application styles.
- `res/values-night/` — Alternative colors and styles for night mode.
- `AndroidManifest.xml` — Activity declarations and application configuration.

## Learning Objectives

This project demonstrates practical experience with:

- Developing Android applications using Java and XML.
- Designing user interfaces with multiple Android layout types.
- Creating and managing Activities.
- Navigating between screens using explicit Intents.
- Handling button clicks and user input.
- Implementing basic form validation.
- Organizing application resources.
- Supporting alternative night-mode resources.
- Building a multi-screen Android application in Android Studio.

## Future Improvements

Possible enhancements for future versions include:

- Integrating Firebase Authentication.
- Adding a database for persistent user accounts and profiles.
- Connecting campus services to real data.
- Adding search and filtering for campus facilities.
- Improving accessibility and responsive layouts.
- Implementing secure password recovery.
- Adding more campus-specific features and notifications.

## Project Purpose

CampusCart was created as an educational Android development project to apply fundamental concepts of Java, XML, Activities, layouts, Intents, form validation, and Android resource management in a practical application.

## Author

**Name:** [Zohaib Shahbaz - 24108241]  
**Course:** Mobile Application Development  
**Project:** CampusCart  
**Platform:** Android
