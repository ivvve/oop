package io.github.ivvve.domain.board;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Players {
    private final Queue<Player> players;

    public Players(final Player ...players) {
        this.players = new LinkedList<>(Arrays.asList(players));
    }

    public Player nextPlayer() {
        final Player nextPlayer = this.players.poll();
        this.players.add(nextPlayer);
        return nextPlayer;
    }

    public Player getCurrentPlayer() {
        return this.players.peek();
    }
}
