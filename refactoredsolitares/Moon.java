package assignmenttwo.refactoredsolitares;

/**
 * Moons class.
 */
public class Moon extends HeavenlyBody {
  /**
   * name and radius.
   */
  public Moon(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name must not be empty or empty");
    }
  }

  @Override
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 6 || radius > 10000) {
      throw new IllegalArgumentException("Radius must be between 6 and 10 000 km");
    }
  }

  @Override
  protected void setAvgRadiusInKm(int radius) {
    checkAvgRadiusInKm(radius);
    super.setAvgRadiusInKm(radius);
  }

  /**
   * string method.
   */
  public String toString() {
    return "Moon: " + super.toString();
  }
}
