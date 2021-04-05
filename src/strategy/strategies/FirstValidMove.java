package strategy.strategies;

import strategy.IModel;

public class FirstValidMove implements IStrategy{

  public FirstValidMove() {

  }

  @Override
  public int move(IModel model) {
    return findValidSpace(model, 1);
  }

  protected int findValidSpace(IModel model, int increment) {
    int spaceToMoveTo = 0;
    for (int i = 0; i < model.getBoardLength(); i += increment)
      if (model.isValidMove(spaceToMoveTo)) {
        return spaceToMoveTo;
    }

    return -1;
  }
}
