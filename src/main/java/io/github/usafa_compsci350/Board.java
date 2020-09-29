package io.github.usafa_compsci350;

// TODO: Update/remove comment for error suppression
//import java.util.ArrayList;
// TODO: Update/remove comment for error suppression
//import java.util.List;

public class Board {
  // Store the walls for the board
  // TODO: Update/remove comment for error suppression
  //  List<Wall> walls = new ArrayList<Wall>();

  // Store the board's boxes
  // TODO: Update/remove comment for error suppression
  //  List<Square> squares = new ArrayList<Square>();

  // TODO: toString() - Return an ASCII representation of the aggregate board
  //  data
  @Override
  public String toString() {
    return " a b c d e f g h i\n"
        + " ===================\n"
        + "9| : : : : : : : : |\n"
        + " |+-+-+-+-+-+-+-+-+|\n"
        + "8| : : : : : : : : |\n"
        + " |+-+-+-+-+-+-+-+-+|\n"
        + "7| : : : : : : : : |\n"
        + " |+-+-+-+-+-+-+-+-+|\n"
        + "6| : : : : : : : : |\n"
        + " |+-+-+-+-+-+-+-+-+|\n"
        + "5| : : : : : : : : |\n"
        + " |+-+-+-+-+-+-+-+-+|\n"
        + "4| : : : : : : : : |\n"
        + " |+-+-+-+-+-+-+-+-+|\n"
        + "3| : : : : : : : : |\n"
        + " |+-+-+-+-+-+-+-+-+|\n"
        + "2| : : : : : : : : |\n"
        + " |+-+-+-+-+-+-+-+-+|\n"
        + "1| : : : : : : : : |\n"
        + "  ===================\n"
        + "  a b c d e f g h i \n";
  }



}

