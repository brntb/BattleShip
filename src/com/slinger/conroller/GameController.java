package com.slinger.conroller;

import com.slinger.ShipMaker;
import com.slinger.objects.Board;
import com.slinger.objects.CoordinateValidator;
import java.util.Scanner;

public class GameController {

    private final Board board;
    private final ShipMaker shipMaker;

    public GameController(Board board, Scanner scanner) {
        this.board = board;
        CoordinateValidator validator = new CoordinateValidator(board);
        shipMaker = new ShipMaker(board, validator, scanner);
    }

    public void play() {
        board.printBoard();
        shipMaker.makeShips();
    }


}
