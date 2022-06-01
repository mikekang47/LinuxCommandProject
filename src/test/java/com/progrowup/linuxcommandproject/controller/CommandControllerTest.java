package com.progrowup.linuxcommandproject.controller;

import com.progrowup.linuxcommandproject.application.CommandService;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(CommandController.class)
class CommandControllerTest {

    private CommandService commandService;


}
