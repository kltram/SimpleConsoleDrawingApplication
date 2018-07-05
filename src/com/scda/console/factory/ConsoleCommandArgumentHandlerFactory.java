package com.scda.console.factory;

import java.util.HashMap;
import java.util.Map;

import com.scda.console.enumerable.ConsoleCommandEnum;
import com.scda.console.handler.CreateConsoleCommandArgumentHandler;
import com.scda.console.handler.FillConsoleCommandArgumentHandler;
import com.scda.console.handler.LineConsoleCommandArgumentHandler;
import com.scda.console.handler.QuitConsoleCommandArgumentHandler;
import com.scda.console.handler.RectangleConsoleCommandArgumentHandler;
import com.scda.console.handler.UnknownConsoleCommandArgumentHandler;
import com.scda.console.service.ConsoleCommandArgumentService;

public class ConsoleCommandArgumentHandlerFactory
{
  private final Map<ConsoleCommandEnum, ConsoleCommandArgumentService> handlerMap = new HashMap<ConsoleCommandEnum, ConsoleCommandArgumentService>();

  public ConsoleCommandArgumentHandlerFactory()
  {
    handlerMap.put(ConsoleCommandEnum.CREATE, new CreateConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommandEnum.LINE, new LineConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommandEnum.RECTANGLE, new RectangleConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommandEnum.FILL, new FillConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommandEnum.QUIT, new QuitConsoleCommandArgumentHandler());
    handlerMap.put(ConsoleCommandEnum.UNKNOWN, new UnknownConsoleCommandArgumentHandler());
  }

  public ConsoleCommandArgumentService handlerFor(ConsoleCommandEnum consoleCommand)
  {
    return handlerMap.get(consoleCommand);
  }
}
