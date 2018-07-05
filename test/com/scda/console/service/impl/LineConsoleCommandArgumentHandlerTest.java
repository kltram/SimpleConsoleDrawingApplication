package com.scda.console.service.impl;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.scda.console.handler.LineConsoleCommandArgumentHandler;
import com.scda.console.service.CommandService;


public class LineConsoleCommandArgumentHandlerTest {

	 private LineConsoleCommandArgumentHandler lineConsoleCommandHandlerTest;

	  @Before
	  public void init()
	  {
	    lineConsoleCommandHandlerTest = new LineConsoleCommandArgumentHandler();
	  }

	  @Test
	  public void testFillConsoleCommandHandler()
	  {
	    byte[] data = "2 6 2 10".getBytes();
	    InputStream input = new ByteArrayInputStream(data);
	    Scanner scanner = new Scanner(input);
	    CommandService command = lineConsoleCommandHandlerTest.toCommandFrom(scanner);

	    assertTrue(command.getClass().isAssignableFrom(LineCommandImpl.class));

	    LineCommandImpl lineCommand = (LineCommandImpl) command;

	    assertEquals(2, lineCommand.getX1());
	    assertEquals(6, lineCommand.getY1());
	    assertEquals(2, lineCommand.getX2());
	    assertEquals(10, lineCommand.getY2());
	  }
	}
