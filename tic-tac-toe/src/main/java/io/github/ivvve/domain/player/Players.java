package io.github.ivvve.domain.player;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Players {
    private final Queue<Player> players;

    public Players(final Player ...players) {
        this.players = new LinkedList<>(Arrays.asList(players));
    }

    public Player currentPlayer() {
        return this.players.peek();
    }

    public void moveOnToNextTurn() {
        final Player player = this.players.poll();
        this.players.add(player);
    }
}
