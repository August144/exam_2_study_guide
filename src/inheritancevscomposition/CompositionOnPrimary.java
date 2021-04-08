package inheritancevscomposition;

import java.util.Objects;

public class CompositionOnPrimary implements IAdditionalFunctionality {

  private final IPrimaryInterface primary;

  public CompositionOnPrimary(IPrimaryInterface primary) {
    this.primary = Objects.requireNonNull(primary);
  }

  @Override
  public void commandA() {

  }

  @Override
  public void commandB() {

  }

  @Override
  public void commandC() {

  }
}
