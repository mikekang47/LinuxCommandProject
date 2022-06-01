package com.progrowup.linuxcommandproject.controller;

import com.progrowup.linuxcommandproject.application.CommandService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommandController {
    private CommandService commandService;

    public CommandController(CommandService commandService) {
        this.commandService = commandService;
    }

    
}
