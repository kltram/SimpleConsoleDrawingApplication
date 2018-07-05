package com.scda.console.service;

import java.util.Scanner;
/**
 * Defines the console command argument for the user related arguments 
 * 
 * @author Ramesh
 *
 */
public interface ConsoleCommandArgumentService
{
  CommandService toCommandFrom(Scanner scanner);
}
