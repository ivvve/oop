package io.github.ivvve.domain.table.cell;

import io.github.ivvve.domain.table.GameTablePoint;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class GameTableCell {
    private final GameTablePoint point;

    public static GameTableCell getEmptyCell(final GameTablePoint point) {
        return new GameTableEmptyCell(point);
    }

    public abstract boolean isEmpty();
}
