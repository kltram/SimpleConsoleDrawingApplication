package com.scda.console.service.impl;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import com.scda.console.handler.CreateConsoleCommandArgumentHandler;
import com.scda.console.service.CommandService;


public class CreateConsoleCommandArgumentHandlerTest {


	  private CreateConsoleCommandArgumentHandler createConsoleCommandHandlerTest;

	  @Before
	  public void init()
	  {
	    createConsoleCommandHandlerTest = new CreateConsoleCommandArgumentHandler();
	  }

	  @Test
	  public void testCreateConsoleCommandHandler()
	  {
	    byte[] data = "20 6".getBytes();
	    InputStream input = new ByteArrayInputStream(data);
	    Scanner scanner = new Scanner(input);
	    CommandService command = createConsoleCommandHandlerTest.toCommandFrom(scanner);

	    assertTrue(command.getClass().isAssignableFrom(CreateCommandImpl.class));

	    CreateCommandImpl createCommand = (CreateCommandImpl) command;

	    assertEquals(20, createCommand.getWidth());
	    assertEquals(6, createCommand.getHeight());
	  }
	}