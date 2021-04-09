package subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Model implements IModel {

  private final List<IModelEventHandler> subs;

  public Model() {
    this.subs = new ArrayList<>();
  }

  @Override
  public void addThingToBeHandled(String somethingToHandle) {
    for (IModelEventHandler sub : subs) {
      sub.handleThing(somethingToHandle);
    }
  }

  @Override
  public void subscribe(IModelEventHandler handler) {
    this.subs.add(Objects.requireNonNull(handler));
  }
}
