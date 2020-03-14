package io.github.ivvve.domain.board;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public class Stone {
    private final Player player;

    boolean isPutBy(final Player player) {
        return Objects.equals(this.player, player);
    }
}
