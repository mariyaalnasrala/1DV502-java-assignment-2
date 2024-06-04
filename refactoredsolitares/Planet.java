package assignmenttwo.refactoredsolitares;

/**
 * planet class.
 */
public class Planet extends HeavenlyBody {
  /**
   * name and radius for planet.
   */
  public Planet(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be null or empty");
    }
  }

  @Override
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 2000 || radius > 200000) {
      throw new IllegalArgumentException("Radius must be between 2000 and 200 000 km");
    }
  }

  @Override
  protected void setAvgRadiusInKm(int radius) {
    checkAvgRadiusInKm(radius);
    super.setAvgRadiusInKm(radius);
  }

  /**
   * string.
   */
  public String toString() {
    return "Planet: " + super.toString();
  }
}
