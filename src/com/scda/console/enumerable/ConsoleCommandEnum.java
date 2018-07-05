package com.scda.console.enumerable;

public enum ConsoleCommandEnum
{
  CREATE("C"),
  LINE("L"),
  RECTANGLE("R"),
  FILL("B"),
  QUIT("Q"),
  UNKNOWN("U");

  private final String c;

  private ConsoleCommandEnum(String c)
  {
    this.c = c;
  }

  private String getCommandCharacter()
  {
    return c;
  }

  public static ConsoleCommandEnum parse(String c)
  {
    for (ConsoleCommandEnum command : values()) {
      if (command.getCommandCharacter().equals(c)) {
        return command;
      }
    }
    return UNKNOWN;
  }
}
