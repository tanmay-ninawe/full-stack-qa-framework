
<h4>Install Java & Eclipse - Setup Maven Project from Scratch </h4>


1). Download JDK and install. 

    Windows : 
    - Copy the JDK Home path from Program files.
	- Go to the  Environment variables and add system variables.
	- now locate JDK Home and copy the Path of Bin directory path and add that in the Path option in System variable.
		
    Mac OS :
	- Download the DMG installer if the system has an M1 series chipset. 
	- Download if Mac has intel based chipset.
	- to make the system variables in mac there is a file called  .zshrc(this file is responsible for storing all the environment variables).
	- to check the JAVA Installed directory in Mac use Command : /usr/libexec/java_home -V
	- now go to .zshrc file and add the Path : 
			Eg. export JAVA_HOME=Path address
	- to save that file give command as :wq once it is done.
	- to preserve the changes add command - source ~/.zshrc
	
2). Setting up Eclipse Maven Project with Selenium dependencies from Scratch

	- Download Eclipse and install it. 
	- create a new Maven project.
	- What is Maven??
	    - Maven is a Central repository where all the JAVA related Libraries/JARS were stored. We can use that for our needs. By simply calling the dependencies in our project.
		- Add Group id as -> this is the Organization you’re in.
		- Artifact ID means this is the project you’re working on.
		- once the Maven project is created pom.xml(Heart of the project) file will get created.
		- add the Dependency in the pom.xml. ( this is how we can add JAR files in the project).


![](images/2026-04-20-18-31-23.png)