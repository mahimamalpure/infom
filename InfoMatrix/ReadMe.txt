
1. Prerequisites:
	Softwares:
		Eclipse 4.6
		Java 1.8 or above
		Selenium 3.0.1 https://goo.gl/Lyo36k
		Drivers: https://chromedriver.storage.googleapis.com/2.25/chromedriver_win32.zip
		JUnit 4.12 https://github.com/junit-team/junit4/releases/download/r4.12/junit-4.12.jar
		Chrome Browser 54
		Eclipse plugins for Git (optional)

 
2. How to Setup environment:
	
	Using attached ZIP:
		(Note: I could not add required jars and exes into the attached ZIP for security reasons.)
		Download zip file attached to the email.
		Extract the zip to the local machine.
		Import the unzipped java project in eclipse.
		Download and copy the chromedriver.exe to /drivers folder
		Download and copy the selenium-server-standalone-3.0.1.jar to /lib folder
		Download and copy the junit-4.12.jar to /lib folder
		Clean and build the project.
		There should not be any errors.
		In case of any errors check classpath configuration.
	
	OR
	
	Using GIT repository:
		Import GIT Project from https://github.com/mahimamalpure/infom
		It should download the complete project
		There should not be any errors.
		In case of any errors check classpath configuration.
			
3. Run:
		1. Using JUnit in Eclipse:
				> Right click on Project
				> Run as JUnit test
				> It should start the test, launch browser and perform desired actions
				> At the end of 2 tests, execution status can be seen in JUnit eclipse console
				> Screenshots can be reviewed in /Screenshots folder

4. For more details about framework, please refer to /FrameworkUnderstanding.docx.