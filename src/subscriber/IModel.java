package subscriber;

public interface IModel {
  void addThingToBeHandled(String somethingToHandle);

  void subscribe(IModelEventHandler handler);
}
