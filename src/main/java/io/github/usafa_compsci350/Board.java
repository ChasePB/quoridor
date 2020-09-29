package io.github.usafa_compsci350;

import java.util.ArrayList;

public class Board {
  // Store the walls for the board
  ArrayList<Wall> walls = new ArrayList<Wall>();

  // Store the board's boxes
  ArrayList<Square> squares = new ArrayList<Square>();

  // TODO: toString() - Return an ASCII representation of the aggregate board
  //  data
  @Override
  public String toString() {
    return " a b c d e f g h i \n"
        + " \u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550" +
        "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\n"
        + "9\u2551 | | | | | | | | \u2551\n"
        + " \u2551+-+-+-+-+-+-+-+-+\u2551\n"
        + "8\u2551 | | | | | | | | \u2551\n"
        + " \u2551+-+-+-+-+-+-+-+-+\u2551\n"
        + "7\u2551 | | | | | | | | \u2551\n"
        + " \u2551+-+-+-+-+-+-+-+-+\u2551\n"
        + "6\u2551 | | | | | | | | \u2551\n"
        + " \u2551+-+-+-+-+-+-+-+-+\u2551\n"
        + "5\u2551 | | | | | | | | \u2551\n"
        + " \u2551+-+-+-+-+-+-+-+-+\u2551\n"
        + "4\u2551 | | | | | | | | \u2551\n"
        + " \u2551+-+-+-+-+-+-+-+-+\u2551\n"
        + "3\u2551 | | | | | | | | \u2551\n"
        + " \u2551+-+-+-+-+-+-+-+-+\u2551\n"
        + "2\u2551 | | | | | | | | \u2551\n"
        + " \u2551+-+-+-+-+-+-+-+-+\u2551\n"
        + "1\u2551 | | | | | | | | \u2551\n"
        + " \u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550" +
        "\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\n"
        + "  a b c d e f g h i \n";
  }

}

