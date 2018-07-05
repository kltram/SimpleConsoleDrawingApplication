package com.scda.console.service.impl;

import com.scda.console.Draw;
import com.scda.console.service.CommandService;
/**
 * Implements the CommandService create and fill the color to canvas of width w , height h  and color c
 * 
 * @see CommandService
 * 
 *  @author Ramesh
 */
public class FillCommandImpl implements CommandService
{
  private final int  x;
  private final int  y;
  private final char color;

  public FillCommandImpl(int x,
                     int y,
                     char c)
  {
    this.x = x;
    this.y = y;
    this.color = c;
  }

  @Override
  public void executeOn(Draw drawingTool)
  {
    drawingTool.fill(x, y, color);
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public char getColor()
  {
    return color;
  }
}
