package strategy;

import strategy.strategies.IStrategy;

public interface IModel {
  void playGame(IStrategy strategy);
}
