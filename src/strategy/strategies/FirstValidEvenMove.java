package strategy.strategies;

import strategy.IModel;

public class FirstValidEvenMove extends FirstValidMove implements IStrategy {

  public FirstValidEvenMove() {
    super();
  }

  @Override
  public int move(IModel model) {
    return findValidSpace(model, 2);
  }
}
