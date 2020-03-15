package io.github.ivvve.domain.table;

import io.github.ivvve.domain.stone.Stone;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class GameTable {
    public static final int COLUMN_SIZE = 3;
    public static final int ROW_SIZE = 3;

    private final List<GameTableRow> rows;

    public static GameTable getEmptyTable() {
        final List<GameTableRow> rows = IntStream.rangeClosed(0, ROW_SIZE)
                .mapToObj(GameTableRow::getEmptyRow)
                .collect(toList());

        return new GameTable(rows);
    }

    public void putStone(final GameTablePoint point, final Stone stone) {
        final GameTableRow row = this.rows.get(point.getY());
        row.putStone(point, stone);
    }

//    public List<List<GameTableCell>> getAllCells() {
//        return this.rows.stream()
//                .map(row -> row.getCells())
//                .collect(Collectors.toUnmodifiableList());
//    }
}
