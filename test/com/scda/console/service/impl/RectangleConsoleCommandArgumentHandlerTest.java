package com.scda.console.service.impl;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.scda.console.handler.RectangleConsoleCommandArgumentHandler;
import com.scda.console.service.CommandService;

public class RectangleConsoleCommandArgumentHandlerTest {

	 private RectangleConsoleCommandArgumentHandler rectangleConsoleCommandHandlerTest;

	  @Before
	  public void init()
	  {
	    rectangleConsoleCommandHandlerTest = new RectangleConsoleCommandArgumentHandler();
	  }

	  @Test
	  public void testFillConsoleCommandHandler()
	  {
	    byte[] data = "2 3 7 8".getBytes();
	    InputStream input = new ByteArrayInputStream(data);
	    Scanner scanner = new Scanner(input);
	    CommandService command = rectangleConsoleCommandHandlerTest.toCommandFrom(scanner);

	    assertTrue(command.getClass().isAssignableFrom(RectangleCommandImpl.class));

	    RectangleCommandImpl rectangleCommand = (RectangleCommandImpl) command;

	    assertEquals(2, rectangleCommand.getX1());
	    assertEquals(3, rectangleCommand.getY1());
	    assertEquals(7, rectangleCommand.getX2());
	    assertEquals(8, rectangleCommand.getY2());
	  }
	}