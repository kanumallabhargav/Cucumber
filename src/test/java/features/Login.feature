Feature: Application Login


Scenario: Home page default login
Given User is on the login page
When User logs in into application with username and password
Then Home page is displayed