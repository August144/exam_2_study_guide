package command.commands;

import command.IExtendedIModel;

public interface ICommand {
  void go(IExtendedIModel model);
}
