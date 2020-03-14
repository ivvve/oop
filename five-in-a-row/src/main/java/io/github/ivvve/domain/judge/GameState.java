package io.github.ivvve.domain.judge;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
public enum GameState {
    READY(false),
    RUNNING(false),
    DRAW(true),
    PLAYER_WON(true);

    private final boolean finished;

    boolean isReady() {
        return Objects.equals(this, READY);
    }

    public boolean isDraw() {
        return Objects.equals(this, DRAW);
    }

    boolean isRunning() {
        return Objects.equals(this, RUNNING);
    }

    boolean isFinished() {
        return this.finished;
    }
}
