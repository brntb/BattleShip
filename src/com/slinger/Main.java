package com.slinger;

import com.slinger.conroller.GameController;
import com.slinger.objects.Board;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board(10);
        GameController gameController = new GameController(board, scanner);
        gameController.play();

    }
}
