package io.github.usafa_compsci350;

public interface Quoridor {

  // Initialize the game
  void init();

  // Run the main game loop, initializing the match if needed
  void play();

  // Handle game/application exiting
  void exitGame();
}
