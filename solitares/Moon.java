package assignmenttwo.solitares;

/**
 * class to get monns name and radius.
 */
public class Moon {

  private String name;
  private int avgRadiusInKm;

  /**
   * name and radius.
   */
  public Moon(String name, int avgRadiusInKm) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
  }

  /**
   * return moons name.
   */
  public String getName() {
    return name;
  }

  /**
   * set moon name.
   */
  private void setName(String newName) {
    if (newName == null || newName.isEmpty()) {
      throw new IllegalArgumentException("Name must not be null or empty");
    }
    this.name = newName;
  }

  /**
   * return radius.
   */
  public int getAvgRadiusInKm() {
    return avgRadiusInKm;
  }

  /**
   * set radius.
   */
  private void setAvgRadiusInKm(int radius) {
    if (radius < 6 || radius > 10000) {
      throw new IllegalArgumentException("Radius must be between 6 and 10000");
    }
    this.avgRadiusInKm = radius;
  }

  @Override
  public String toString() {
    return "Moon: " + getName() + ", average radius " + getAvgRadiusInKm() + "km";
  }

  /**
   * findbugs.
   */
  protected final void finalize() {
  }  
}
