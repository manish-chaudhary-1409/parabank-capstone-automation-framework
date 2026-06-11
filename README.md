# 🏦 ParaBank Capstone Automation Framework

![Java](https://img.shields.io/badge/Java-21-orange)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-green)
![TestNG](https://img.shields.io/badge/TestNG-Framework-red)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![Status](https://img.shields.io/badge/Test_Status-7%2F7_Passed-success)

---

# 📌 Project Overview

The **ParaBank Capstone Automation Framework** is a Hybrid Automation Testing Framework developed to automate critical banking functionalities of the ParaBank application.

The framework is built using **Java, Selenium WebDriver, TestNG, Maven, Page Object Model (POM), Data-Driven Testing, Extent Reports, Jenkins, and Docker** while following industry-standard automation practices.

This project was developed as part of the Wipro Capstone Program to demonstrate real-world automation framework design, test execution, reporting, and CI/CD readiness.

---

# 🎯 Business Objective

Banking applications require high reliability, accuracy, and security. Manual testing of repetitive workflows becomes time-consuming and inefficient.

The objective of this project is to:

* Automate critical banking workflows
* Reduce manual testing effort
* Improve regression testing efficiency
* Increase execution reliability
* Implement reusable automation architecture
* Demonstrate industry-standard automation framework design

---

# 🏦 Application Under Test

**Application Name:** ParaBank

**Application URL:** https://parabank.parasoft.com/parabank

**Domain:** Banking / BFSI

---

# 🚀 Key Features

✅ Hybrid Automation Framework

✅ Page Object Model (POM)

✅ Data Driven Testing using CSV

✅ Dynamic User Registration

✅ Cross Browser Ready

✅ Explicit Wait Synchronization

✅ Screenshot Capture on Failure

✅ Extent HTML Reporting

✅ Listener Based Execution Tracking

✅ Reusable Utility Layer

✅ Jenkins Integration Ready

✅ Docker Integration Ready

---

# 🛠 Technology Stack

| Technology         | Usage                    |
| ------------------ | ------------------------ |
| Java               | Programming Language     |
| Selenium WebDriver | Browser Automation       |
| TestNG             | Test Execution Framework |
| Maven              | Build Management         |
| CSV                | Test Data Management     |
| Extent Reports     | Reporting                |
| Log4j2             | Logging                  |
| Git                | Version Control          |
| GitHub             | Source Repository        |
| Jenkins            | CI/CD                    |
| Docker             | Containerization         |

---

# 🏗 Framework Architecture

The framework follows a Hybrid Architecture by combining:

### Page Object Model (POM)

* Separation of Locators and Business Logic
* Better Maintainability
* Improved Reusability

### Data Driven Testing

* Externalized Test Data
* Reduced Hardcoded Values
* Easy Maintenance

### TestNG Framework

* Assertions
* Listeners
* Reporting
* Test Suites

---

# 📂 Project Structure

```text
ParaBank-Capstone-Automation-Framework

src/test/java
│
├── base
│   └── BaseTest.java
│
├── pages
│   ├── RegisterPage.java
│   ├── LoginPage.java
│   ├── AccountOverviewPage.java
│   ├── TransferFundsPage.java
│   └── BillPaymentPage.java
│
├── testcases
│   ├── RegistrationTest.java
│   ├── LoginTest.java
│   ├── AccountOverviewTest.java
│   ├── TransferFundsTest.java
│   ├── BillPaymentTest.java
│   └── NegativeTest.java
│
├── utilities
│   ├── ConfigReader.java
│   ├── CSVUtil.java
│   ├── WaitUtil.java
│   ├── ScreenshotUtil.java
│   └── ExtentReportManager.java
│
├── listeners
│   └── TestListener.java
│
├── dataproviders
│   └── TestDataProvider.java
│
src/test/resources
│
├── config.properties
├── TestData.csv
└── log4j2.xml
```

---

# ✅ Automated Test Scenarios

### Registration Module

* New User Registration
* Registration Validation
* Dynamic Username Creation

### Login Module

* Valid Login Verification
* Invalid Login Verification
* Empty Login Validation

### Account Overview Module

* Account Overview Verification
* Account Information Validation

### Transfer Funds Module

* Transfer Funds Workflow Validation
* Transfer Funds Page Verification

### Bill Payment Module

* Bill Payment Processing
* Transaction Validation

---

# 🔥 Challenges Faced During Development

## 1. Duplicate Username Issue

### Problem

ParaBank does not allow duplicate usernames. Running registration tests multiple times caused failures.

### Solution

Implemented dynamic username generation using timestamps to create unique usernames during every execution.

---

## 2. Synchronization Issues

### Problem

Certain elements loaded slowly, causing intermittent failures.

### Solution

Created a reusable WaitUtil class and implemented Explicit Waits throughout the framework.

---

## 3. Hardcoded Test Data

### Problem

Maintaining test data inside scripts made the framework difficult to scale.

### Solution

Implemented CSV-based Data Driven Testing with TestNG Data Providers.

---

## 4. Reporting and Debugging

### Problem

Identifying failures from console logs alone was difficult.

### Solution

Integrated Extent Reports and automatic Screenshot Capture on Failure.

---

## 5. Driver Management

### Problem

Manual browser driver maintenance created compatibility issues.

### Solution

Integrated WebDriverManager for automatic browser driver management.

---

# 📊 Execution Summary

| Metric           | Result |
| ---------------- | ------ |
| Total Test Cases | 7      |
| Passed           | 7      |
| Failed           | 0      |
| Skipped          | 0      |
| Success Rate     | 100%   |

---

# 📈 Reports Generated

### Extent Report

```text
reports/ParaBankExtentReport.html
```

### Screenshots

```text
screenshots/
```

### Logs

```text
logs/
```

---

# 🚀 Jenkins Integration

The framework includes a Jenkins Pipeline configuration using a Jenkinsfile.

Pipeline Stages:

* Source Code Checkout
* Maven Build
* Test Execution
* Report Generation
* Artifact Archiving

This enables automated execution of the complete test suite in CI/CD environments.

---

# 🐳 Docker Integration

The framework includes a Dockerfile to support containerized test execution.

Benefits:

* Consistent Execution Environment
* Easy Deployment
* Better Portability
* CI/CD Compatibility

---

# 🔮 Future Enhancements

* Selenium Grid Integration
* Parallel Test Execution
* Allure Reports
* REST Assured API Testing
* Database Validation
* Cloud Execution using BrowserStack

---

# 🏆 Project Outcome

The ParaBank Capstone Automation Framework successfully automated major banking workflows while implementing industry-standard automation framework practices.

### Final Result

✔ Total Test Cases Executed: 7

✔ Passed: 7

✔ Failed: 0

✔ Success Rate: 100%

The project demonstrates a complete Hybrid Automation Framework with Reporting, Data Driven Testing, CI/CD Readiness, and Enterprise-Level Project Structure.

---

# 👨‍💻 Author

**Manish Chaudhary**

Wipro Capstone Project

Automation Testing Framework using Selenium (Java)

2026
