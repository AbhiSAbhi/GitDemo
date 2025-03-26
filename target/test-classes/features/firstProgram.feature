
Feature: Application Login

Background:
Given setup the entries in database
When launch the browser from config variables
And hit the home page url of banking site

@RegressionTest
Scenario: Admin Page default login

Given User is on NetBanking Page
When User login into application with "admin" and password "1234"
Then Home page is displayed
And Cards are displayed

@MobileTest
Scenario: User Page default login

Given User is on NetBanking Page
When User login into application with "user" and password "0953"
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest
Scenario Outline: Mortgage User Page default login

Given User is on NetBanking Page
When User login into application with "<Username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:
| Username   | Password |
| debituser  |  Hey123  |
| credituser |  Hi213   |

@SmokeTest
Scenario: User Page default Sign up

Given User is on Practice landing page
When User Signup into application
| Abhimanyu |
| Singh |
| contact@email.com |
| 1234567890 |
Then Home page is displayed
And Cards are displayed

