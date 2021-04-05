package command.commands;


import command.IExtendedIModel;

public class CommandA implements ICommand {

  public CommandA() {

  }

  @Override
  public void go(IExtendedIModel model) {
    model.commandA();
  }
}
