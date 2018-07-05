package com.scda.console.service.impl;

import com.scda.console.Draw;
import com.scda.console.service.CommandService;
/**
 * Implements the CommandService create and draw the line to new canvas of line start x1 ,line start y1,  
 * line end x1 and line end y2
 * 
 * @see CommandService
 * 
 *  @author Ramesh
 */
public class LineCommandImpl implements CommandService
{
  private final int x1;
  private final int y1;
  private final int x2;
  private final int y2;

  public LineCommandImpl(int x1,
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
    drawingTool.addLine(x1, y1, x2, y2);
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
