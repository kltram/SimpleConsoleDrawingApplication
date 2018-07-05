package com.scda.console.handler;

import java.util.Scanner;

import com.scda.console.service.CommandService;
import com.scda.console.service.ConsoleCommandArgumentService;
import com.scda.console.service.impl.RectangleCommandImpl;

public class RectangleConsoleCommandArgumentHandler implements ConsoleCommandArgumentService
{
  @Override
  public CommandService toCommandFrom(Scanner scanner)
  {
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();

    return new RectangleCommandImpl(x1, y1, x2, y2);
  }
}
