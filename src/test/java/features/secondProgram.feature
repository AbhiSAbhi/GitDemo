
Feature: Application Login

Background:
When launch the browser from config variables
And hit the home page url of banking site

#Cucumber Hooks
#Before->Background->Scenario->After 

@MobileTest @NetBanking @RegressionTest
Scenario: User Page default login

Given User is on NetBanking Page
When User login into application with "user" and password "0953"
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest @Mortgage 
Scenario Outline: Mortgage User Page default login

Given User is on NetBanking Page
When User login into application with "<Username>" and password "<Password>"
Then Home page is displayed
And Cards are displayed

Examples:
| Username   | Password |
| debituser  |  Hey123  |
| credituser |  Hi213   |


