package com.scda.console.service.impl;

import java.util.Scanner;

import com.scda.console.service.CommandService;
import com.scda.console.service.ConsoleCommandArgumentService;

public class FillConsoleCommandArgumentHandlerTest implements ConsoleCommandArgumentService {
	@Override
	public CommandService toCommandFrom(Scanner scanner) {
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		char color = scanner.next().charAt(0);

		return new FillCommandImpl(x, y, color);
	}
}
