package command;

import command.commands.CommandA;
import command.commands.CommandB;
import command.commands.CommandC;
import command.commands.CommandD;
import command.commands.ICommand;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

public class Controller {

  private final Map<String, Function<Scanner, ICommand>> knownCommands;
  private final Scanner scanner;

  public Controller(Scanner scanner) {
    this.scanner = scanner;
    knownCommands = new HashMap<>();
    knownCommands.put("commandA", s -> new CommandA());
    knownCommands.put("commandB", s -> new CommandB());
    knownCommands.put("commandC", s -> new CommandC(s.nextInt()));
    knownCommands.put("commandD", s -> new CommandD(s.nextInt()));
  }

  public void setupModel(IExtendedIModel model) {
    while (scanner.hasNext()) {
      String commandName = scanner.next();

      if (commandName.equals("q") || commandName.equals("quit")) {
        return;
      }

      Function<Scanner, ICommand> cmd = knownCommands.getOrDefault(commandName, null);

      if (cmd == null) {
        throw new IllegalArgumentException();
      } else {
        cmd.apply(scanner).go(model);
      }
    }
  }
}
