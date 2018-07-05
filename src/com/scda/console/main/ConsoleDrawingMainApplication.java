package com.scda.console.main;

import java.util.Scanner;


import com.scda.console.enumerable.ConsoleCommandEnum;
import com.scda.console.factory.ConsoleCommandArgumentHandlerFactory;
import com.scda.console.service.CommandService;
import com.scda.console.Draw;

public class ConsoleDrawingMainApplication {


	  private final static ConsoleCommandArgumentHandlerFactory handlerFactory = new ConsoleCommandArgumentHandlerFactory();

	  public static void main(String[] args)
	  {
	    Scanner scanner = new Scanner(System.in);
	    Draw drawingTool = new Draw();
	    ConsoleCommandEnum consoleCommand = ConsoleCommandEnum.UNKNOWN;

	    do {
	      System.out.print("Please enter the command on given below format's:\n \n Example's Console Command \n 1. C 20 4 \n 2. L 1 2 6 2 \n 3. R 16 1 20 3 \n 4. B 10 3 W \n 5. Q \n 6. U");
	      System.out.print("\n \n Please enter the command:");
	      try {
	        consoleCommand = ConsoleCommandEnum.parse(scanner.next());
	        CommandService command = handlerFactory.handlerFor(consoleCommand).toCommandFrom(scanner);
	        command.executeOn(drawingTool);

	        drawingTool.draw(System.out);
	      }
	      catch (Exception ex) {
	        System.out.println("\n-----------------------"+ex.getMessage()+"-----------------------Please enter the valid command\n");
	      } 
	    }
	    while (consoleCommand != ConsoleCommandEnum.QUIT);
	    scanner.close();
	    System.out.println(" Application terminated");
	    System.exit(0);
	  }

}
