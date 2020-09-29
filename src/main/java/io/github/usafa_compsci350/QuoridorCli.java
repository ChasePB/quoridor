package io.github.usafa_compsci350;

import java.util.Scanner;

public class QuoridorCli implements Quoridor {
  // The Quoridor game's playing board
  private Board board;

  // Global exit flag
  private boolean exit = false;

  // Global input Scanner
  private Scanner sc;

  // Global player count
  public int numberOfPlayers;

  QuoridorCli() {
    System.out.println("Welcome to Quoridor!\n");
    sc = new Scanner(System.in);
    init();
  }

  // init() - Initialize game.
  @Override
  public void init() {
    board = new Board();

    System.out.println("How many players will there be (2 or 4)?");
    // TODO: Handle errors/valid input test
    numberOfPlayers = Integer.parseInt(getInput());

    // TODO: Write out notation instructions/format for wall or pawn movement

    // Draw the board
    drawBoard();
  }

  // play() - Game event loop handler
  @Override
  public void play() {
    while (!exit) {
      for (int i = 1; i <= numberOfPlayers; i++) {
        System.out.println("\nIt is Player " + i + "'s turn!");
        exit = conductPlayerTurn(i);
      }
    }
    // Exit the game application
    exitGame();
  }

  // TODO: conductPlayerTurn() - Conducts a player's turn, returns an exit
  //  application condition
  private boolean conductPlayerTurn(int playerNumber) {
    // Get and store user move choice input, using pre-defined notation*
    System.out.println("Enter your move choice: ");
    String input = getInput();

    boolean endState = checkMove(input);
    drawBoard();
    if (endState) {
      return checkEndState();
    }

    // Return false by default to continue rotating player turns
    return false;
  }


  // getInput() - Gets the player input from the command line, returning a
  //  string of their input
  private String getInput() {
    return sc.nextLine();
  }

  // TODO: checkMove() - Check for a valid wall placement/pawn movement choice,
  //  returning a boolean for end state being met
  private boolean checkMove(String input) {
    // TODO: Prompt for player's move choice until a valid move is chosen and
    //  returned - while(true)
    // TODO:    Obtain player input

    // TODO:    Parse the user input for move choice type and validate the move
    //  (Convert form/notation if needed)
    // TODO:        Check if the move choice is for placing a wall and validate/
    //  post data
    // TODO:        Check if the move choice is for moving the pawn and validate
    //  /post data, return result boolean endState if reached

    // Return false by default when game end state is not met from the turn's
    // move
    return false;
  }

  // TODO: checkWallMove() - Check wall placement choice, post data if valid
  private void checkWallMove(String input) {
  }

  // TODO: checkPawnMove() - Check pawn move choice, post data if valid, return
  //  boolean of end state being reached
  private boolean checkPawnMove(String input) {
    return false;
  }

  // TODO: checkEndState() - Return true/false for a game-ending condition being
  //  met
  private boolean checkEndState() {
    // TODO: Check for a game ending condition:
    //  If found, prompt for replay choice and re-init game if chosen and return
    //  true for replay

    // Return false by default if replay not chosen
    return false;
  }

  // Draw the board to the console
  private void drawBoard() {
    System.out.println(board.toString());
  }

  // TODO: exitGame() - Conduct any necessary game/App cleanup and exiting
  //  messages
  @Override
  public void exitGame() {
    // Update global exit condition
    exit = true;
  }
}
