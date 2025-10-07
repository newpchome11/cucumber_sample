Feature: App Login

Background:
Given user launches the url
When user clicks on login button
And user navigates to login homepage

@SanityTest @Mortgage
Scenario: User Home page login
Given Valid User is on Login page
When User logs in with credetials usr and pwd
Then Homepage should be displayed
And Response displayed is right

@RegressionTest @NetBanking
Scenario Outline: Admin and User Home page login
Given <role> is on Login page
When User logs in with credetials <username> and <password>
Then Homepage <display> displayed
And Response displayed is <result>

Examples:
|role|username|password|display|result|
|admin|pramod|123|should be|right|
|invalid user|ramesh|456|should not be|wrong|