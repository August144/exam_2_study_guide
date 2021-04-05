package command.commands;


import command.IExtendedIModel;

public class CommandD implements ICommand {

  private final int param;

  public CommandD(int param) {

    this.param = param;
  }

  @Override
  public void go(IExtendedIModel model) {
    model.commandD(param);
  }
}
