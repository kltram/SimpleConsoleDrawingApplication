# SimpleConsoleDrawingApplication

## Simple Console Drawing Application using Java
 ---------------------------------------------------
 Application Name : SimpleConsoleDrawingApplication
 
 Date : 27:05-2018
 
 Developer : Ramesh
 
 Version : 1.0
 
 Description: You're given the task of writing a simple console version of a drawing program. 
				At this time, the functionality of the program is quire limited but this might change in the future. 
				In a nutshell, the program should work as follows:
 					1. Create a new canvas
 					2. Start drawing on the canvas by issuing various commands
 					3. Quit
					
----------------------------------------------------
##  Software Requirement
--------------------------------------------------------
Java : JDK 1.8
IDE : Any IDE (Eclipse/ Netbeans/ Myeclipse)
--------------------------------------------------------


##  Steps to run the commend line  program using any IDE (Eclipse)
--------------------------------------------------------------

Step 1 : Download the .zip file from google drive

Step 2 : Extract the .zip file

Step 3 : Copy the extracted source file into your current workspace

Step 4 : Import  source file(SimpleConsoleDrawingApplication) 

			4.1 --> From Project Explorer --> Right Click  --> Select "Import" Option
			 4.2 -- Select "Existing Projects into workspace" -- > Click "Next" Button
			 4.3 --> Click "Browse" button to select the project("SimpleConsoleDrawingApplication") from your workspace 
			 4.4 --> Click "Finish" button
			 
Step 5: Project imported Successfully

Step 6: Find the Main class file to compile the project "com.scda.console.main.ConsoleDrawingMainApplication"

step 7: To Run the project Right click the Main class "com.scda.console.main.ConsoleDrawingMainApplication"  --> "Run As"--> Select "Java Application" 

Step 8: "SimpleConsoleDrawingApplication" Successfully executed and To see the console for further operation

Step 8: Now pass the input argument from console as per sample's mentioned in the command

Step 9: Enter the command "C 20 4"  and enter  (C is capital letter )

Step 10: See the console and here successfully created a new canvas of user specified width w and height h

		Output
			-----------------
			|               |
			|               |
			|               |
			|               |
			-----------------
Step 11: Enter the next command: L 13 5 6 2 and enter (L is capital letter )
Step 12: see the output
		  	-----------------
			|               |
			|xxxxxx         |
			|               |
			|               |
			-----------------
Step 13: Enter the next command: R 16 1 20 3 and enter (R is capital letter )

Step 14: see the output
			----------------------
			|               xxxxx|
			|               x   x|
			|               xxxxx|
			|                    |
			----------------------
			
Step 15: Enter the next command: B 10 3 W and enter (B is capital letter )

Step 16:  see the output
		
		----------------------
		|WWWWWWWWWWWWWWWxxxxx|
		|WWWWWWWWWWWWWWWx   x|
		|WWWWWWWWWWWWWWWxxxxx|
		|WWWWWWWWWWWWWWWWWWWW|
		----------------------
Step 16: Enter the next command: Q and enter (Q is capital letter )

Step 17:  quit the application execution

Step 18 : Suppose user enter any wrong command and press the enter button

Step 17:   See the output 

-----------------------Unsupported command-----------------------Please enter the valid command


Sample I/O


##   Below is a sample run of the program. User input is prefixed with ’enter command:’.

enter command: C 20 4
----------------------
|                    |
|                    |
|                    |
|                    |
----------------------

enter command: L 1 2 6 2
----------------------
|                    |
|xxxxxx              |
|                    |
|                    |
----------------------

enter command: L 6 3 6 4
----------------------
|                    |
|xxxxxx              |
|     x              |
|     x              |
----------------------
enter command: R 16 1 20 3
----------------------
|               xxxxx|
|xxxxxx         x   x|
|     x         xxxxx|
|     x              |
----------------------

enter command: B 10 3 o
----------------------
|oooooooooooooooxxxxx|
|xxxxxxooooooooox   x|
|     xoooooooooxxxxx|
|     xoooooooooooooo|
----------------------

enter command: Q
