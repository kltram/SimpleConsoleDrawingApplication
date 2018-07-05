package com.scda.console.service.impl;
import com.scda.console.Draw;
/**
 * Implements the CommandService   
 *  Unknown command
 * 
 * @see CommandService
 * 
 *  @author Ramesh
 */
import com.scda.console.service.CommandService;

public class UnknownCommandImpl implements CommandService
{
  @Override
  public void executeOn(Draw drawingTool)
  {
    // noop
  }
}
