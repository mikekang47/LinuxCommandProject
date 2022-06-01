package com.progrowup.linuxcommandproject.application;

import com.progrowup.linuxcommandproject.infra.CommandRepository;
import org.springframework.stereotype.Service;

@Service
public class CommandService {
    private final CommandRepository commandRepository;

    public CommandService(CommandRepository commandRepository) {
        this.commandRepository = commandRepository;
    }
}
