package strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import strategy.strategies.DualStrategy;
import strategy.strategies.FirstValidEvenMove;
import strategy.strategies.FirstValidMove;
import strategy.strategies.IStrategy;

public class Controller {

  private final Map<String, Function<Scanner, IStrategy>> knownStrategies;
  private final Scanner scanner;

  public Controller(Scanner scanner) {
    this.scanner = scanner;
    knownStrategies = new HashMap<>();
    knownStrategies.put("easy", s -> new DualStrategy(
        new FirstValidEvenMove(), new FirstValidMove()));
    knownStrategies.put("hard", s -> new FirstValidMove());
  }

  public void setupModel(IModel model) {
    while (scanner.hasNext()) {
      String difficulty = scanner.next();

      if (difficulty.equals("q") || difficulty.equals("quit")) {
        return;
      }

      Function<Scanner, IStrategy> strategy = knownStrategies.getOrDefault(difficulty, null);

      if (strategy == null) {
        throw new IllegalArgumentException();
      } else {
        model.playGame(strategy.apply(scanner));
      }
    }
  }

}
