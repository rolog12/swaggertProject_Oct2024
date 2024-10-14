# swaggertProject_Oct2024

Home Challenge - Swagger End Point Automation Testing

______________________________________________
Requirements:

IntelliJ Idea- IDE

Java Laguange

Selenium - MAVEN

TestNG

Chrome Browser

__________________________________
Dependencies:

org.seleniumhq.selenium

org.testng

org.seleniumhq.selenium
________________________________________________
Extra TestNG Configurations File to Install:

*On IntelliJ IDEA - From Testng.xml follow this steps:

*Go to Run / Edit Configurations

*On Listeners TAB add the 2 following extensions:

 -EmailableReporter2 -> org.testng.reporters

 -FailedReporter -> org.testng.reporters
_________________________________________________

Test were performed under Chorme Browser

URL : https://petstore3.swagger.io/

____________________________________________

Test Plan:

Scope :
Validate PET, STORE, USER Section.

Every Section need to be validate at least POST and GET End Points. Each Section

___________________________
1) PET END POINT

POST

TC1 - Validate Create a new Pet  - Expected Results: PASSED

TC2 - Validate Create a new Pet (EMPTY Field) - Expected Results: Failed

______________________
GET 

TC3 - Validate Find a EXISTING Pet by Id - Expected Results : PASSED

TC4 - Validate Find a NONE EXISTING Pet by Id - Expected Results : FAILED
________________________________

2) STORE END POINT


POST


TC5 - Validate Place an Order for a Pet  - Expected Results: PASSED

TC6 - Validate Place an Order for a Pet (EMPTY Field) - Expected Results: Failed


GET 


TC7 - Validate Find a EXISTING Purchase by Id - Expected Results : PASSED

TC8 - Validate Find a NONE EXISTING Purchase by Id - Expected Results : FAILED

_______________________
3) USER END POINT

POST

TC9 - Validate Create an User - Expected Results: PASSED

TC10 - Validate Create an User (EMPTY Field) - Expected Results: Failed

GET 

TC11 - Validate existing User can LOGIN - Expected Results : PASSED

TC12 - Validate a NONE EXISTING User can LOGIN - Expected Results : FAILED

GET

TC13 - Validate existing User can LOGOUT - Expected Results : PASSED
____________________________
