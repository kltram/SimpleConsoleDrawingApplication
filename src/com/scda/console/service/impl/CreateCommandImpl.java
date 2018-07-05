package com.scda.console.service.impl;

import com.scda.console.Draw;
import com.scda.console.service.CommandService;
/**
 * Implements the CommandService create and draw a new canvas of width w and height h
 * 
 * @see CommandService
 * 
 *  @author Ramesh
 */
public class CreateCommandImpl implements CommandService
{
  private final int width;
  private final int height;

  public CreateCommandImpl(int w,
                       int h)
  {
    width = w;
    height = h;
  }

  @Override
  public void executeOn(Draw drawingTool)
  {
    drawingTool.crateCanvas(width, height);
  }

  public int getWidth()
  {
    return width;
  }

  public int getHeight()
  {
    return height;
  }
}
