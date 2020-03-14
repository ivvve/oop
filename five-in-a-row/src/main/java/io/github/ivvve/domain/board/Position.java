package io.github.ivvve.domain.board;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Position {
    @Getter
    private final int x;
    @Getter
    private final int y;

    public Position moveBy(final int x, final int y) {
        return new Position(this.x + x, this.y + y);
    }
}
