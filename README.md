# HomeWork
Introduction
This repository contains automation scripts using Selenium and Java for the Veli Store website. These scripts demonstrate how to automate Log In functionality on the website, such as browsing products, adding items to the cart, and placing orders.

website: https://veli.store/en/

Prerequisites
Before running the automation scripts, ensure that you have the following software installed on your machine:

Java Development Kit (JDK)
Selenium WebDriver
TestNG (Test Framework)
Apache Maven (Build Tool)
Google Chrome browser (latest version)
allure
Selenide

The automation scripts utilize Selenium WebDriver and TestNG for interacting with the Veli Store website. The test classes under the src/test/java directory demonstrate various actions:

Test Scenarios: 
1.Verify that user can not Log in with incorrect credentials and responding validation texts appear: Incorrect password or incorrect Email/ Incorrect credentials (both fields)/ Empty fields.
2. Verify that user can log in with correct credentials.
3. verify that show password functionality works.

