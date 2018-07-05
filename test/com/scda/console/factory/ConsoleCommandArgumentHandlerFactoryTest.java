package com.scda.console.factory;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.scda.console.enumerable.ConsoleCommandEnum;


public class ConsoleCommandArgumentHandlerFactoryTest
{
  private ConsoleCommandArgumentHandlerFactory consoleCommandArgumentHandlerFactory;

  @Before
  public void init()
  {
	  consoleCommandArgumentHandlerFactory = new ConsoleCommandArgumentHandlerFactory();
  }

  @Test
  public void testConsoleCommandHandlers()
  {
    for (ConsoleCommandEnum command : ConsoleCommandEnum.values()) {
      assertNotNull(consoleCommandArgumentHandlerFactory.handlerFor(command));
    }
  }
}
