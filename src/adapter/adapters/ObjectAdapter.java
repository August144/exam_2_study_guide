package adapter.adapters;

import adapter.IPrimaryInterface;
import adapter.ISecondaryInterface;
import adapter.SecondaryImplementation;
import java.util.Objects;

public class ObjectAdapter implements IPrimaryInterface {

  private final ISecondaryInterface adaptee;

  // FOR INTERFACE
  public ObjectAdapter(ISecondaryInterface adaptee) {
    this.adaptee = Objects.requireNonNull(adaptee);
  }

  // FOR SPECIFIC CLASS
  public ObjectAdapter() {
    this.adaptee = new SecondaryImplementation();
  }

  @Override
  public void cmdA() {
    this.adaptee.cmdC();
  }

  @Override
  public void cmdB(IPrimaryInterface comparator) {
    this.adaptee.equals(comparator);
  }
}
