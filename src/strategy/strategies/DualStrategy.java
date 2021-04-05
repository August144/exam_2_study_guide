package strategy.strategies;

import strategy.IModel;

public class DualStrategy implements IStrategy {

  private final IStrategy mainStrategy;
  private final IStrategy secondaryStrategy;

  public DualStrategy(IStrategy mainStrategy, IStrategy secondaryStrategy) {

    this.mainStrategy = mainStrategy;
    this.secondaryStrategy = secondaryStrategy;
  }

  @Override
  public int move(IModel model) {
    int firstStrategy = mainStrategy.move(model);

    if (firstStrategy != -1) {
      return firstStrategy;
    }

    return secondaryStrategy.move(model);
  }
}
