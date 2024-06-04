package assignmenttwo.solitares;

/**
 * class for planets name and radius.
 */
public class Planet {

  private String name;
  private int avgRadiusInKm;

  /**
   * name and radius.
   */
  public Planet(String name, int avgRadiusInKm) {
    setName(name);
    setAvgRadiusInKm(avgRadiusInKm);
  }

  /**
   * return name of planet.
   */
  public String getName() {
    return name;
  }

  /**
   * set the name of planet.
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
   * set the radius.
   */
  private void setAvgRadiusInKm(int radius) {
    if (radius < 2000 || radius > 200000) {
      throw new IllegalArgumentException("Radius must be between 2000 and 200000");
    }
    this.avgRadiusInKm = radius;
  }

  @Override
  public String toString() {
    return "Planet: " + getName() + " average radius " + getAvgRadiusInKm() + "km";
  }

  /**
   * findbugs.
   */
  protected final void finalize() {
  }
  
}