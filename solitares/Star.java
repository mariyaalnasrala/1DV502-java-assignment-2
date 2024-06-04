package assignmenttwo.solitares;

/**
 * class for stars.
 */
public class Star {
  private String name;
  private int avgRadiusInKm;

  /**
   * name and radius.
   */
  public Star(String name, int avgRadiusInKm) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
  }

  /**
   * return name.
   */
  public String getName() {
    return name;
  }

  /**
   * set name.
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
    if (radius < 16700) {
      throw new IllegalArgumentException("Radius must be larger than 16699");
    }
    this.avgRadiusInKm = radius;
  }

  @Override
  public String toString() {
    return "Star: " + getName() + "average radius " + getAvgRadiusInKm() + "km";
  }

  /**
   * findbugs.
   */
  protected final void finalize() {
  }
  
}
