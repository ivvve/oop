package io.github.ivvve.domain.judge;

import io.github.ivvve.domain.board.Board;
import io.github.ivvve.domain.board.Player;
import io.github.ivvve.domain.board.Players;
import io.github.ivvve.domain.board.Position;
import lombok.Getter;

public class GameReferee {
    private final Players players;
    private final GameStateChecker gameStateChecker;
    private GameState gameState;
    private Board board;
    @Getter
    private Player winner;

    public GameReferee(final Players players, final GameStateChecker gameStateChecker) {
        this.players = players;
        this.gameStateChecker = gameStateChecker;
        this.gameState = GameState.READY;
        this.board = null;
        this.winner = null;
    }

    public void startGame(final int columnSize, final int rowSize) {
        if (!this.gameState.isReady()) {
            throw new RuntimeException();
        }

        this.board = Board.getEmptyBoard(columnSize, rowSize);
        this.gameState = GameState.RUNNING;
    }

    public void nextTurn(final Position position) {
        if (this.gameState.isFinished()) {
            throw new RuntimeException();
        }

        final Player player = this.players.nextPlayer();
        this.board.putStone(player.pickStone(), position);

        if (this.gameStateChecker.isFinished(board)) {
            this.gameState = GameState.PLAYER_WON;
            this.winner = player;
            return;
        }

        if (this.board.hasNoEmptyCell()) {
            this.gameState = GameState.DRAW;
            return;
        }
    }

    public Player getCurrentPlayer() {
        return this.players.getCurrentPlayer();
    }

    public boolean isRunning() {
        return this.gameState.isRunning();
    }

    public boolean isDraw() {
        return this.gameState.isDraw();
    }
}
