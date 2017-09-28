----------------------------------
Automation Interview Java project
----------------------------------
______________________________
I. Requirments and activation:

* Run and tested on java vrsion 1.8.0_144
* Selenium 3.5.3
* In order to run - Change the geckodriver configuration in each test to point to your 
Firefox.exe and geckodriver in the relevant place (this obviously shouldn't be like this, but I didn't have the time to fix it).
* Run Using intelliJ:
-go to run/debug configurations
-choose Test kind - "All in package"
-Package - "heruTests"
-Use classpath of module - "AutomationInterview"

______________________
II. project structure:

The project is separated to two, when one part works and the other one I could not run
due to the implementation of Augmenteddriver package I had difficulty with. I left that part in the project
in case you will want to take a look at the thinking process I had when I was thinking about
implementing the Augmenteddriver package into my code.

The part with the Augmenteddriver is in the AutomationInterview/src/main.java package

The part without it (and the one that actually works and contains all the tests) is in the AutomationInterview/src/heruTests package

From now I'll reffer only to the part that works.
I decided to make a pageobjects package in which I will put Utils to use in my tests.
This Utils include a minor Selenium wrapper I made (Primary.java), and mainPage that directs to the main
URL and contains functions that return relevant pageObjects. I also included page object to each page 
I tested and made it scalable in case the project needs to be upscaled.
I then used Junit testing framework to interact with the function in the pages and make assersions. 


_________________________________
III. Pros and cons of the Project

Lets start with the bad news:

CONS:
* The project does not read a config file and putting the configurations in the beggining of the tests is BAD
* Did not write Login test 
* Did not implement logging mechanism
* Did not *successfully* implemented Augmenteddriver
* Took longer than 4 hours (more like 7)

PROS:
* Self-written selenium wrapper
* Correct framework with pageobjects
* The project is build with scalability in mind
* First Java project I have ever written (I thought its worth mentioning)
* You used Dave Haeffner's "the-internet" website as a testing and I really like this guy :)

____________
IV. Summary:

Over all I think this project went well given the time frame. Going over the time-limit
was because of the Augmenteddriver implementation that failed - causing me to almost start over from scratch.
Looking back, I should of contact Elad earlier. 
I had fun wirtting this and I'm excited to say that I feel a lot more familiarized with java after this.
If you think the project is not good enough or you don't understand why I was doing something in the way I did, 
please contact me and let me (try to) explain the reasoning behind it. 

Thank you for giving me this opportunity.


Regards,
Refael C.
