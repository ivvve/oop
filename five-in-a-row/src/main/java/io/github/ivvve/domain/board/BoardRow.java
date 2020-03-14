package io.github.ivvve.domain.board;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class BoardRow {
    private final List<BoardCell> cells;

    static BoardRow getEmptyBoardRow(final int columnSize) {
        final List<BoardCell> boardCells = IntStream.range(0, columnSize)
                .mapToObj(i -> BoardCell.getEmptyBoardCell())
                .collect(toList());

        return new BoardRow(boardCells);
    }

    void putStone(final Stone stone, final Position position) {
        final BoardCell boardCell = this.cells.get(position.getX());
        boardCell.putStone(stone);
    }

    boolean hasEmptyCell() {
        return this.cells.stream()
                .filter(BoardCell::isEmpty)
                .findAny()
                .isEmpty();
    }
}
