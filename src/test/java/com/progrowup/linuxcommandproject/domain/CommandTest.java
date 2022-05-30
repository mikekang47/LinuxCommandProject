package com.progrowup.linuxcommandproject.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommandTest {

    @Test
    void createCommand() {
        Command command = Command.builder()
                .id(1L)
                .name("pwd")
                .description("print current working directory")
                .utility("directory")
                .build();

        assertThat(command.getId()).isEqualTo(1L);
        assertThat(command.getName()).isEqualTo("pwd");
        assertThat(command.getDescription()).isNotEmpty();
        assertThat(command.getUtility()).isEqualTo("directory");

    }
}
