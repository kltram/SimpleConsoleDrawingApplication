package com.scda.console.enumerable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConsoleCommandEnumTest
{

  @Test
  public void testCommandParsing()
  {
    assertEquals(ConsoleCommandEnum.CREATE, ConsoleCommandEnum.parse("C"));
    assertEquals(ConsoleCommandEnum.LINE, ConsoleCommandEnum.parse("L"));
    assertEquals(ConsoleCommandEnum.RECTANGLE, ConsoleCommandEnum.parse("R"));
    assertEquals(ConsoleCommandEnum.FILL, ConsoleCommandEnum.parse("B"));
    assertEquals(ConsoleCommandEnum.QUIT, ConsoleCommandEnum.parse("Q"));
    assertEquals(ConsoleCommandEnum.UNKNOWN, ConsoleCommandEnum.parse("D"));
  }
}
