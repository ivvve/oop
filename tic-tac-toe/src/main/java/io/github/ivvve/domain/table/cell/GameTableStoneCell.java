package io.github.ivvve.domain.table.cell;

import io.github.ivvve.domain.stone.Stone;
import io.github.ivvve.domain.table.GameTablePoint;

public class GameTableStoneCell extends GameTableCell {
    private final Stone stone;

    public GameTableStoneCell(final GameTablePoint point, final Stone stone) {
        super(point);
        this.stone = stone;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
