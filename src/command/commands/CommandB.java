package command.commands;


import command.IExtendedIModel;

public class CommandB implements ICommand {

  public CommandB() {

  }

  @Override
  public void go(IExtendedIModel model) {
    model.commandB();
  }
}
