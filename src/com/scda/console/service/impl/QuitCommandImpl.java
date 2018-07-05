package com.scda.console.service.impl;

import com.scda.console.Draw;
import com.scda.console.service.CommandService;
/**
 * Implements the CommandService create and  Should quit the program
 * 
 * @see CommandService
 * 
 *  @author Ramesh
 */
public class QuitCommandImpl implements CommandService
{

  @Override
  public void executeOn(Draw drawingTool)
  {
	
	  System.exit(0);
  }
}
