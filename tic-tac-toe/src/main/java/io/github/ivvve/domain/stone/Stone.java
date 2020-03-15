package io.github.ivvve.domain.stone;

import io.github.ivvve.domain.player.Player;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class Stone {
    private final Player player;

    boolean isStoneOfSamePlayer(final Stone stone) {
        return Objects.equals(this.player, stone.player);
    }
}
