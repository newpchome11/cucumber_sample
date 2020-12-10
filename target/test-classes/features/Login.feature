Feature: App Login

Scenario Outline: Home page login1
Given User is on Login page
When User logs in with credetials <username> and <password>
Then Homepage <display> displayed
And Response displayed is <result>

#Scenario Outline: Home page login2
#Given User is on Login page
#When User logs in with credetials <username> and <password>
#Then Homepage <display> displayed
#And Response displayed is <result>

Examples:
|username|password|display|result|
|pramod|123|should be|right|
|ramesh|456|should not be|wrong|