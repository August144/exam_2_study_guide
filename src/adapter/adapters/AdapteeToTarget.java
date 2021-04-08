package adapter.adapters;

import adapter.ISecondaryInterface;
import adapter.PrimaryImplementation;

public class AdapteeToTarget extends PrimaryImplementation implements ISecondaryInterface {

  @Override
  public void cmdC() {
    //these are the cool new commands being implemented

  }

  @Override
  public void cmdD(ISecondaryInterface comparator) {

  }
}
