package io.github.ivvve.domain.table;

import lombok.Getter;

public class GameTablePoint {
    private static int MIN_POINT_VALUE = 0;
    private static int MAX_POINT_VALUE = 2;

    @Getter
    private final int x;
    @Getter
    private final int y;

    public GameTablePoint(final int x, final int y) {
        this.validatePointValue(x);
        this.validatePointValue(y);

        this.x = x;
        this.y = y;
    }

    private static void validatePointValue(final int value) {
        if ((value < MIN_POINT_VALUE) || (MAX_POINT_VALUE < value)) {
            throw new RuntimeException("Invalid Point Value");
        }
    }
}
