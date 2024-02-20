Feature: OrangeHRM Application Functionalities Testing

Background:
Given User should open Browser in the System

@smoke
Scenario: Validating OrangHRM Application LogIn Page

#Given User should open Browser in the System
When User enters OrangeHRM Application URL Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should close the OrangeHRM Application along with the browser

@ReTesting
Scenario: Validating OrangHRM Application LogIn Functioanlity

#Given User should open Browser in the System
When User enters OrangeHRM Application URL Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should enter userName and password and click on login button
Then User should be navigated to OrangeHRM Application HomePage
Then User should click on WelCome Admin and click on Logout
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should close the OrangeHRM Application along with the browser
@RegressionTesting
Scenario Outline: Validating OrangHRM Application LogIn Functioanlity with TestData

#Given User should open Browser in the System
When User enters OrangeHRM Application URL Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should enter "<userName>" and "<password>" and click on login button
Then User should be navigated to OrangeHRM Application HomePage
Then User should click on WelCome Admin and click on Logout
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should close the OrangeHRM Application along with the browser
Examples:
|  userName     |  password     |
|  Admin        |  Livetech@123 |
|  srini        |  Livetech@123 |
|  Cucumber     |  Livetech@123 |
|  Admin        |  Livetech@123 |