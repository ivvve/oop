package io.github.ivvve.domain.board;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class Player {
    @Getter
    private final String name;

    public Stone pickStone() {
        return new Stone(this);
    }
}
