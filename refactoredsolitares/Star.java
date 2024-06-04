package assignmenttwo.refactoredsolitares;

/**
 * star class.
 */
public class Star extends HeavenlyBody {

  /**
   * name and radius.
   */
  public Star(String name, int avgRadiusInKm) {
    super(name, avgRadiusInKm);
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name can not be null or empty");
    }
  }

  @Override
  protected void checkAvgRadiusInKm(int radius) {
    if (radius < 16700) {
      throw new IllegalArgumentException("Radius can not be smaller than 16 700 km");
    }
  }

  @Override
  protected void setAvgRadiusInKm(int radius) {
    checkAvgRadiusInKm(radius);
    super.setAvgRadiusInKm(radius);
  }

  /**
   * String.
   */

  public String toString() {
    return "Star: " + super.toString();
  }
}
