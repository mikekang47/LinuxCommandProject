package com.progrowup.linuxcommandproject.application;

import com.progrowup.linuxcommandproject.domain.Command;
import com.progrowup.linuxcommandproject.infra.CommandRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

@SpringBootTest
class CommandServiceTest {

    private CommandRepository commandRepository = mock(CommandRepository.class);

    @BeforeEach
    void setUp() {
        CommandService commandService = new CommandService(commandRepository);

        Command command = Command.builder()
                .id(10L)
                .name("pwd")
                .description("print working directory")
                .utility("searching")
                .build();

        given(commandRepository.save(Command.class)).will(invocation -> {

        })
    }
    @Test
    void getCommand() {

    }
}
