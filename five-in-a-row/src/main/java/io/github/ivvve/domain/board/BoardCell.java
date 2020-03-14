package io.github.ivvve.domain.board;

import java.util.Objects;

public class BoardCell {
    private Stone stone;

    static BoardCell getEmptyBoardCell() {
        return new BoardCell();
    }

    void putStone(final Stone stone) {
        if (!this.isEmpty()) {
            throw new RuntimeException();
        }

        this.stone = stone;
    }

    boolean isEmpty() {
        return Objects.isNull(this.stone);
    }
}
