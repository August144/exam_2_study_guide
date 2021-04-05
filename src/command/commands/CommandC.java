package command.commands;


import command.IExtendedIModel;

public class CommandC implements ICommand {

  private final int param;

  public CommandC(int param) {

    this.param = param;
  }

  @Override
  public void go(IExtendedIModel model) {
    model.commandC(param);
  }
}
