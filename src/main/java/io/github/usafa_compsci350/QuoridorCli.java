package io.github.usafa_compsci350;

public class QuoridorCli implements Quoridor {
  // The Quoridor game's playing board
  Board board;

  // Global exit flag
  boolean exit = false;

  QuoridorCli() {
    // TODO: Output Welcome message and handle any first-run initial setup then
    //  - init()
  }

  // TODO: init() - Initialize game
  @Override
  public void init() {
    // TODO: Initialize any default game values - board
    // TODO: Get amount of players
    // TODO: Start game
  }

  // TODO: play() - Game event loop handler
  @Override
  public void play() {
    // TODO: Create game loop (while(!exit))
    // TODO:    Conduct player turn, keeping track of player # and store exiting
    //  condition - conductPlayerTurn()
  }

  //   TODO: conductPlayerTurn() - Conducts a player's turn, returns an exit
  //    application condition
  //  private boolean conductPlayerTurn(int playerNumber) {
  //    // TODO:    Get player Input - getInput()
  //    // TODO:    Check the player move - checkMove() - Store an endState
  //        boolean
  //    // TODO:    Update/draw the game board - drawBoard()
  //    // TODO:    Handle if endState condition - checkEndState()
  //    // TODO:        Return boolean of exitGame()
  //
  //    // Return false by default to continue rotating player turns
  //    return false;
  //  }
  //
  //  // TODO: getInput() - Gets the player input from the command line,
  //      returning a
  //  //  string of their input
  //  private String getInput() {
  //    return null;
  //  }
  //
  //  // TODO: checkMove() - Check for a valid wall placement/pawn movement
  //      choice
  //
  //  //  returning a boolean for end state being met
  //  private boolean checkMove(String input) {
  //    // TODO: Prompt for player's move choice until a valid move is chosen
  //     and
  //    //  returned - while(true)
  //     // TODO:    Obtain player input
  //
  //    // TODO:    Parse the user input for move choice type and validate the
  //        move
  //    //  (Convert form/notation if needed)
  //    // TODO:        Check if the move choice is for placing a wall and
  //        validate/
  //    //  post data
  //    // TODO:        Check if the move choice is for moving the pawn and
  //        validate
  //    //  /post data, return result boolean endState if reached
  //
  //    // Return false by default when game end state is not met from the
  //    turn's
  //    // move
  //    return false;
  //  }
  //
  //  // TODO: checkWallMove() - Check wall placement choice, post data if valid
  //  private void checkWallMove(String input) {
  //  }
  //
  //  // TODO: checkPawnMove() - Check pawn move choice, post data if valid,
  //      return
  //  //  boolean of end state being reached
  //  private boolean checkPawnMove(String input) {
  //    return false;
  //  }
  //
  //  // TODO: checkEndState() - Return true/false for a game-ending condition
  //      being
  //  //  met
  //  private boolean checkEndState() {
  //    // TODO: Check for a game ending condition:
  //    //  If found, prompt for replay choice and re-init game if chosen and
  //     return
  //    //  true for replay
  //
  //    // Return false by default if replay not chosen
  //    return false;
  //  }

  // TODO: exitGame() - Conduct any necessary game/App cleanup and exiting
  //  messages
  @Override
  public void exitGame() {
    // Update global exit condition
    exit = true;
  }
}
