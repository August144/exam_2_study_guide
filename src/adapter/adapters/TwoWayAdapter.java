package adapter.adapters;

import adapter.IPrimaryInterface;
import adapter.ISecondaryInterface;
import adapter.SecondaryImplementation;
import java.util.Objects;

public class TwoWayAdapter implements IPrimaryInterface, ISecondaryInterface {

  private final ISecondaryInterface adaptee;

  // FOR INTERFACE
  public TwoWayAdapter(ISecondaryInterface adaptee) {
    this.adaptee = Objects.requireNonNull(adaptee);
  }

  // FOR SPECIFIC CLASS
  public TwoWayAdapter() {
    this.adaptee = new SecondaryImplementation();
  }

  @Override
  public void cmdA() {

  }

  @Override
  public void cmdB(IPrimaryInterface comparator) {

  }

  @Override
  public void cmdC() {
    adaptee.cmdC();
  }

  @Override
  public void cmdD(ISecondaryInterface comparator) {
    adaptee.cmdD(comparator);
  }
}
