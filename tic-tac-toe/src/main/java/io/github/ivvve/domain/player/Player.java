package io.github.ivvve.domain.player;

import io.github.ivvve.domain.stone.Stone;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class Player {
    @Getter
    private final String name;

    public Stone pickStone() {
        return new Stone(this);
    }
}
