package strategy;

import strategy.strategies.IStrategy;

public class Model implements IModel {

  private final int boardLength;

  public Model(int boardLength) {
    this.boardLength = boardLength;
  }

  @Override
  public void playGame(IStrategy strategy) {

  }

  @Override
  public boolean isValidMove(int move) {
    return false;
  }

  @Override
  public int getBoardLength() {
    return boardLength;
  }
}
