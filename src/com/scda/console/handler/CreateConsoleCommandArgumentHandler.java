package com.scda.console.handler;

import java.util.Scanner;

import com.scda.console.service.CommandService;
import com.scda.console.service.ConsoleCommandArgumentService;
import com.scda.console.service.impl.CreateCommandImpl;

public class CreateConsoleCommandArgumentHandler implements ConsoleCommandArgumentService
{
  @Override
  public CommandService toCommandFrom(Scanner scanner)
  {
    int width = scanner.nextInt();
    int height = scanner.nextInt();

    return new CreateCommandImpl(width, height);
  }
}
