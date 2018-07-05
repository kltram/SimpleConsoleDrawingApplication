package com.scda.console.handler;

import java.util.Scanner;

import com.scda.console.service.CommandService;
import com.scda.console.service.ConsoleCommandArgumentService;

public class UnknownConsoleCommandArgumentHandler implements ConsoleCommandArgumentService
{
  @Override
  public CommandService toCommandFrom(Scanner scanner)
  {
    scanner.nextLine();
    throw new IllegalArgumentException("Unsupported command");
  }
}
