package com.scda.console.service.impl;

import com.scda.console.Draw;
import com.scda.console.service.CommandService;
/**
 * Implements the CommandService   
 * Should create a new rectangle, whose upper left corner is (x1,y1) and
 * lower right corner is (x2,y2). Horizontal and vertical lines will be drawn
 * using the 'x' character
 * 
 * @see CommandService
 * 
 *  @author Ramesh
 */
public class RectangleCommandImpl implements CommandService
{
  private final int x1;
  private final int y1;
  private final int x2;
  private final int y2;

  public RectangleCommandImpl(int x1,
                          int y1,
                          int x2,
                          int y2)
  {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  @Override
  public void executeOn(Draw drawingTool)
  {
    drawingTool.addRectangle(x1, y1, x2, y2);
  }

  public int getX1()
  {
    return x1;
  }

  public int getY1()
  {
    return y1;
  }

  public int getX2()
  {
    return x2;
  }

  public int getY2()
  {
    return y2;
  }
}
