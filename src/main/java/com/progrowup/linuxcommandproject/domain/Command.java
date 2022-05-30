package com.progrowup.linuxcommandproject.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Command {
    private Long id;

    private String name;

    private String utility;

    private String description;
}
