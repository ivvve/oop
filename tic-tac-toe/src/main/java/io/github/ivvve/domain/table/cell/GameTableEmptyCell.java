package io.github.ivvve.domain.table.cell;

import io.github.ivvve.domain.table.GameTablePoint;

public class GameTableEmptyCell extends GameTableCell {
    public GameTableEmptyCell(final GameTablePoint point) {
        super(point);
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
}
