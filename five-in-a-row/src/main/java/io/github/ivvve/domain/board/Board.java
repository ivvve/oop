package io.github.ivvve.domain.board;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Board {
    private final List<BoardRow> boardRows;

    public static Board getEmptyBoard(final int columnSize, final int rowSize) {
        final List<BoardRow> boardRows = IntStream.range(0, rowSize)
                .mapToObj(i -> BoardRow.getEmptyBoardRow(columnSize))
                .collect(toList());

        return new Board(boardRows);
    }

    public void putStone(final Stone stone, final Position position) {
        if (this.isOutOfBoundary(position)) {
            throw new RuntimeException();
        }

        final BoardRow boardRow = this.boardRows.get(position.getY());
        boardRow.putStone(stone, position);
    }

    public boolean hasNoEmptyCell() {
        return this.boardRows.stream()
                .filter(BoardRow::hasEmptyCell)
                .findAny()
                .isEmpty();
    }

    private boolean is3By3(final Position position) {
        return true; // TODO implement this
    }

    private boolean isOutOfBoundary(final Position position) {
        return false; // TODO implement this
    }
}
