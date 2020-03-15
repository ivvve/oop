package io.github.ivvve.domain.table;

import io.github.ivvve.domain.stone.Stone;
import io.github.ivvve.domain.table.cell.GameTableCell;
import io.github.ivvve.domain.table.cell.GameTableStoneCell;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class GameTableRow {
    private final List<GameTableCell> cells;

    static GameTableRow getEmptyRow(final int row) {
        final List<GameTableCell> emptyCells = IntStream.range(0, GameTable.COLUMN_SIZE)
                .mapToObj(column -> new GameTablePoint(column, row))
                .map(GameTableCell::getEmptyCell)
                .collect(toList());

        return new GameTableRow(emptyCells);
    }

    void putStone(final GameTablePoint point, final Stone stone) {
        this.cells.set(point.getX(), new GameTableStoneCell(point, stone));
    }

    public List<GameTableCell> getCells() {
        return Collections.unmodifiableList(cells);
    }
}
